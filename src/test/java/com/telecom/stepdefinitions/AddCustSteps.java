package com.telecom.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCustSteps {
static WebDriver driver;
	
	@Given("User launch telecom app")
	public void user_launch_telecom_app() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ecllipse\\Ec_test\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		
		}

		@Given("User navigates to add customer page")
		public void user_navigates_to_add_customer_page() throws InterruptedException {
			
			//handleFrame();
			driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		    
		}
		
		public void handleFrame() throws InterruptedException {
			
			Thread.sleep(10000);
			driver.switchTo().frame("flow_close_btn_iframe");
			driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
			driver.switchTo().defaultContent();

		}
	
		@When("User enter all the fields {string},{string},{string},{string},{string}")
		public void user_enter_all_the_fields(String fname, String lname, String mail, String add, String phno) throws InterruptedException {
			
			handleFrame();
		
			driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			driver.findElement(By.id("fname")).sendKeys(fname);
			driver.findElement(By.id("lname")).sendKeys(lname);
			driver.findElement(By.id("email")).sendKeys(mail);
			driver.findElement(By.name("addr")).sendKeys(add);
			driver.findElement(By.id("telephoneno")).sendKeys(phno);
		   
		}
		
		
		@When("User clicks on submit button")
		public void user_clicks_on_submit_button() {
			
			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		    
		}

		@Then("User is displayed customer id is generated")
		public void user_is_displayed_customer_id_is_generated() throws InterruptedException {
			
			handleFrame();
			
			Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
			driver.quit();
		}

}
