package com.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMove {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement username = driver.findElementByXPath("//input[@id='txtUsername']");
		WebElement password = driver.findElementByXPath("//input[@id='txtPassword']");
		WebElement loginButton = driver.findElementByXPath("//input[@id='btnLogin']");
		Actions a=new Actions(driver);
		a.sendKeys(username, "Admin").build().perform();
		a.sendKeys(password, "admin123").build().perform();
		a.moveToElement(loginButton).click().build().perform();
		WebElement time = driver.findElementByXPath("//b[text()='Time']");
		WebElement attendance = driver.findElementByXPath("//a[text()='Attendance']");
		WebElement employueeRecords = driver.findElementByXPath("//a[text()='Employee Records']");
		a.moveToElement(time).moveToElement(attendance).moveToElement(employueeRecords).click().build().perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
