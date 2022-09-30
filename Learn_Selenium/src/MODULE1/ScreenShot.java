package MODULE1;

import java.io.File;
import java.io.IOException;
import javax.mail.MessagingException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException, MessagingException{
		System.setProperty("webdriver.chrome.driver","D:\\TESTING\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();	
		SendMailUsingAuthentication mail = new SendMailUsingAuthentication();
		driver.get("url");
		driver.manage().window().maximize();
		File scrfilFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfilFile, new File("D:\\Secreenshot\\Capture1.jpg"));
		 
		try
		{
			driver.findElement(By.xpath("//*[@id='empCodeeee']"));
		}catch (Throwable t) {
			FileUtils.copyFile(scrfilFile, new File("D:\\Secreenshot\\cp1.png"));
			mail.postMail(SendMailUsingAuthentication.emailList, SendMailUsingAuthentication.emailSubjectTxt, SendMailUsingAuthentication.emailMsgTxt, SendMailUsingAuthentication.emailFromAddress);
		}
	}
    
    
	
}
