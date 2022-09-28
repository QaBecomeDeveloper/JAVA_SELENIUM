package testNG_Listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class_1 {

	@Test  
	public void sum()  
	{  
	int sum=0;  
	int a=5;  
	int b=7;  
	sum=a+b;  
	System.out.println(sum);  
	}  
	@Test  
	public void testtofail()  
	{  
	System.out.println("Test case has been failed");  
	Assert.assertTrue(false);  
	}  
}
