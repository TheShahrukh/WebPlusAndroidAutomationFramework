package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.core.backend.CucumberBackendException;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeaturesFolder", 
glue= {"StepDefinitions"},
monochrome= true)
public class TestRunner {

}