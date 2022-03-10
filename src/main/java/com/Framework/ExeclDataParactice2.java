package com.Framework;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExeclDataParactice2 {
	public static ChromeDriver driver;
	@Test(dataProvider="delhi")
	public void orangeHrmLogin(String user,String password)
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}
				 @DataProvider(name="delhi")
					public static Object[][] getSheet() {		
			
						Object[][] data = null ;
			
							try {			
							XSSFWorkbook workbook = new XSSFWorkbook(".//data//OrangeHRMLoginData.xlsx");
								XSSFSheet sheet = workbook.getSheetAt(0);	
				 
							// get the number of rows\n" + 
							int rowCount = sheet.getLastRowNum();
								// get the number of columns\n" + 
							int columnCount = sheet.getRow(0).getLastCellNum();
				
								data = new String[rowCount][columnCount];
				
					// loop through the rows\n" + 
							for(int i=1; i <rowCount+1; i++){
									try {
										XSSFRow row = sheet.getRow(i);
										for(int j=0; j <columnCount; j++){ // loop through the columns\n" + 
											try {
												String cellValue = ""; 
												try{
												cellValue = row.getCell(j).getStringCellValue();
											}catch(NullPointerException e){
				
											}
												data[i-1][j]  = cellValue; // add to the data array\n" + 
											} catch (Exception e) {
												e.printStackTrace();
											}				
										}
			 
								} catch (Exception e) {
										e.printStackTrace();
									}
								}	
							workbook.close();
							} catch (Exception e) {
								e.printStackTrace();
							}

							return data;
}
}
