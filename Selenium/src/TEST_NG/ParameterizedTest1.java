package TEST_NG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {
	 @Test
	   @Parameters("myName")
	   public void parameterTest(String myName) {
	      System.out.println("Parameterized value is : " + myName);
	   }

}
