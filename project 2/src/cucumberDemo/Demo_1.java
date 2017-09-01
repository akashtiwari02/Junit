package cucumberDemo;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "feature"
		,glue = {"stepDefinetion"}
		
		)
public class Demo_1 {

}
