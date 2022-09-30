package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_01 {
@Test
public void testlogin() {
	System.out.println("login success");
}
	@Test
	public void testformfill() {
		System.out.println("test registration form");
	}
	
	@BeforeMethod
	public void openbrowser() {
		System.out.println("open browser");
	}
	
	@AfterMethod
	public void closebrowser() {
		System.out.println("close browser");
	}
	
	@BeforeTest
	public void opendbconnection() {
		
		System.out.println("db connected");
	}
   @AfterTest
   public void closedbconnection() {
	   System.out.println("close db connection");
   }
@BeforeSuite
public void runseleniumserver() {
	System.out.println("start selenium server");
}

@AfterSuite
public void stopseleniumserver() {
	System.out.println("stop selenium server");
}
   
}
