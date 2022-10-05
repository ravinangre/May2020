package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Maven_cucumber\\src\\main\\resources\\Feature",
		glue = {"stepDefinition"},
	//	tags = "@sanity",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:Reports/cucumber/report.html","json:target/cucumber.json","junit:Reports/cucumber.xml"},
		publish = true
		)
public class TestRunner {

}
