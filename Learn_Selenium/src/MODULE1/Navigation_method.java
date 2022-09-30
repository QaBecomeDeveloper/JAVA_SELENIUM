package MODULE1;

import java.io.IOException;

import javax.mail.MessagingException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_method {

	public static void main(String[] args) throws IOException, MessagingException, InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\TESTING\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[3]")).click();
        Thread.sleep(2000L);
        driver.navigate().back();
        Thread.sleep(2000L);
        driver.navigate().forward();
        System.out.println("Success");
        
        
        
		
	}

}
