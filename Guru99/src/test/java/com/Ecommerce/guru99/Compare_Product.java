package com.Ecommerce.guru99;

import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.Macys.base.BaseClass;
import com.Macys.base.Utils;
import com.POM.clas.Mobile_Page;

public class Compare_Product extends BaseClass{
	
	@Test
	public static void verify() {
		launchFirefox();
		getUrl(Utils.url1);
	}

	@Test(dependsOnMethods = {"verify"})
	public static void verify1(){
		PageFactory.initElements(driver, Mobile_Page.class);
		Mobile_Page.mobile.click();
		Mobile_Page.sony_compare.click();
		Mobile_Page.iphone_compare.click();
		Mobile_Page.compare_button.click();
		
	}
	
	@Test(dependsOnMethods = {"verify1"})
	public static void handleWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if(driver.switchTo().window(string).getTitle().contains("Products Comparison List")) {
				print(getTitle());
				break;
			}
		Mobile_Page.closeWindow.click();	
		}
	}
//	@AfterSuite
//	public static void close() {
//		driver.close();
//		}
	}
