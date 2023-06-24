package smarttech.hou.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.testng.Assert;

import smarttech.hou.basepage.ParentClass;

public class CommonUtilhou extends ParentClass {

	
	public static void getAssertions(String expected, String actual) {
		Assert.assertEquals(expected, actual);
		System.out.println("My desired value is : " + actual);
	}

	public static void hoverOver(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();
	}	
	
	public static void actionClick(WebElement ele)  {
		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();
	}
	
	public static void jsClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}

	
	
	public static void highLighterMethod(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", element);
	}

	public static String captureScreen() {
		String path;
		try {
			driver = new Augmenter().augment(driver);
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			path = "./Screenshots/" + source.getName();
			FileUtils.copyFile(source, new File(path));
		} catch (IOException e) {
			path = "Failed to capture screenshot: " + e.getMessage();
		}
		return path;
	}

	
	
	
}
	
	

