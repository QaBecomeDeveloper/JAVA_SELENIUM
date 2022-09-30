package Junit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class learingAssersions {
	
	@Rule
	public ErrorCollector ec = new ErrorCollector();
	
	@Test
	public void testTitle() {
		
		String actual_tital = "Google.com"; //Extract selenium script 
	    String expected_tital = "Google Inc";
	  /*
	     if (actual_tital == expected_tital) {
	    	 System.out.println("test case pass");
	     }else {
			System.out.println("test case failed");
		}
	}*/
	    System.out.println("start comparision");
 try {
	    Assert.assertEquals(actual_tital, expected_tital );
 }catch (Throwable e) {
     System.out.println("error captured");
     ec.addError(e);
 }
          System.out.println("comparison done");
 
}
}