package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\vimal.verma\\testingWrk\\BDDFramework\\src\\main\\java\\Features\\Map_LogIn.feature"
		,glue= {"MapStepDefination"},
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		dryRun=true,
		monochrome = true, 
		strict = true
		
		
		)
public class TestRunner {

}
