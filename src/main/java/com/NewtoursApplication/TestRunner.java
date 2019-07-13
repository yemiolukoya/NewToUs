package com.NewtoursApplication;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "Feature//Login_Test.feature"
      , glue =  "com.NewtoursApplication"
      //,dryRun = true
      //,plugin = { "pretty", "html:target/htmlreports" }
		
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
