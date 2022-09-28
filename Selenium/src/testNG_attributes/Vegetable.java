package testNG_attributes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Vegetable {
	@Test  
	@Parameters("Cauliflower")  
	public void c(String m)  
	{  
	System.out.println("Vegetable names are :");  
	System.out.println(m);  
	}  
	@Test  
	@Parameters("Ladyfinger")  
	public void orange(String l)  
	{  
	System.out.println(l);  
	}  

}
