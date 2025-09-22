package com.malawi.runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\M1001\\projectclss-workspace\\FinalProject\\src\\test\\resources\\Features",
                 glue = {"com.malawi.stepdefinition"},
                 monochrome = true,
                 dryRun = false)
public class Runner {
	
	
 	
	

}
