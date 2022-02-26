package com.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		a.sendKeys("Manju");
		Thread.sleep(3000);
a.accept();
	}
}
