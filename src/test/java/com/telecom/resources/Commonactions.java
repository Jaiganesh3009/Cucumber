package com.telecom.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commonactions {
	
public static WebDriver driver;
	
	public void launch(String url) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ecllipse\\Ec_test\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}
	
	public void insertText(WebElement element,String value) {
		
		element.sendKeys(value);

	}
	
	public void clickBtn(WebElement element) {
        		
        element.click();
		
	}
}
