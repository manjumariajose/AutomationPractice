package com.sample;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement username = driver.findElementByXPath("//input[@id='txtUsername']");
		Actions a = new Actions(driver);
		// a.keyDown(username, Keys.SHIFT).sendKeys("manju").keyUp(username,
		// Keys.SHIFT).sendKeys("maria").build().perform();
		a.sendKeys(username, Keys.SHIFT).keyDown(Keys.SHIFT).sendKeys("manju").keyUp(Keys.SHIFT).sendKeys("maria")
				.build().perform();
		a.click(username).keyDown(Keys.COMMAND).sendKeys(Keys.DELETE).build().perform();
		//driver.manage().timeouts().implicitlyWait(time, unit)
	}

}
