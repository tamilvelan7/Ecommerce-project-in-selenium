package com.Macys.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static Select dropdown;
//	Launching Firefox driver
	public static void launchFirefox() {
		System.setProperty(Utils.firefor_Browser, Utils.path);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

//	Launching Chrome Driver
	public static void launchChrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\Projectname\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

//	Launching MSEdge driver
	public static void launchedge() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\tamil\\eclipse-workspace\\Projectname\\Edge\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

//	get url 
	public static void getUrl(String url) {
		driver.get(url);
	}
	
//	get titile
	public static String getTitle() {
		return driver.getTitle();
	}

//	Screenshot 
	public static void screenshot(String location) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File file = tk.getScreenshotAs(OutputType.FILE);
		File des=new File(location);
		FileUtils.copyFile(file, des);
	}
	
//	print out
	public static void print(String out) {
		System.out.println(out);
	}

	
//	Close the browser
	public static void close() {
		driver.close();
	}
	
//	Quit the browser
	public static void quit() {
		driver.quit();
	}
}

