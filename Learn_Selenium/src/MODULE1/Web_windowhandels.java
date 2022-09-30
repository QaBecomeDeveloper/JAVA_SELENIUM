package MODULE1;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_windowhandels {
	public static void main(String[] args) throws IOException, MessagingException, InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\TESTING\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
	    Set<String>winids = driver.getWindowHandles();
	    Iterator<String> iterate = winids.iterator();
	    System.out.println(iterate.next());
	    Thread.sleep(2000L);
	   
	    
	    
		
	
		
	}

}
