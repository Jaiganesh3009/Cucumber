package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.Commonactions;

public class AddTariffPlanPage extends Commonactions {
	
	public AddTariffPlanPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement TariffBtn;
	
	@FindBy(xpath="(//label[@for='done'])[1]")
	private WebElement doneBtn;
	
	@FindBy(name="rental")
	private WebElement rental;
	
	@FindBy(name="local_minutes")
	private WebElement localMin;
	
	@FindBy(name="inter_minutes")
	private WebElement interMin;
	
	@FindBy(name="sms_pack")
	private WebElement smsPack;
	
	@FindBy(name="minutes_charges")
	private WebElement minChrg;
	
	@FindBy(name="inter_charges")
	private WebElement interChrg;
	
	@FindBy(name="sms_charges")
	private WebElement smsChrg;

	@FindBy(name="submit")
	private WebElement submitBtn;
	
	@FindBy(xpath="//h2[text()='Congratulation you add Tariff Plan']")
	private WebElement finalMessg;
	

	public WebElement getTariffBtn() {
		return TariffBtn;
	}

	public WebElement getDoneBtn() {
		return doneBtn;
	}

	public WebElement getRental() {
		return rental;
	}

	public WebElement getLocalMin() {
		return localMin;
	}

	public WebElement getInterMin() {
		return interMin;
	}

	public WebElement getSmsPack() {
		return smsPack;
	}

	public WebElement getMinChrg() {
		return minChrg;
	}

	public WebElement getInterChrg() {
		return interChrg;
	}

	public WebElement getSmsChrg() {
		return smsChrg;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getFinalMessg() {
		return finalMessg;
	}
	
	

}
