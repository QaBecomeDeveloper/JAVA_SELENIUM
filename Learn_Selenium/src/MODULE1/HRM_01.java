package MODULE1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HRM_01 {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","D:\\TESTING\\driver\\chromedriver.exe" );
    	WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("url");
	  driver.findElement(By.xpath("//input[@id='empCode']")).sendKeys("uid");
	  driver.findElement(By.xpath("//input[@id='psw']")).sendKeys("password");
	  driver.findElement(By.xpath("//button[@id='btnId']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"root\"]/main/main/div/div[1]/div/button/div[2]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/div/div[2]/a[1]/div[1]/div[1]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/label[3]/span[1]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"upload-file\"]")).sendKeys("C:\\Users\\Sushil\\Downloads\\SSS.xlsx");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div/div[3]/button[2]/span[1]")).click();
      try {
    	WebDriverWait wait = new WebDriverWait(driver, 20L);
    	wait.until(ExpectedConditions.presenceOfElementLocated(ByXPath("//*[@id=\"app\"]/div[3]/div[3]/div/div[2]/div/h3")));
      }
    //driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div/div[2]/div/h3"));  
	 catch (Exception e) {
		 System.out.println("got you");
	  }
	}

	private static By ByXPath(String string) {
		// TODO Auto-generated method stub
		return null;
	}}

	
