package com.qa.labs.cucumberOption;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//Feature file details and Step definitions details here with more
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\features",
        glue = "stepdefinations",dryRun=false,
        tags = "@RegressionTest",monochrome=true,
        plugin = {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"}
        
      
)
public class testRunner {

}
