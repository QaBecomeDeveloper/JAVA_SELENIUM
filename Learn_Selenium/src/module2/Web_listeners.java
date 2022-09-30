package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class Web_listeners extends AbstractWebDriverEventListener{
	
	public void afterclickon(WebElement element, WebDriver driver) {
		System.out.println("object clicked");
	}

	public void afternavigateForword(WebDriver driver) {
        System.out.println("Moving Forword");
	}
}
