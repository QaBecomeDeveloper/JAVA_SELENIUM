package kuchhBhi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	@Test(priority = 1) 
	public void driverSetup()
	{ 
	
		System.setProperty("webdriver.chrome.driver","E:\\program\\chromedriver.exe");
	
	driver=new ChromeDriver(); 
	Reporter.log("The browser is opened");

	} 
	@Test(priority = 2) 
	public void getURL()
	{ 
	driver.get("https://www.google.com");
	Reporter.log("The Google Site is Launched");

	} 
	@Test(priority = 3) 
	public void getTitle()
	{ 
	String title = driver.getTitle(); 
	System.out.println(title); Reporter.log("Prints the web page title");


	} 
	@Test(priority = 4)
	public void closeBrowser()
	{ 
	driver.close(); 
	//System.out.println("Test successfully passed"); 
	Reporter.log("Close the driver");

	}
}

	
