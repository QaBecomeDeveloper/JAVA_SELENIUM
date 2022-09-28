package TEST_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test2 {

	String message = "Manisha";
	   MessageUtil messageUtil = new MessageUtil(message);
	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "Manisha";
	      Assert.assertEquals(message,messageUtil.salutationMessage());
	   }
}
