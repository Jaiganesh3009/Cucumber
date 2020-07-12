package com.telecom.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustSteps {
	@Given("User navigates to add customer page")
	public void user_navigates_to_add_customer_page() {
		Hooks.driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("User enters all the fields by using {int}dimen map")
	public void user_enters_all_the_fields_by_using_dimen_map(Integer int1,DataTable datas) {
		List<Map<String, String>> cusDetails = datas.asMaps();
		
		Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(cusDetails.get(0).get("fname"));
		Hooks.driver.findElement(By.id("lname")).sendKeys(cusDetails.get(2).get("lname"));
		Hooks.driver.findElement(By.id("email")).sendKeys(cusDetails.get(3).get("mail"));
		Hooks.driver.findElement(By.name("addr")).sendKeys(cusDetails.get(1).get("add"));
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get(3).get("phno"));
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		Hooks.driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	
	}

	@Then("User is displayed customer id is generated")
	public void user_is_displayed_customer_id_is_generated() {
		Assert.assertTrue(Hooks.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}

	@When("User enters all the fields by using {int}dimen list")
	public void user_enters_all_the_fields_by_using_dimen_list(Integer int1, DataTable datas) {
		List<List<String>> cusDetails = datas.asLists();

		Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(cusDetails.get(0).get(0));
		Hooks.driver.findElement(By.id("lname")).sendKeys(cusDetails.get(1).get(3));
		Hooks.driver.findElement(By.id("email")).sendKeys(cusDetails.get(2).get(2));
		Hooks.driver.findElement(By.name("addr")).sendKeys(cusDetails.get(3).get(1));
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get(3).get(4));
	
	}

	@When("User enter all the fields {string},{string},{string},{string},{string}")
	public void user_enter_all_the_fields(String fname, String lname, String mail, String add, String phno) {
		Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(fname);
		Hooks.driver.findElement(By.id("lname")).sendKeys(lname);
		Hooks.driver.findElement(By.id("email")).sendKeys(mail);
		Hooks.driver.findElement(By.name("addr")).sendKeys(add);
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys(phno);
	     
	
	
	}


}