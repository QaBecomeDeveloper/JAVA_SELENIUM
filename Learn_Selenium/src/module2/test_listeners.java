package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class test_listeners {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TESTING\\driver\\chromedriver.exe" );
    	WebDriver webDriver = new ChromeDriver();
    	EventFiringWebDriver driver =new EventFiringWebDriver(webDriver);
    	Web_listeners listner = new Web_listeners();
    	driver.register(listner);
    	driver.navigate().to("https://www.google.com/");
	    driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[3]")).click();
	    Thread.sleep(2000L);
	    driver.navigate().back();
	    driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[2]")).click();
	    Thread.sleep(2000L);
	    driver.navigate().back();
	    Thread.sleep(2000L);
	    driver.navigate().forward();
	    
	  
	}

}
