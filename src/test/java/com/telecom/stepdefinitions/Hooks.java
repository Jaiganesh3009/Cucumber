package com.telecom.stepdefinitions;

import com.telecom.resources.Commonactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions{
		
	Commonactions ca = new Commonactions();
	@Before
	public void beforeScenario() {
		ca.launch("http://www.demo.guru99.com/telecom/");
		System.out.println("Before every scenario");
	}
	
	@After
	public void afterScenario() {
		driver.quit();
		System.out.println("After every scenario");
	}
}
