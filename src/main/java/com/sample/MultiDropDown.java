package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.getCurrentUrl();
		WebElement multi = driver.findElement(By.xpath("//select[@id='second']"));
		Select s=new Select(multi);
		s.selectByValue("pizza");
		s.selectByVisibleText("Burger");
		
		
	}

}
