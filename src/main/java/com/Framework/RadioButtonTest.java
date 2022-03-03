package com.Framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonTest {
	@Test(invocationCount = 3,invocationTimeOut = 30000000,groups= {"smoke"})
	public void radioButtonHandling() {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	WebElement checkBox = driver.findElementByXPath("//label[contains(text(),'Sports')]");
	System.out.println(checkBox.isDisplayed());
	System.out.println(checkBox.isEnabled());
	System.out.println(checkBox.isSelected());
	
	WebElement radioButton = driver.findElementByXPath("//label[contains(text(),'Male')]");
	System.out.println(radioButton.isEnabled());
	System.out.println(radioButton.isDisplayed());
	System.out.println(radioButton.isSelected());
	driver.close();
}
}
