package com.sample;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//To scroll until the webelement
		WebElement adressbox = driver.findElementByXPath("//*[@name='email']");
		js.executeScript("arguments[0].scrollIntoView();", adressbox);
		Thread.sleep(3000);
		//Horizontal Scroll
		js.executeScript("window.scrollBy(1000,0)");
		Thread.sleep(3000);
		//vertical scroll
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(3000);
		//scroll down
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(3000);
		//scroll up
		js.executeScript("window.scrollBy(0,-1500)", "");
		Thread.sleep(3000);
		driver.close();
	}

}
