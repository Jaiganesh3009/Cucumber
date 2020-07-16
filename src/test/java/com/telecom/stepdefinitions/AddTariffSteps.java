package com.telecom.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.telecom.objectrepository.AddTariffPlanPage;
import com.telecom.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffSteps extends Commonactions{
	
	Commonactions ca = new Commonactions();
	AddTariffPlanPage atp = new AddTariffPlanPage();
	
	@Given("User navigate into tariff plan page")
	public void user_navigate_into_tariff_plan_page() {
		ca.clickBtn(atp.getTariffBtn());
	}

	public void handleFrame() throws InterruptedException {
		
		Thread.sleep(10000);
		Hooks.driver.switchTo().frame("flow_close_btn_iframe");
		Hooks.driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		Hooks.driver.switchTo().defaultContent();

	}

	@When("User fills all the fields by using 2dimen list")
	public void user_fills_all_the_fields_by_using_2dimen_list(DataTable datal) throws InterruptedException {
		
		handleFrame();
		List<List<String>> plan = datal.asLists();

		ca.insertText(atp.getRental(),plan.get(2).get(0));
		ca.insertText(atp.getLocalMin(),plan.get(0).get(1));
		ca.insertText(atp.getInterMin(),plan.get(3).get(2));
		ca.insertText(atp.getSmsPack(),plan.get(0).get(3));
		ca.insertText(atp.getMinChrg(),plan.get(1).get(4));
		ca.insertText(atp.getInterChrg(),plan.get(3).get(5));
		ca.insertText(atp.getSmsChrg(),plan.get(2).get(6));
	}

	@When("User fills all the fields by using 2dimen map")
	public void user_fills_all_the_fields_by_using_2dimen_map(DataTable datam) throws InterruptedException {
		handleFrame();
		List<Map<String, String>> planDetails = datam.asMaps();
		
		ca.insertText(atp.getRental(),planDetails.get(0).get("rental"));
		ca.insertText(atp.getLocalMin(),planDetails.get(3).get("local_minutes"));
		ca.insertText(atp.getInterMin(),planDetails.get(2).get("inter_minutes"));
		ca.insertText(atp.getSmsPack(),planDetails.get(0).get("sms_pack"));
		ca.insertText(atp.getMinChrg(),planDetails.get(1).get("minutes_charges"));
		ca.insertText(atp.getInterChrg(),planDetails.get(3).get("inter_charges"));
		ca.insertText(atp.getSmsChrg(),planDetails.get(2).get("sms_charges"));
	
	}
	
	@When("User fills all of the fields {string},{string},{string},{string},{string},{string},{string},")
	public void user_fills_all_of_the_fields(String rental, String local, String inter, String sms, String minutecharge, String intercharge, String smscharge) throws InterruptedException {
		
		handleFrame();

		ca.insertText(atp.getRental(),rental);
		ca.insertText(atp.getLocalMin(),local);
		ca.insertText(atp.getInterMin(),inter);
		ca.insertText(atp.getSmsPack(),sms);
		ca.insertText(atp.getMinChrg(),minutecharge);
		ca.insertText(atp.getInterChrg(),intercharge);
		ca.insertText(atp.getSmsChrg(),smscharge);

	}
	
	@When("User clicks on Tariff submit button")
	public void user_clicks_on_Tariff_submit_button() {
	    ca.clickBtn(atp.getSubmitBtn());
	}

	@Then("User is displayed with message tariff plan created")
	public void user_is_displayed_with_message_tariff_plan_created() throws InterruptedException {
		handleFrame();
		Assert.assertTrue(atp.getFinalMessg().isDisplayed());
	}

}
