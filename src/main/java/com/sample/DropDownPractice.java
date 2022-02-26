package com.sample;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.getCurrentUrl();
		WebElement dropDown1=driver.findElement(By.xpath("//select[@id='first']"));
		Select s1=new Select(dropDown1);
		//s1.selectByValue("Apple");
		s1.selectByIndex(3);
		List<WebElement>opt=s1.getOptions();
		System.out.println(opt.size());
		Iterator<WebElement>it=opt.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getText());
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dropDown2=driver.findElement(By.xpath("//select[@id='animals']"));
		Select s2=new Select(dropDown2);
		s2.selectByVisibleText("Baby Cat");
		
		
		
		

	}

}
