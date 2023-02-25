package com.Ecommerce.guru99;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.Macys.base.BaseClass;
import com.Macys.base.Utils;
import com.POM.clas.RegPage;

public class RegisterAcc extends BaseClass {

	@Test
	public static void verify() {
		launchChrome();
		getUrl(Utils.url1);
		
	}

	@Test(priority = 1)
	public static void verify1() throws IOException {
		Properties file = new Properties();
		FileInputStream input = new FileInputStream(Utils.path_property);
		file.load(input);
		RegPage.account.click();
		RegPage.profile.click();
//		driver.findElement(By.xpath("//span[text()='Create an Account']")).click();
		RegPage.mail.sendKeys(file.getProperty("email"));
		RegPage.password.sendKeys(file.getProperty("password"));
		RegPage.submit.click();
		String text = RegPage.message.getText();
		System.out.println(text);
	}
	
//	@Test(priority=2)
//	public static void verify2() throws IOException {
//		Properties file = new Properties();
//		FileInputStream input = new FileInputStream(
//				"C:\\Users\\tamil\\git\\Ecommerce-project-in-selenium\\Guru99\\Credential.properties");
//		file.load(input);
//		driver.findElement(By.id("firstname")).sendKeys(file.getProperty("name"));
//		driver.findElement(By.id("lastname")).sendKeys(file.getProperty("last"));
//		driver.findElement(By.id("email_address")).sendKeys(file.getProperty("email"));
//		driver.findElement(By.id("password")).sendKeys(file.getProperty("password"));
//		driver.findElement(By.id("confirmation")).sendKeys(file.getProperty("password"));
//		driver.findElement(By.xpath("//button[@title='Register']")).click();
//	}
	
	@Test(priority = 2)
	public static void verify2() {
		driver.findElement(By.linkText("TV")).click();
		driver.findElement(By.xpath("//a[text()='LG LCD']//following::a[2]")).click();
		driver.findElement(By.xpath("//button[@title='Share Wishlist']")).click();
		driver.findElement(By.id("email_address")).sendKeys("Tamilvelanmuthu95@gmail.com");
		driver.findElement(By.id("message")).sendKeys("LG LCD");
		driver.findElement(By.xpath("//button[@title='Share Wishlist']")).click();
//		TakesScreenshot
	}

}
