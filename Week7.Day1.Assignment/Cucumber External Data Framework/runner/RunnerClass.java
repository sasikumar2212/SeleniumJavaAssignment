package runner;


import io.cucumber.testng.CucumberOptions;
import stepdefinition.BaseClass;

@CucumberOptions(features = {"src/main/java/feature/TestCase006MergeLead.feature"},glue = "stepdefinition",monochrome=true,publish=true)
public class RunnerClass extends BaseClass {
	
}
