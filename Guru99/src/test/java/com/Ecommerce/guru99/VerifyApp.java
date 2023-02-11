package com.Ecommerce.guru99;

import java.io.IOException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import com.Macys.base.BaseClass;
import com.Macys.base.Utils;
import com.POM.clas.Add_To_Card;
import com.POM.clas.Mobile_Page;

public class VerifyApp extends BaseClass {
	static WebDriver driver;
	static Select drop;
	TakesScreenshot shot;

	@Test(priority = 0)
	public static void verify() {
		launchFirefox();
		getUrl(Utils.url1);
	}

	@Test(priority = 1)
	public static void verify1() {
		PageFactory.initElements(driver, Mobile_Page.class);
		if (getTitle().equals("Home page"))
			print("first test case Passed");
		Mobile_Page.mobile.click();
	}

	@Test(priority = 2)
	public static void verify3() {
		if (getTitle().equals("Mobile"))
			System.out.println("Second test case Passed");
	}

	@Test(priority = 3)
	public static void verify4() throws IOException {
		drop = new Select(Mobile_Page.sort);
		drop.selectByVisibleText("Name");
		screenshot("C:\\Users\\tamil\\git\\Ecommerce-project-in-selenium\\Guru99\\Test datas\\data.png1");
	}

	@Test(enabled = false, dependsOnMethods = { "verify4" })
	public static void verify5() {
		String text =Mobile_Page.phone_name.getText();
		Mobile_Page.phone.click();
		String text1 =Mobile_Page.price.getText();
		if (text.equals(text1))
			System.out.println("Amount verified successfully");
		else
			System.out.println("Amount verified failed");
	}

	@Test(dependsOnMethods = { "verify4" })
	public static void verify6() {
		PageFactory.initElements(driver, Add_To_Card.class);
		Add_To_Card.card.click();
		Add_To_Card.quantity.sendKeys("1000");
		Add_To_Card.update.click();
		String text =Add_To_Card.mgs.getText();
		print("The error mgs is :" + text);
		Add_To_Card.empty_card.click();
		String text2 = Add_To_Card.heading.getText();
		print("The Card mgs is :" + text2);
	}

	@AfterSuite
	public static void close() {
		close();
	}

}