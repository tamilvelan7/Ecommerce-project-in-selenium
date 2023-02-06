package com.Ecommerce.guru99;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Macys.base.BaseClass;
import com.Macys.base.Utils;
import com.POM.clas.VerifyPage;

public class Compare_Product extends BaseClass{
	
	@Test
	public static void verify() {
		launchFirefox();
		getUrl(Utils.url1);
	}

	@Test(dependsOnMethods = {"verify"})
	public static void verify1(){
		PageFactory.initElements(driver, VerifyPage.class);
		VerifyPage.mobile.click();
		////a[text()='Sony Xperia']//following::a[text()='Add to Compare']
	}
}
