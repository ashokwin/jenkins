package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	@Before
	
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Workspace\\demo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void afterClass() {
		driver.close();
		driver.quit();
	}
}
