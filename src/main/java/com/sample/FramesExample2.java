package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//b[@id='topic']//following::input")).sendKeys("Manju");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//*[@type='checkbox']")).click();
	}

}
