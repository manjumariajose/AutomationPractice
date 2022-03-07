package com.Framework;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportTest1 {
	 
		 public static ChromeDriver driver;
		 public static int i=0;
		 public static ExtentReports report;
		 public static ExtentTest test;

		 @BeforeSuite
		 public void begin()
		 {
		 	report=new ExtentReports(".//reports//HrmappReport.html",true);
		 	report.addSystemInfo("Envionment", "QA");
		 	report.addSystemInfo("Author", "Manju");
		 	report.addSystemInfo("userStory", "US10234");
		 	 test = report.startTest("To verify HRM loginpage working with valid credentials");
		 }

		       @Test
		 	public void loginPageHRM() throws IOException {
		 		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver");
		 driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		 test.log(LogStatus.PASS, "Entered UserName"+test.addScreenCapture(snap()));
		 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		 test.log(LogStatus.PASS, "Entered Password"+test.addScreenCapture(snap()));
		 driver.findElement(By.xpath("//input[@name='Submit']")).click();
		 test.log(LogStatus.PASS, "ClickedLoginbutton"+test.addScreenCapture(snap()));
		 driver.close();
		 	}
		 	
		 	
		 	public String snap() throws IOException
		 	{
		 		Random r=new Random();
		 		String dummy="";
		 		if(r.nextInt()!=0)
		 		{
		 			i=i+1;
		 		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 		File dest=new File(".//images//pic"+i+".png");
		 		FileUtils.copyFile(src, dest);
		 		dummy=dest.getAbsolutePath();
		 		}
		 		return dummy;
		 	}

		 	@AfterSuite
		 	public void finsh()
		 	{
		 		report.endTest(test);
		 		report.flush();
		 	}
}
