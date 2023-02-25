package com.POM.clas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegPage {
	
	@FindBy(xpath = "//a/span[text()='Account']")
	public static WebElement account;
	
	@FindBy(linkText = "My Account")
	public static WebElement profile;
	
	@FindBy(id="email")
	public static WebElement mail;
	
	@FindBy(id="pass")
	public static WebElement password;
	
	@FindBy(id="send2")
	public static WebElement submit;
	
	@FindBy(xpath="//div[@class='welcome-msg']")
	public static WebElement message;
	
}
