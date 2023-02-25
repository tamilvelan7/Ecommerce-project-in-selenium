package com.Ecommerce.guru99;

import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import com.Macys.base.BaseClass;
import com.Macys.base.Utils;
import com.POM.clas.Mobile_Page;

public class Compare_Product extends BaseClass{
	
	@Test
	public static void verify() {
		launchChrome();
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
	public static void handleWindow() throws IOException {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			driver.switchTo().window(string);
			screenshot("C:\\Users\\tamil\\git\\Ecommerce-project-in-selenium\\Guru99\\ScreenShot\\ss.png");
		}
	}
	@AfterSuite
	public static void close() {
		driver.quit();
		}
	}
