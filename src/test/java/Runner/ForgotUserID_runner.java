package Runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 


@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src\\test\\java\\Feature\\ClientLogin.feature"
 ,glue={"StepDefination"},tags= {"@Forgot_UserID"},
 plugin= {"html:Reports/cucumber-html-report",
		 "json:Reports/cucumber.json",
		 "junit:Reports/cucumber-results.xml",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
 )


public class ForgotUserID_runner 
{
	 	
}
