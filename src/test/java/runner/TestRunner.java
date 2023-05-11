package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(


		features = "C:\\Users\\91807\\eclipse-workspace\\NewDemo\\DemoCucumberFive\\src\\test\\resources\\features\\demo.feature",
		glue="stepDefinition",
		monochrome = true,
		plugin={"pretty", "html:target/cucumber-reports/sample.HTML","json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml"}

		)
public class TestRunner {

}
