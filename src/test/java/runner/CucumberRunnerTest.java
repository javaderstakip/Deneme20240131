package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"},
    glue = {"stepDefinitions"},
    tags = "not @browser and @headless")
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
