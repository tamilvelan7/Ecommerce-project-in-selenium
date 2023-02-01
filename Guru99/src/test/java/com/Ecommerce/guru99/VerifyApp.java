package com.Ecommerce.guru99;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.Macys.base.Utils;

public class VerifyApp {
	static WebDriver driver;
	static Select drop;
	TakesScreenshot shot;
	@Test(priority=0)
	public static void verify() {
		System.setProperty(Utils.firefor_Browser, Utils.path);
		driver = new FirefoxDriver();
		driver.get(Utils.url1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority=1)
	public static void verify1() {
		if(driver.getTitle().equals("Home page"))
			System.out.println("first test case Passed");
		driver.findElement(By.linkText("MOBILE")).click();	
	}
		
	@Test(priority=2)
	public static void verify3() {
		if(driver.getTitle().equals("Mobile"))
			System.out.println("Second test case Passed");
	}
	

	@Test(priority=3)
	public static void verify4() throws IOException {
		drop=new Select(driver.findElement(By.xpath("//select[@title='Sort By']")));
		drop.selectByVisibleText("Name");
//		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File des=new File("C:\\Users\\tamil\\eclipse-workspace\\eclipse-workspace\\com.Macys\\Test datas\\data.png");
//		FileUtils.copyFile(source, des);
	}
	
	@Test(enabled=false,dependsOnMethods = {"verify4"})
	public static void verify5() {
		String text = driver.findElement(By.xpath("//a[text()='Sony Xperia']//following::span[2]")).getText();
		driver.findElement(By.xpath("//a[text()='Sony Xperia']")).click();
		String text1=driver.findElement(By.xpath("//span[text()='$100.00']")).getText();
		if(text.equals(text1))
			System.out.println("Amount verified successfully");
		else
			System.out.println("Amount verified failed");
	}
	
	@Test(dependsOnMethods = {"verify4"})
	public static void verify6() {
		driver.findElement(By.xpath("//a[text()='Sony Xperia']//following::button[@type='button']")).click();
		driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("1000");
		driver.findElement(By.xpath("//button[@title='Update']")).click();
		String text = driver.findElement(By.xpath("//p[@class='item-msg error']")).getText();
		System.out.println("The error mgs is :"+text);
		driver.findElement(By.xpath("//span[text()='Empty Cart']")).click();
		String text2 = driver.findElement(By.tagName("h1")).getText();
		System.out.println("The Card mgs is :"+text2);
	}
	
	@AfterSuite
	public static void close() {
		driver.close();
	}
	
}