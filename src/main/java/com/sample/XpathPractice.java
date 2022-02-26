package com.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		driver.close();*/
		
		/*PartialApproach*/
		//driver.findElement(By.xpath("//input[starts-with(@id,'txtUsername')]")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[starts-with(@id,'txtPassword')]")).sendKeys("admin123");
		//driver.findElement(By.xpath("//input[contains(@name,'Submit')]")).click();
		//driver.close();
		
		/* Text Approach*/
		//taganame[text()='textvalue']
		//driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		//tagname[text()[contains(.,'textvalue')]]
		//driver.findElement(By.xpath("//a[text()[contains(.,'Forgot your password?')]]")).click();
		//driver.close();
		
		/*collection approach*/
		//(//tagname[@attribute='attributevalue'])[indexnumber]
		//driver.findElement(By.xpath("(//a[@type='text'])[3]")).click();		
		
		/*And Approach*/
		//driver.findElement(By.xpath("//input[@id='txtUsername' and @name='txtUsername'] ")).sendKeys("admin");
		
		/* parent child approach*/
		//driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("admin123");
		
		/*child to parent approach*/
		/*syntax1:
childxpath/..

syntax2:
childxpath/parent::parent tagname*/
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	driver.findElement(By.xpath("//input[@id='txtUsername']/..")).sendKeys("admin123");;
		//driver.findElement(By.xpath("//input[@name='txtPassword']/parent::div")).sendKeys("admin");
	}

}
