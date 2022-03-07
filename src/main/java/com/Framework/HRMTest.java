package com.Framework;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HRMTest extends GoogleTest {
	@Test(dependsOnMethods = "GoogleLink",groups= {"smoke"})
public void orangeHrLink() {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver");
	ChromeDriver driver=new ChromeDriver();
	String url1="https://opensource-demo.orangehrmlive.com/";
	driver.get(url1);
	String url="https://opensource-demo.orangehrmlive";
	//Assert.assertEquals(url1, url);
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(url1, url);
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.quit();;
}
}
