package com.telecom.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCustomerSteps {
	
	static WebDriver driver;
	
	@Given("User launches telecom application")
	public void user_launches_telecom_application() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ecllipse\\Ec_test\\Cucumber\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://www.demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	}

	@Given("User navigates into add customer page")
	public void user_navigates_into_add_customer_page() throws InterruptedException {
		
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    Thread.sleep(5000);
	    driver.switchTo().frame("flow_close_btn_iframe");
	    driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
	    driver.switchTo().defaultContent();
	}

	@When("User enters all the fields")
	public void user_enters_all_the_fields() {
		
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys("jai");
		driver.findElement(By.id("lname")).sendKeys("ganesh");
		driver.findElement(By.id("email")).sendKeys("jai@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("Chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("9876543210");
	    
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	    
	}

	@Then("User should be displayed customer id is generated")
	public void user_should_be_displayed_customer_id_is_generated() {
		
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	    
	
}
}