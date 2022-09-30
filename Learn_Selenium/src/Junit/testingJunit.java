package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;

public class testingJunit {

	public static boolean dbconnection() {
		return true;
		
		
	}
	
	@BeforeClass
	public static void Seleniumsetup() {
		System.out.println("initialize selenium server");
		 Assume.assumeTrue(dbconnection());
	     
	}
	
	@Before
	public void testbrowser() {
		System.out.println("open chrome browser");
	}
	
	@Test
	public void testNavigation() {
		System.out.println("opening the website");
	}
  @Test
   public void testlink() {
	  System.out.println("validate the process of links");
      
  }
	
	
	// @Ignore
	@Test
	public void TestloginDetails() {
		System.out.println("Enter login details");
	}
	
	@After
	public void testclosebrowser() {
		System.out.println("close the browser");
	}
	@AfterClass
	public static void seleniumshutdown() {
		System.out.println("shutdown selenium server");
	}
}
