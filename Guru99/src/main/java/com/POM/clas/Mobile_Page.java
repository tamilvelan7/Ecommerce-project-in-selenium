package com.POM.clas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mobile_Page {
	
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
	
	@FindBy(xpath="//a[text()='Sony Xperia']//following::a[text()='Add to Compare']")
	public static WebElement sony_compare;
	
	@FindBy(xpath="//a[text()='IPhone']//following::a[text()='Add to Compare']")
	public static WebElement iphone_compare;
	
	@FindBy(xpath="//span[text()='Compare']")
	public static WebElement compare_button;
	
	@FindBy(xpath="//span[text()='Description']//following::td[1]")
	public static WebElement descri_sony;
	
	@FindBy(xpath="//span[text()='Description']//following::td[2]")
	public static WebElement descri_iphone;
}
