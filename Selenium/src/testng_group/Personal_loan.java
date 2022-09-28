package testng_group;

import org.testng.annotations.Test;

public class Personal_loan {

	  
		 @Test(groups = "SmokeTest")  
		 public void WebLoginPersonalLoan()  
		 {  
		     System.out.println("Web Login Personal Loan");  
		 }  
		 @Test  
		 public void MobileLoginPersonalLoan()  
		 {  
		     System.out.println("Mobile Login Personal Loan");  
		 }  
		 @Test  
		 public void APILoginPersonalLoan()  
		 {  
		     System.out.println("API Login Personal Loan");  
		 }  
}
