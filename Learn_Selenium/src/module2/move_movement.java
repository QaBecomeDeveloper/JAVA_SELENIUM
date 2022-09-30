package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class move_movement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TESTING\\driver\\chromedriver.exe" );
    	WebDriver webDriver = new ChromeDriver();
    	EventFiringWebDriver driver =new EventFiringWebDriver(webDriver);
    	Web_listeners listner = new Web_listeners();
    	driver.register(listner);
    	Actions actions = new Actions(driver);
    	WebElement menuHoverLink = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
    	actions.moveToElement(menuHoverLink);
     	actions.click();
    	actions.perform();
    	
}
}
