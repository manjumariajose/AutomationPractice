package com.sample;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {
public static int i=0;
public static ChromeDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ScreenshotExample ssExample=new ScreenshotExample();
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//*[@id='txtUsername']").sendKeys("admin");
		Thread.sleep(3000);
		ssExample.takeScreenShpt();
		driver.findElementByXPath("//*[@id='txtPassword']").sendKeys("admin123");
		Thread.sleep(3000);
		ssExample.takeScreenShpt();
		driver.findElementByXPath("//*[@name='Submit']").click();
		Thread.sleep(3000);
		ssExample.takeScreenShpt();
		driver.close();

	}
	public void takeScreenShpt() throws IOException {
		Random r=new Random();
		if(r.nextInt()!=0) {
			i=i+1;
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest= new File(".//images//pic"+i+".png");
			FileUtils.copyFileToDirectory(src, dest);
		}
		
	}

}
