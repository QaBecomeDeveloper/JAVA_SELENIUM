package HRMS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Import_AT {
    
	 public static void Tmplateimport() throws InterruptedException {
		try { 
		System.setProperty("webdriver.chrome.driver","D:\\TESTING\\driver\\chromedriver.exe" );
	      WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  
		  //login Hrms.............
		  driver.get("http://qajagdamba.nyggs.com/");
		  driver.findElement(By.xpath("//input[@id='empCode']")).sendKeys("pc001");
		  driver.findElement(By.xpath("//input[@id='psw']")).sendKeys("1234567");
		  driver.findElement(By.xpath("//button[@id='btnId']")).click();
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  
		  // select role..................
		  driver.findElement(By.xpath("//div[@class='MuiCardContent-root' and contains(., 'Admin')]")).click();
		  System.out.println("Role Selected");
		  Thread.sleep(2000L);
		  
		  //select nav baar then select attendance module ..................
		  driver.findElement(By.xpath("/html/body/main/div/main/div/div/div[1]/header/div/button")).click();
		  System.out.println("NavBar selected");
		  driver.findElement(By.xpath("/html/body/main/div/main/div/div/div[1]/div[2]/div/nav/div[2]/div[2]/span")).click();
		  System.out.println("select attendance list");
		  driver.findElement(By.xpath("/html/body/main/div/main/div/div/div[1]/div[2]/div/nav/div[3]/div/div/div[2]/div/div[2]/span")).click();
		  System.out.println(driver.getCurrentUrl());
		  System.out.println("monthly attendance selected");
		  Thread.sleep(2000L);
		  //select import button
		  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[4]/div/div[1]/div/div[2]/a[2]/span[1]")).click();
		
		 
		  //select data from open popup
		  driver.findElement(By.xpath("//*[@id=\"fromDate\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/button[1]/span[1]")).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[4]/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[3]/div/div[2]/button[2]/span[1]")).click();
		  Thread.sleep(1000L);
		  driver.findElement(By.xpath("//*[@id=\"toDate\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/button[1]/span[1]")).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[5]/div[6]/button")).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[3]/div/div[2]/button[2]/span[1]")).click();
		  
		  //select force update checkbox
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div/div[2]/div/div[3]/label[1]/span[1]/span[1]")).click();
		  
		  //select file in choose file option
		  driver.findElement(By.xpath("//*[@id=\"upload-file\"]")).sendKeys("C:\\Users\\Sushil\\Downloads\\UpdateAttendance.xlsx");
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div/div[3]/button[2]/span[1]")).click();
		  Thread.sleep(2000L);
		  System.out.println("success");
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div/div[3]/button/span[1]")).click();
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  //click on summary...........
		  Thread.sleep(1000L);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[4]/div/div[2]/div/div[1]/button[1]/span[1]")).click();
		  //select filter..................
		  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/div[2]/div[1]/div[2]/div")).click();	
		  System.out.println("filter selected");
		  Thread.sleep(1000L);
		  
		  //pass data on filter and search....................
		  driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("SEL001");
		  Thread.sleep(2000L);
		
		  driver.findElement(By.xpath("//*[@id=\"monthpicker\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/div[2]/div[5]/div/div/div[3]/div/div/div/div/div/div[1]/div[1]")).click();
		  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/div[2]/div[5]/div/div/div[3]/div/div/div/div/div/div[13]")).click();
		  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/div[2]/div[5]/div/div/div[3]/div/div/div/div/div/div[13]")).click();
		  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/div[2]/div[5]/div/div/div[7]/div/div/div/button[2]/span[1]")).click();
		  Thread.sleep(2000L);
		  System.out.println("submit the filter data");
		  
		}catch (Exception e) 
		{
	    	e.printStackTrace();
				}
		
		
		
}     
    
	 public static void main(String[] args) throws InterruptedException {
		Tmplateimport();
	}
}