package LAUNCH_BROWSER;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class TC_01 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\program\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.get("url/");
	      driver.findElement(By.id("empCode")).sendKeys("uid");
	  	driver.findElement(By.id("password")).sendKeys("psw");
	  	driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	  	driver.manage().window().maximize();
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("//*[contains(text(),'Admin')]")).click();
	      
}
}