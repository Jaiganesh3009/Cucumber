package com.telecom.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
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
			
			//handleFrame();
			driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		    
		}
		
		public void handleFrame() throws InterruptedException {
			
			Thread.sleep(10000);
			driver.switchTo().frame("flow_close_btn_iframe");
			driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
			driver.switchTo().defaultContent();

		}

		@When("User enters all the fields")
		public void user_enters_all_the_fields() throws InterruptedException {
			
			handleFrame();
			
			driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			driver.findElement(By.id("fname")).sendKeys("jai");
			driver.findElement(By.id("lname")).sendKeys("ganesh");
			driver.findElement(By.id("email")).sendKeys("jai@gmail.com");
			driver.findElement(By.name("addr")).sendKeys("chennai");
			driver.findElement(By.id("telephoneno")).sendKeys("9876543210");
		    
		}
		
		@When("User enters all the fields by using 1dim list")
		public void user_enters_all_the_fields_by_using_1dim_list(DataTable datas) throws InterruptedException {
		    
			handleFrame();
			List<String> cusDetails = datas.asList();

			driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			driver.findElement(By.id("fname")).sendKeys(cusDetails.get(0));
			driver.findElement(By.id("lname")).sendKeys(cusDetails.get(1));
			driver.findElement(By.id("email")).sendKeys(cusDetails.get(2));
			driver.findElement(By.name("addr")).sendKeys(cusDetails.get(3));
			driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get(4));
			
		}
		
		@When("User enters all the fields by using 1dim map")
		public void user_enters_all_the_fields_by_using_1dim_map(DataTable datas) throws InterruptedException {
		    
			handleFrame();

			Map<String, String> cusDetails = datas.asMap(String.class, String.class);
			
			driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			driver.findElement(By.id("fname")).sendKeys(cusDetails.get("fname"));
			driver.findElement(By.id("lname")).sendKeys(cusDetails.get("lname"));
			driver.findElement(By.id("email")).sendKeys(cusDetails.get("mail"));
			driver.findElement(By.name("addr")).sendKeys(cusDetails.get("add"));
			driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get("phno"));
			
		}

		@When("User enters all the fields by using 2dim list")
		public void user_enters_all_the_fields_by_using_2dim_list(DataTable datas) throws InterruptedException {
		    
			handleFrame();
			List<List<String>> cusDetails = datas.asLists();

			driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			driver.findElement(By.id("fname")).sendKeys(cusDetails.get(0).get(0));
			driver.findElement(By.id("lname")).sendKeys(cusDetails.get(1).get(3));
			driver.findElement(By.id("email")).sendKeys(cusDetails.get(2).get(2));
			driver.findElement(By.name("addr")).sendKeys(cusDetails.get(3).get(1));
			driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get(3).get(4));
			
		}

		@When("User enters all the fields by using 2dim map")
		public void user_enters_all_the_fields_by_using_2dim_map(DataTable datas) throws InterruptedException {
		    
			handleFrame();

			List<Map<String, String>> cusDetails = datas.asMaps();
			
			driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			driver.findElement(By.id("fname")).sendKeys(cusDetails.get(0).get("fname"));
			driver.findElement(By.id("lname")).sendKeys(cusDetails.get(2).get("lname"));
			driver.findElement(By.id("email")).sendKeys(cusDetails.get(3).get("mail"));
			driver.findElement(By.name("addr")).sendKeys(cusDetails.get(1).get("add"));
			driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get(3).get("phno"));
			
		}
		
		@When("User enters all the fields {string},{string},{string},{string},{string}")
		public void user_enters_all_the_fields(String fname, String lname, String mail, String add, String phno) throws InterruptedException {
			
			handleFrame();
		
			driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			driver.findElement(By.id("fname")).sendKeys(fname);
			driver.findElement(By.id("lname")).sendKeys(lname);
			driver.findElement(By.id("email")).sendKeys(mail);
			driver.findElement(By.name("addr")).sendKeys(add);
			driver.findElement(By.id("telephoneno")).sendKeys(phno);
		   
		}
		
		
		@When("User click on submit button")
		public void user_click_on_submit_button() {
			
			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		    
		}

		@Then("User should be displayed customer id is generated")
		public void user_should_be_displayed_customer_id_is_generated() throws InterruptedException {
			
			handleFrame();
			
			Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
			driver.quit();
		}

	}