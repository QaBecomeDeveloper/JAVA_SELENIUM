package module2;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SELTEST {

	  @BeforeTest
	    public static void beforeTest(){
		  System.setProperty("webdriver.chrome.driver","D:\\TESTING\\driver\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  }

 @Test
 public void valid_UserCredential(WebDriver driver, WebElement element){

	 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
     driver.get("url/");
     driver.findElement(By.id("empCode")).sendKeys("ssh001");
     driver.findElement(By.id("psw")).sendKeys("ssh001");
     driver.findElement(By.xpath("//*[@id=\"btnId\"]/span[1]")).click();
     try{
		 element = driver.findElement (By.xpath("//*[@id=\"root\"]/main/div/div/div/header/div/div[2]/div/svg/path"));
	 }catch (Exception e){
		}
     Assert.assertNotNull(element);
     System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
 }

 @Test
 public void inValid_UserCredential(WebDriver driver, WebElement element)
 {
	 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
     driver.get("url/");
     driver.findElement(By.id("empCode")).sendKeys("ssh001");
     driver.findElement(By.id("psw")).sendKeys("ssh002");
     driver.findElement(By.xpath("//*[@id=\"btnId\"]/span[1]")).click();
     try{
		 element = driver.findElement (By.xpath("//*[@id=\"root\"]/main/div/div/div/header/div/div[2]/div/svg/path"));
	 }catch (Exception e){
		}
     Assert.assertNotNull(element);
     System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
 }

 @AfterClass
 public static void closeBrowser(WebDriver driver){
	 driver.quit();
 }
}

