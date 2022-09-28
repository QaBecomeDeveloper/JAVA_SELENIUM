package TEST_NG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamTestWithDataProvider2 {
	@DataProvider(name = "test1")
	   public static Object[][] primeNumbers() {
	      return new Object[][] { { new Bean("hi I am the SUSHIL", 711) } };
	   }

	   @Test(dataProvider = "test1")
	   public void testMethod(Bean myBean) {
	      System.out.println(myBean.getVal() + " " + myBean.getI());
	   }
	
}
