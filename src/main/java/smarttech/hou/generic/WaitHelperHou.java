package smarttech.hou.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import smarttech.hou.basepage.ParentClass;

public class WaitHelperHou extends ParentClass{

	public static void waitForElement(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	
	
	
	
}
