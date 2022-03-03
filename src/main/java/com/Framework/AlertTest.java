package com.Framework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertTest {
	@Test(alwaysRun = true,groups = {"regression"})
	public void alertHandling() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	driver.manage().window().maximize();
	WebElement simpleAlert = driver.findElementByXPath("//*[@name='alert']");
	simpleAlert.click();
	Alert a = driver.switchTo().alert();
	Thread.sleep(3000);
	a.accept();
	
	WebElement confirmAlert = driver.findElementByXPath("//*[@name='confirmation']");
	confirmAlert.click();
	Thread.sleep(3000);
	//a.accept();
	a.dismiss();
	
	WebElement promptAlert = driver.findElementByXPath("//*[@name='prompt']");
	promptAlert.click();
	Thread.sleep(3000);
	a.sendKeys("Manju");
	Thread.sleep(3000);
	a.accept();
}
}
