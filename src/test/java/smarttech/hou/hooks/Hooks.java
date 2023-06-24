package smarttech.hou.hooks;



import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import smarttech.hou.basepage.ParentClass;

import smarttech.hou.elementspage.MasterPageFactoryhou;


public class Hooks extends ParentClass {
	public Scenario scenario;
 MasterPageFactoryhou obj;	
	
@Before 
public void setUp() throws InterruptedException  {
	this.scenario = scenario;
	initialization();
	obj = PageFactory.initElements(driver, MasterPageFactoryhou.class);
	obj.getLogin();
	  
	
	
}

//@After
public void teardown() throws InterruptedException {

	driver.quit();
}



}
