package TEST_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {
	String message = "SUSHIL";
	MessageUtil messageUtil = new MessageUtil(message);

	   @Test
	   public void testPrintMessage() {
	      System.out.println("Inside testPrintMessage()");
	      message = "SUSHIL";
	      Assert.assertEquals(message, messageUtil.printMessage());
	   }

	   @Test(dependsOnMethods = { "initEnvironmentTest" })
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "SUSHIL";
	      Assert.assertEquals(message, messageUtil.salutationMessage());
	   }
	   
	   @Test
	   public void initEnvironmentTest() {
	      System.out.println("This is initEnvironmentTest");
	   }
	   
	   @Test(groups = { "init" })
	   public void testPrintMessage1() {
	      System.out.println("Inside testPrintMessage()");
	      message = "SUSHIL";
	      Assert.assertEquals(message, messageUtil.printMessage());
	   }

	   @Test(dependsOnGroups = { "init.*" })
	   public void testSalutationMessage1() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "SUSHIL";
	      Assert.assertEquals(message, messageUtil.salutationMessage());
	   }

	   @Test(groups = { "init" })
	   public void initEnvironmentTest1() {
	      System.out.println("This is initEnvironmentTest");
	   }
	   
}
