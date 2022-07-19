package com.runnerfile_new;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Vanithacucu\\featurefile\\cucu.feature",
                             glue = "com.stepdefinition",
                             plugin = {"html:report/vanitha.html",
                            		 "pretty",
                            		 "json:report/jasonreport.json.html"
                             }
                        
		                  
		
		
		
		)





public class RunnerFile_Adactin {

}
																																										