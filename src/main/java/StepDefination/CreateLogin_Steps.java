package StepDefination;

import com.Gwm4.Pages.CreateLogin;
import com.Utilities.BrowserSetUp;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateLogin_Steps extends BrowserSetUp{
	
	public CreateLogin_Steps() throws Throwable 
	{
		super();
		
	}

	CreateLogin cre;
	
	
	@Given("user Click Create login")
	public void user_Click_Create_login() 
	{
		cre = new CreateLogin(driver);
		cre.ClickcreateLogin();
		

	}

	@Then("Enter create login details {string} , {string} and {string}")
	public void enter_create_login_details_and(String LoginId, String validfrom, String ValidTo) throws Throwable 
	{
		cre = new CreateLogin(driver);
		cre.EnterLoginId(LoginId);
		cre.ClickcheckAvailabulity();
		cre.entervalidFrom(validfrom);
		cre.entervalidTo(ValidTo);
		cre.ClickAction();
		cre.SelectAction();
		cre.ClickcreateSave();
		//Thread.sleep(5000);

	}


}
