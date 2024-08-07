package cucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features= {"C:\\Users\\bhuvi\\Downloads\\Browser\\Browser\\src\\test\\resources\\cucumber\\file6.feature"},
glue= {"stepdefinition"},tags= {"@loginDataWithHeader"},
//plugin= {"json:Reports/jsonreport.json"}
//plugin= {"html:Reports/htmlreport"}
plugin= {"junit:Reports/xmlreport.xml"}
		)

public class TestRunn 
{
}
