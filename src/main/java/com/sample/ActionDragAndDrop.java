package com.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement source = driver.findElementByXPath("//*[@id='draggable']");
		WebElement dest = driver.findElementByXPath("//*[@id='droppable']");
		Actions a=new Actions(driver);
		a.dragAndDrop(source, dest).build().perform();
	}

}
