package com.telecom.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
static WebDriver driver;
	
	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "D:\\Ecllipse\\Ec_test\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/telecom/");
		System.out.println("Before every scenario");
	}
	
	@After
	public void afterScenario() {
		driver.close();
		System.out.println("After every scenario");
	}
}
