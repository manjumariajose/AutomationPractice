package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorexapmle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('txtUsername').value='Admin';");
		WebElement user = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		js.executeScript("arguments[0].value='Admin';", user);
		
		//js.executeScript("document.getElementById('btnLogin').click();");
		 WebElement button = driver.findElement(By.xpath("//input[@name='Submit']"));
		 js.executeScript("arguments[0].click();", button);
		
		 
		 String url="";
		 url=js.executeScript("return document.URL;").toString();
		 System.out.println(url);
		 
		 String title="";
		 title=js.executeScript("return document.title;").toString();
		 System.out.println(title);
		 Thread.sleep(3000);
		 js.executeScript("history.go(0)");
		 Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.close();

	}

}
