package TEST_NG;

import org.testng.annotations.Test;

public class ListenerTest {
	@Test(groups={"betaTest","aplhaTest"})
  	public void test1() {
  		System.out.println("I am test1");
  	}

  	@Test(groups={"aplhaTest"})
  	public void test2() {
  		System.out.println("I am test2");
  	}
}
