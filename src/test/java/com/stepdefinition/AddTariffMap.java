package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffMap  {

	// one dimensional Map


	@Given("The user is in an telecom page")
	public void the_user_is_in_an_telecom_page() {

		
		Hooks.driver.get("http://www.demo.guru99.com/telecom/");

	}

	@Given("The user click the add tariff plan")
	public void the_user_click_the_add_tariff_plan() {
		Hooks.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();

	}

	@When("The user is filling all the datas")
	public void the_user_is_filling_all_the_datas(DataTable Custdetails) {

		List<Map<String, String>> custdeta = Custdetails.asMaps(String.class,String.class);

		Hooks.driver.findElement(By.id("rental1")).sendKeys(custdeta.get(1).get("monthy rental"));

		Hooks.driver.findElement(By.id("local_minutes")).sendKeys(custdeta.get(2).get("Free loc min"));

		Hooks.driver.findElement(By.id("inter_minutes")).sendKeys(custdeta.get(0).get("Free Intern min"));

		Hooks.driver.findElement(By.id("sms_pack")).sendKeys(custdeta.get(3).get("Free sms"));

		Hooks.driver.findElement(By.id("minutes_charges")).sendKeys(custdeta.get(3).get("local per min"));

		Hooks.driver.findElement(By.id("inter_charges")).sendKeys(custdeta.get(2).get("Intern per min"));

		Hooks.driver.findElement(By.id("sms_charges")).sendKeys(custdeta.get(1).get("sms per charges"));

	}

	@When("The user click the submit button")
	public void the_user_click_the_submit_button() throws Exception {
		//
		Hooks.driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("The user should see the Congratulation you add Tariff Plan messages")
	public void the_user_should_see_the_Congratulation_you_add_Tariff_Plan_messages() {
		Assert.assertTrue(Hooks.driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}

} 
