package com.POM.clas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyPage {
	
	@FindBy(linkText = "MOBILE")
	public static WebElement mobile;
	
	@FindBy(xpath = "//select[@title='Sort By']")
	public static WebElement sort;
	
	@FindBy(xpath="//a[text()='Sony Xperia']//following::span[2]")
	public static WebElement phone_name;
	
	@FindBy(xpath="//a[text()='Sony Xperia']")
	public static WebElement phone;
	
	@FindBy(xpath="//span[text()='$100.00']")
	public static WebElement price;
}
