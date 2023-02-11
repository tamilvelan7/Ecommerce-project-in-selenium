package com.packages;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.Macys.base.Utils;

public class UploadFile extends Utils {
	
	public static void main(String[] args) throws FileNotFoundException {
	
	System.setProperty(firefor_Browser, path);
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.filemail.com/share/upload-file");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='Add Files']")).sendKeys("C:\\Users\\tamil\\eclipse-workspace\\eclipse-workspace\\com.Macys\\Test datas\\Tamil test data.xlsx");
		
	}
}
