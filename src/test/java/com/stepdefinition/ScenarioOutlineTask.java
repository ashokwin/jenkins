   package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutlineTask {
	
	@Given("The user is in an telecom website")
	public void the_user_is_in_an_telecom_website() {
		
		Hooks.driver.get("http://www.demo.guru99.com/telecom/");
	}

	@Given("The user click on add the tariff plan")
	public void the_user_click_on_add_the_tariff_plan() throws InterruptedException {
		   Thread.sleep(4000);
		   Hooks.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();

	}

	@When("The user is filling all the data{string},{string},{string},{string},{string},{string},{string}")
	public void the_user_is_filling_all_the_data(String monthlyrental, String freelocalmin, String freeinternataionalmin, String freesmspack, String localperminschrge,String internatinalpermin, String smscharge) {
		
		Hooks.driver.findElement(By.id("rental1")).sendKeys(monthlyrental);

		Hooks.driver.findElement(By.id("local_minutes")).sendKeys(freelocalmin);

		Hooks.driver.findElement(By.id("inter_minutes")).sendKeys(freeinternataionalmin);

		Hooks.driver.findElement(By.id("sms_pack")).sendKeys(freesmspack);

		Hooks.driver.findElement(By.id("minutes_charges")).sendKeys(localperminschrge);

		Hooks.driver.findElement(By.id("inter_charges")).sendKeys(internatinalpermin);

		Hooks.driver.findElement(By.id("sms_charges")).sendKeys(smscharge);
	}

	@When("The user click the submit Button")
	public void the_user_click_the_submit_Button() throws InterruptedException {
//
		Hooks.driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("The user should see the Congratulation you Add Tariff Plan message")
	public void the_user_should_see_the_Congratulation_you_Add_Tariff_Plan_message() {
	Assert.assertTrue(Hooks.driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}


}
