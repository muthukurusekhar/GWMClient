package StepDefination;

import com.Gwm4.Pages.Portfoliomanagement;
import com.Utilities.BrowserSetUp;

import cucumber.api.java.en.Then;

public class Portfoliomgmt_Steps extends BrowserSetUp
{
	 Portfoliomanagement prop;
	
	public Portfoliomgmt_Steps() throws Throwable 
	{
		super();
		
	}
	
	@Then("Click portfolio management")
	public void click_portfolio_management() 
	{
		prop = new Portfoliomanagement(driver);
		prop.ClickPortfoliomgmt();
		
	}

	@Then("click create model portfolio")
	public void click_create_model_portfolio() throws Throwable 
	{
		Thread.sleep(5000);
		prop = new Portfoliomanagement(driver);
	    driver.switchTo().frame(0);
		prop.ClickCreatemodelPortfolio();
	}

	@Then("enter Details {string} , {string} and {string}")
	public void enter_Details_and(String Modelname, String profilesize, String corridor) 
	{
		prop = new Portfoliomanagement(driver);
		prop.EnterModelName(Modelname);
		prop.ClickRiskProfile();
		prop.SelectRiskProfile();
		prop.ClickRecommendedPortfolio();
		prop.SelectCountry();
		prop.ClickApply();
		prop.EnterProfileSize(profilesize);
		prop.ClickFundsource();
		prop.SelectFundsource();
		prop.EnterCorridor(corridor);
		
		
	}

	@Then("click Save model portfolio")
	public void click_Save_model_portfolio() 
	{
		prop = new Portfoliomanagement(driver);
	}
	
	
}
