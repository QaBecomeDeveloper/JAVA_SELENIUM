package TEST_NG;

import org.testng.annotations.Test;

class SuperClass {

	@Test
    public void OpenBrowser() {
        System.out.println("BrowserOpened");
    }
}
 
class InheritedDependencyTest extends SuperClass
{
    @Test(dependsOnMethods = { "OpenBrowser" })
    public void LogIn() {
        System.out.println("Logged In");
    }
}
