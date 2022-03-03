package com.Framework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest  {
	@Test
	public void GoogleLink() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
}
