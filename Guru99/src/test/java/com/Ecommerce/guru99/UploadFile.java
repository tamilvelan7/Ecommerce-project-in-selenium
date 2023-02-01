package com.Ecommerce.guru99;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\eclipse-workspace\\com.Macys\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.filemail.com/share/upload-file");
		driver.findElement(By.id("addBtn")).click();
		Robot rb=new Robot();
		StringSelection file=new StringSelection("C:\\Users\\tamil\\eclipse-workspace\\eclipse-workspace\\com.Macys\\Test datas\\data.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		
		 rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
