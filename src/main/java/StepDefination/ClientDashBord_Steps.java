package StepDefination;



import com.Gwm4.Pages.ClientDashBord;
import com.Utilities.BrowserSetUp;

import cucumber.api.java.en.Then;

public class ClientDashBord_Steps extends BrowserSetUp
{
	ClientDashBord cli;
	
	public ClientDashBord_Steps() throws Throwable 
	{
		super();
		
	}

	@Then("Click dashbord")
	public void click_dashbord() 
	{
		cli = new ClientDashBord(driver);
		cli.clickClientdashbord();    
		/*
		 * int size = driver.findElements(By.tagName("iframe")).size();
		 * System.out.println(size);
		 */
	}

	@Then("Click Portfolio summery month and year")
	public void click_Portfolio_summery_month_and_year() throws Throwable 
	{
		
		cli = new ClientDashBord(driver);
		driver.switchTo().frame(0);
		cli.clickmonthdrop();
		cli.Selectmonth();
		cli.clickyeardrop();
		cli.Selectyear();
	}

	@Then("click search button")
	public void click_search_button() 
	{
		cli = new ClientDashBord(driver);
		cli.clicksearchbutton();
	}
	
}
