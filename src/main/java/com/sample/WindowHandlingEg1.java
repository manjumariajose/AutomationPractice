package com.sample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingEg1 {
	public static String parent, youtube, twitter;
	public static Set<String> windows;
	public static Iterator<String> it;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		parent = driver.getWindowHandle();
		driver.findElementByXPath("//*[@id='txtUsername']").sendKeys("admin");
		driver.findElementByXPath("//*[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath("//img[starts-with(@alt,'OrangeHRM on twitter')]").click();
		windows = driver.getWindowHandles();
		it = windows.iterator();

		while (it.hasNext()) {
			twitter = it.next();
			if (!parent.equals(twitter)) {
				driver.switchTo().window(twitter);
			}
		}
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(parent);
		driver.findElementByXPath("//img[starts-with(@alt,'OrangeHRM on youtube')]").click();
		windows = driver.getWindowHandles();
		it = windows.iterator();
		while (it.hasNext()) {
			youtube = it.next();
			if (!parent.equals(youtube)) {
				driver.switchTo().window(youtube);
			}
		}

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@name='Submit']").click();
		driver.quit();
	}

}
