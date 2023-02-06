package com.POM.clas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_To_Card {
	
//	Sony Xperiya
	@FindBy(xpath="//a[text()='Sony Xperia']//following::button[@type='button']")
	public static WebElement card;

	@FindBy(xpath="//input[@title='Qty']")
	public static WebElement quantity;
	
	@FindBy(xpath="//button[@title='Update']")
	public static WebElement update;
	
	@FindBy(xpath="//p[@class='item-msg error']")
	public static WebElement mgs;

	@FindBy(xpath="//span[text()='Empty Cart']")
	public static WebElement empty_card;
	
	@FindBy(tagName = "h1")
	public static WebElement heading;
}
