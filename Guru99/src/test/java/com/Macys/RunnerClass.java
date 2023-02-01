package com.Macys;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature file\\AddtoCard.feature",glue = "src\\test\\java\\com\\AddtoCard")

public class RunnerClass {

}
