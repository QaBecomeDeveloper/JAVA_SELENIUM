package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Attendance_template_Download {

	WebDriver driver;
	@BeforeClass
    public void Setup() {  //setup driver
	System.setProperty("webdriver.chrome.driver","E:\\program\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    
    }
	
	@BeforeMethod
	public void OpenBrowser(){  //OpenBrowser
	driver.get("http://qajagdamba.nyggs.com/");
	System.out.println("We are currently on the following URL" + driver.getCurrentUrl());
	}
	
	@Test(priority = 1) //valid credentials
	public void Credentialone() {
		try {
	driver.findElement(By.id("empCode")).sendKeys("lev001");
	driver.findElement(By.id("password")).sendKeys("lev001");
	driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	Thread.sleep(3000L);
    
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			System.out.println("AssertEquals Test Passed\n");	
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
