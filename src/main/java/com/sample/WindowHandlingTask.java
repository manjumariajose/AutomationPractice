package com.sample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingTask {
public static String parent,secondWindow,facebook,twitter;
public static Set<String> windows;
public static Iterator<String> it;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		driver.findElementByXPath("//*[@id='firstName']").sendKeys("Manju");
		driver.findElementByXPath("//*[@id='lastName']").sendKeys("Jose");
		parent=driver.getWindowHandle();
		driver.findElementByXPath("//a[@class='pEight']").click();
	windows = driver.getWindowHandles();
		 it = windows.iterator();
		 while (it.hasNext()) {
				secondWindow = it.next();
				if (!parent.equals(secondWindow)) {
					driver.switchTo().window(secondWindow);
				}
			}
		 driver.findElementByXPath("//img[starts-with(@alt,'Facebook')]").click();
		 windows = driver.getWindowHandles();
		 it = windows.iterator();
		 while (it.hasNext()) {
				facebook = it.next();
				if (!parent.equals(facebook)) {
					driver.switchTo().window(facebook);
				}
			}
		 Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("Facebook*******");
		driver.switchTo().window(secondWindow);
		WebElement element = driver.findElement(By.xpath("//img[starts-with(@alt,'Twitter')]"));
		
		
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,500)");
		element.click();
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
		System.out.println("twitter******");
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("parent*****");
driver.quit();
	}

}
