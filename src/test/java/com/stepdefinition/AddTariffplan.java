package com.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffplan  {
	

	
	//one dimensional list
	
	@Given("The user is in an telecom Homepage")
	public void the_user_is_in_telecom_Homepage() {
		
	   Hooks.driver.get("http://www.demo.guru99.com/telecom/");
	}
	   
	   @Given("The user click on add tariff plan")
	   public void the_user_click_on_add_tariff_plan() {
		   Hooks.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	       
	   }

	   @When("The user is filling all the field")
	   public void the_user_is_filling_all_the_field(DataTable custdetails) throws Throwable {
		   List<List<String>> custdet = custdetails.asLists(String.class);
		   
		   Hooks.driver.findElement(By.id("rental1")).sendKeys(custdet.get(1).get(3));
		   //
		   Hooks.driver.findElement(By.id("local_minutes")).sendKeys(custdet.get(2).get(2));
		   //
		   Hooks.driver.findElement(By.id("inter_minutes")).sendKeys(custdet.get(0).get(1));
		   //
		   Hooks.driver.findElement(By.id("sms_pack")).sendKeys(custdet.get(1).get(4));
		   //
		   Hooks.driver.findElement(By.id("minutes_charges")).sendKeys(custdet.get(3).get(2));
		   //
		   Hooks.driver.findElement(By.id("inter_charges")).sendKeys(custdet.get(2).get(1));
		   //
		   Hooks.driver.findElement(By.id("sms_charges")).sendKeys(custdet.get(0).get(2));
		  
	       
	   }
		   
		   

	   @When("The user clicks submit button")
		public void the_user_click_on_submit_button() throws Exception {
			Thread.sleep(2000);
			Hooks.driver.findElement(By.xpath("//input[@type='submit']")).click();
		    
		}

	   @Then("The user should see the Congratulation you add Tariff Plan message")
	   public void the_user_should_see_the_Congratulation_you_add_Tariff_Plan_message() {
		   Assert.assertTrue(Hooks.driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	   }



}
