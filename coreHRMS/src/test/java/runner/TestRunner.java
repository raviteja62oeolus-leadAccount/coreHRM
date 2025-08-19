package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
	features = "C:\\Users\\Hanumanthu\\OneDrive\\Pictures\\coreHRM_7pm\\coreHRMS\\src\\test\\resources\\Features",	
	
	glue = "stepDefinations",
	
	tags = "~@Smoke",
			
	//specify the reporting options for the test run
	plugin = {"pretty","html:target/OrangeHrm_Cucumber-reports"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
//This class extends AbstractTestNGCucumberTests to integrate cucumber with testNG

//It will automatically run all the feature files which is defined in the @CucumberOptions


	
	
	
	
	
	

}
