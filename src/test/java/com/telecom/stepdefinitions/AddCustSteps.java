package com.telecom.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.telecom.objectrepository.AddCustomerPage;
import com.telecom.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustSteps extends Commonactions{
	
	Commonactions ca = new Commonactions();
	AddCustomerPage acp = new AddCustomerPage();
	
	@Given("User navigates to add customer page")
	public void user_navigates_to_add_customer_page() throws InterruptedException {
		
		//handleFrame();
		ca.clickBtn(acp.getCustomerBtn());	
	}
	
	public void handleFrame() throws InterruptedException {
		
		Thread.sleep(10000);
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		driver.switchTo().defaultContent();

	}

	@When("User enters all the fields by using 2dimen map")
	public void user_enters_all_the_fields_by_using_dimen_map(DataTable datas) throws InterruptedException {
	
		handleFrame();
		
		List<Map<String, String>> cusDetails = datas.asMaps();
		
		ca.clickBtn(acp.getDoneBtn());
		ca.insertText(acp.getFirstName(), cusDetails.get(0).get("fname"));
		ca.insertText(acp.getLastName(), cusDetails.get(2).get("lname"));
		ca.insertText(acp.getMail(), cusDetails.get(3).get("mail"));
		ca.insertText(acp.getAddress(), cusDetails.get(1).get("add"));
		ca.insertText(acp.getPhno(), cusDetails.get(3).get("phno"));
	}

	@When("User enters all the fields by using 2dimen list")
	public void user_enters_all_the_fields_by_using_dimen_list(DataTable datas) throws InterruptedException  {

		handleFrame();
		
		List<List<String>> cusDetails = datas.asLists();

		ca.clickBtn(acp.getDoneBtn());
		ca.insertText(acp.getFirstName(), cusDetails.get(0).get(0));
		ca.insertText(acp.getLastName(),cusDetails.get(1).get(3));
		ca.insertText(acp.getMail(),cusDetails.get(2).get(2));
		ca.insertText(acp.getAddress(),cusDetails.get(3).get(1));
		ca.insertText(acp.getPhno(),cusDetails.get(3).get(4));
	
	}

	@When("User enter all the fields {string},{string},{string},{string},{string}")
	public void user_enter_all_the_fields(String fname, String lname, String mail, String add, String phno) throws InterruptedException {
		handleFrame();
		
		ca.clickBtn(acp.getDoneBtn());
		ca.insertText(acp.getFirstName(),fname);
		ca.insertText(acp.getLastName(),lname);
		ca.insertText(acp.getMail(),mail);
		ca.insertText(acp.getAddress(),add);
		ca.insertText(acp.getPhno(),phno);
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		
		ca.clickBtn(acp.getSubmitBtn());
		
	}
	
	@Then("User is displayed customer id is generated")
	public void user_is_displayed_customer_id_is_generated() {
		Assert.assertTrue(acp.getSuccessMessage().isDisplayed());
	}
}