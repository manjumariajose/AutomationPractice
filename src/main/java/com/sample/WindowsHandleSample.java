package com.sample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleSample {
	public static String parent,linkedin,facebook,twitter;
	public static Set<String> all;
	public static Iterator<String> i;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='social-icons']/a[1]/img")).click();
		all = driver.getWindowHandles();
		i = all.iterator();
		while(i.hasNext())
		{
			linkedin=i.next();
			if(!parent.equals(linkedin))
			{
				driver.switchTo().window(linkedin);
			}
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dummy@gmail.com");
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		System.out.println(driver.getTitle());
		all = driver.getWindowHandles();
		i = all.iterator();
		while(i.hasNext())
		{
			facebook=i.next();
			if(!parent.equals(facebook))
			{
				driver.switchTo().window(facebook);
			}
		}
		System.out.println(driver.getCurrentUrl()); 
		System.out.println(driver.getTitle());
		driver.switchTo().window(linkedin);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("rama");
		driver.switchTo().window(facebook);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("facebookuser");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rama");
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();

			}

		
	}


