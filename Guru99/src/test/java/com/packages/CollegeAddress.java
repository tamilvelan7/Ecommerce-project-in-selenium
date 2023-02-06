package com.packages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.Macys.base.Utils;

public class CollegeAddress extends Utils{
	
	@Test
	public static void address() throws Exception {
	System.setProperty(Chrome_Browser, Chrome_path);
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	//without getting address stored in this list
	LinkedList<String> name=new LinkedList();
	
	//read the data in excel file
	File newPath=new File(path1);
	FileInputStream file=new FileInputStream(newPath);
	Workbook wk=new XSSFWorkbook(file);
	Sheet sheet = wk.getSheet("Colleges list");
	int rows = sheet.getPhysicalNumberOfRows();
	
	//using for loop to get the all college address
	for(int i=1;i<rows-1;i++) {
		String value="";
		//It will throw some exception of I am using try catch
		try {
		value = sheet.getRow(i).getCell(1).getStringCellValue();
		driver.findElement(By.name("q")).sendKeys(value+Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='q']")).clear();
		String address = driver.findElement(By.xpath("//a[text()='Address']//following::span[2]")).getText();
		
		//college address printing here
		System.out.println(address);
		
		//address stored in excel file 
		sheet.getRow(i).createCell(3).setCellValue(address);
		}
		//catch block address is not found it stored in list
		catch(Exception e) {
			name.add(value);
		}
	}
	
	System.out.println("----------------------------------");
	//It will print the not founded address
	for (String college : name) {
		System.out.println(college);
	}
	FileOutputStream writeFile=new FileOutputStream(newPath);
	wk.write(writeFile);
	writeFile.close();
	driver.close();
	}
}
