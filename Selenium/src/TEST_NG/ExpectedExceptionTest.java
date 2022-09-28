package TEST_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedExceptionTest {
	
	 String message = "SUSHIL";
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test(expectedExceptions = ArithmeticException.class)
	   public void testPrintMessage() {
	      System.out.println("Inside testPrintMessage()");
	      messageUtil.printMessage();
	   }

	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "SUSHIL";
	      Assert.assertEquals(message,messageUtil.salutationMessage());
	   }

}
