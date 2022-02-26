package com.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDoubleAndRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement rightclick = driver.findElementByXPath("//span[text()='right click me']");
		WebElement paste = driver.findElementByXPath("//span[text()='Paste']");
		Actions a=new Actions(driver);
		a.contextClick(rightclick).click(paste).build().perform();
		Alert a1=driver.switchTo().alert();
		String text = a1.getText();
		System.out.println(text);
		a1.accept();
		Thread.sleep(2000);
		
		WebElement doubleClickButton = driver.findElementByXPath("//button[text()='Double-Click Me To See Alert']");
		Thread.sleep(2000);
		a.doubleClick(doubleClickButton).build().perform();
		String text2 = a1.getText();
		Thread.sleep(2000);
		System.out.println(text2);
		
		a1.accept();
				
		
	}

}
