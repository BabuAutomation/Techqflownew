package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\DELL\\eclipse-workspace\\Techqflow\\Features\\NewCustomer.feature",
		//features= ".//Feature//Login.feature",
		glue= {"Stepdefinations"},
		plugin= {"pretty",
				"html:reports/myreports.html",
				"html:reports/myreports.json",
				//"rerun:target/rerun.txt",
		},
		dryRun=false,
		monochrome=true
		//tags="@Sanity"
		)



public class testrunner {
	
	

}
