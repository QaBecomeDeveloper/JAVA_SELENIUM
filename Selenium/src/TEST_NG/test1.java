package TEST_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	   String message = "Manisha";
	   MessageUtil messageUtil = new MessageUtil(message);
	   @Test
	   public void testPrintMessage() {
	      System.out.println("Inside testPrintMessage()");
	      Assert.assertEquals(message, messageUtil.printMessage());
	   }

	
}
