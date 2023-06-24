package smarttech.hou.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		// plug in is nothing but generate the report
		plugin= {"pretty","json:target/cucumber.json" }, 
		features = { ".//Features/" }, // feature is nothing but location of features file
		glue = { "smarttech.hou.stepdefinations", "smarttech.hou.hooks" } // glue is nothing but location of stepdefination
)
public class TestRunner extends AbstractTestNGCucumberTests {

}



	
	


