package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		WebElement bootDropDown = driver.findElement(By.xpath("//*[@id='menu1']"));
		bootDropDown.click();
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		try {
		for(WebElement each:all)
		{
			if(each.getText().equals("JavaScript"))
			{
				each.click();
			}
			
		}
		}
		catch(Exception e) {
			
		}
		

	}

}
