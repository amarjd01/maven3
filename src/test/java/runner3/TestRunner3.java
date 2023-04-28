package runner3;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features3/ProductTags.feature",
		glue = "stepdefinition3",
		dryRun = false,
		monochrome = true,
		publish = true
		)

public class TestRunner3 {

}
