package TEST_NG;

import org.testng.annotations.Test;

public class Dependent {

	  @Test (dependsOnMethods = { "OpenBrowser" })
	  public void SignIn() {
		  System.out.println("This will execute second (SignIn)");
	  }

	  @Test
	  public void OpenBrowser() {
		  System.out.println("This will execute first (Open Browser)");
	  }

}
