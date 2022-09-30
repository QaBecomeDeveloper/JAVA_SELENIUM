package Junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({testingJunit.class, SecondTest.class, learingAssersions.class})
public class TestSuit {
	
	

}
