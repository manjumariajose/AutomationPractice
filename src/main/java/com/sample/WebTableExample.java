package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//table[@id='countries']");
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for (int i = 2; i < rows.size(); i++) {
			List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cells.size(); j++) {
				String name = "";
				name = cells.get(j).getText();
				if (name.equalsIgnoreCase("Angola")) {
					WebElement ckbox = cells.get(j).findElement(By.xpath("(//*[@type='checkbox'])[5]"));
					ckbox.click();
					if (ckbox.isSelected()) {
						System.out.println("chekbox for " + name + " is selected");

					}

				}
			}
		}

	}

}
