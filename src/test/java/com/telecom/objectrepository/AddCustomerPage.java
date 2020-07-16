package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.telecom.resources.Commonactions;

public class AddCustomerPage extends Commonactions {
	
	public AddCustomerPage() {
	
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement customerBtn;
	
	@FindBy(xpath="(//label[@for='done'])[1]")
	private WebElement doneBtn;
	
	@FindBy(id="fname")
	private WebElement firstName;
	
	@FindBy(id="lname")
	private WebElement lastName;
	
	@FindBy(id="email")
	private WebElement mail;
	
	@FindBy(name="addr")
	private WebElement address;
	
	@FindBy(id="telephoneno")
	private WebElement phno;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement submitBtn;
	
	@FindBy(xpath="(//td[@align='center'])[2]")
	private WebElement successMessage;

	
	
	public WebElement getCustomerBtn() {
		return customerBtn;
	}

	
	public WebElement getDoneBtn() {
		return doneBtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getSuccessMessage() {
		return successMessage;
	}


	
	
	
	
}
