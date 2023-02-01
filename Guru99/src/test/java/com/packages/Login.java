package com.packages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.Macys.base.*;

public class Login extends Utils {

	@Test
	public static void methods() throws IOException {
		// Day 1 script
		System.setProperty(firefor_Browser, path);
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// read data in excel
		List<String> data = TestData.readData();
		
		int count=1;
		for(int i=0;i<data.size();i++) {
		try {
		if(i%2==0)
		driver.findElement(By.name("uid")).sendKeys(data.get(i));
		driver.findElement(By.name("password")).sendKeys(data.get(count));
		driver.findElement(By.name("btnLogin")).click();
		driver.switchTo().alert().accept();
		}
		catch(Exception e){
			System.out.println(e);
		}
		String getTitle = driver.getTitle();
		if(getTitle.equals(title)) {
			System.out.println("Test Case passed: "+"\'"+getTitle+"\'");
		}
		else {
			System.out.println("Test Case Failed: "+"\""+getTitle+"\"");
		}
		count++;
	}
	}
	
}