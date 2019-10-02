

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "src/test/resources/features"
		 ,tags= {"@checkBalance or @optExtraServices"}
		 ,glue="com/stepDefinitions"
		 ,monochrome=true
		 ,plugin= {
				 "pretty", 
				 "html:target/html", 
				 "json:target/json"}
		 ,strict=false
		 ,snippets=SnippetType.CAMELCASE
		 )
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
