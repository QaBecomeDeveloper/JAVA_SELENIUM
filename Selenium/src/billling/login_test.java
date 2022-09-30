package billling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login_test {
	
	WebDriver driver;
	@BeforeClass
    public void Setup() {  //setup driver
	System.setProperty("webdriver.chrome.driver","E:\\program\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    Reporter.log("Open Browser");
    
    }
	
	@BeforeMethod
	public void OpenBrowser(){  //OpenBrowser
	driver.get("url");
	System.out.println("We are currently on the following URL" + driver.getCurrentUrl());
	Reporter.log("Title of the page is: " + driver.getTitle());
	}
	
	@Test(priority = 1) //valid credentials
	public void Credentialone() {
		try {
	driver.findElement(By.id("empCode")).sendKeys("code");
	driver.findElement(By.id("password")).sendKeys("psw");
	driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	Thread.sleep(3000L);
    Assert.assertEquals(driver.getCurrentUrl(), "url/selectrole");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			System.out.println("AssertEquals Test Passed\n");	
		}	
	}
	
	@Test(priority = 2) //Invalid Password 
	public void Credentialtwo() {
		try {
	driver.findElement(By.id("empCode")).sendKeys("workfreaks-admin");
	driver.findElement(By.id("password")).sendKeys("rst@#2021");
	driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
    Alert A= driver.switchTo().alert();
    A.accept();
    Assert.assertNotEquals(driver.getCurrentUrl(), "url");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			System.out.println("AssertNotequals Test Fail\n");	
		}	
	}
	
	@Test(priority = 3) //Invalid employee code
	public void Credentialthree() {
		try {
	driver.findElement(By.id("empCode")).sendKeys("workfreaks");
	driver.findElement(By.id("password")).sendKeys("rst@#2020");
	driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	Alert A= driver.switchTo().alert();
    A.accept();
    Assert.assertNotEquals(driver.getCurrentUrl(), "url");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			System.out.println("AssertNotequals Test Fail\n");	
		}	
	}
	
	@Test(priority = 4) //Invalid without employee code and password
	public void Credentialfour() {
		try {
	driver.findElement(By.id("empCode")).sendKeys(" ");
	driver.findElement(By.id("password")).sendKeys(" ");
	driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	Alert A= driver.switchTo().alert();
    A.accept();
    Assert.assertNotEquals(driver.getCurrentUrl(), "url");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			System.out.println("AssertNotequals Test Fail\n");	
		}	
	}
	
	@AfterMethod
	public void PostSignIn() {
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	@AfterClass
	public void After() {
        driver.quit();
	}
}


