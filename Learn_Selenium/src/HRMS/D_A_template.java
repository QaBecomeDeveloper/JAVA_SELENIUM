package HRMS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_A_template {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
	  System.setProperty("webdriver.chrome.driver","D:\\TESTING\\driver\\chromedriver.exe" );
      WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  
	  //login Hrms.............
	  driver.get("url/");
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
	  Thread.sleep(1000L);
	  
	  //select filter..................
	  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[4]/div/div[1]/div/div[2]/div")).click();
	  System.out.println("Select filter");
	  Thread.sleep(2000L);
	  
	  //pass data on filter and search....................
	  driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("SEL001");
	  Thread.sleep(2000L);
	  driver.findElement(By.xpath("/html/body/main/div/main/div/div/div[4]/div/div[5]/div/div/div[3]/div/div/div/input")).click();
	  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[4]/div/div[5]/div/div/div[3]/div/div/div/div/div/div[1]/div[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[4]/div/div[5]/div/div/div[3]/div/div/div/div/div/div[13]")).click();
	  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[4]/div/div[5]/div/div/div[3]/div/div/div/div/div/div[13]")).click();
	  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[4]/div/div[5]/div/div/div[7]/div/div/div/button[2]/span[1]")).click();
	  Thread.sleep(2000L);
	  System.out.println("submit the filter data");
	  
	  //click on template option............
	  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[4]/div/div[1]/div/div[2]/button/span[1]")).click();
	  
	  // select date range on popup and submit................
	  driver.findElement(By.xpath("//*[@id=\"fromDate\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/button[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[4]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[3]/div/div[2]/button[2]/span[1]")).click();
	  Thread.sleep(1000L);
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/div/input")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/button[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[5]/div[6]/button/span[1]")).click();
	  driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]")).click();
	  System.out.println("select date rang");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div/div[2]/div[3]/button")).click();  
	  Thread.sleep(2000L);
	  System.out.println("click on export buttom");
      Thread.sleep(2000L);
      driver.quit();
      ReadFile readexcelfile =new ReadFile();
      readexcelfile.readexcel();
      System.out.println(" ");
      Thread.sleep(1000L);
      WriteExcel writeexcelfile =new WriteExcel();
      writeexcelfile.updateExcel();
      System.out.println(" ");
      Thread.sleep(100L);
      Import_AT dataimport = new Import_AT();
      dataimport.Tmplateimport();
}
}