package StepDefination;

import com.Gwm4.Pages.PersonalParticulars;
import com.Utilities.BrowserSetUp;
import com.Gwm4.Pages.Contact;
import com.Gwm4.Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;


public class LoginOrder_Steps extends BrowserSetUp{
	
	static Logger logger = Logger.getLogger(LoginOrder_Steps.class);
	
	
	public LoginOrder_Steps() throws Throwable 
	{
		super();		
	}

	LoginPage log;
	PersonalParticulars per;
	Contact con;
	
	
	
	@Given("user Open browser and Enter GWM URL")
	public void user_Open_browser_and_Enter_GWM_URL() throws Throwable 
	{
		logger.info(" Script started");
		BrowserSetUp.initialization();	
	}


	@Then("user enter valid {string} and {string} and click login")
	public void user_enter_valid_and_and_click_login(String Username, String Password) throws Throwable 
	{	
		log = new LoginPage(driver);
		log.Enterusername(Username);
		log.Enterpassword(Password);
		log.ClickLoginbtn();	

	}
	
	@Then("Click Skip now")
	public void click_Skip_now() throws Throwable 
	{
		Thread.sleep(5000);//later need to some miner change
		log = new LoginPage(driver);
		driver.switchTo().frame(0);
		log.ClickSkipbtn();
	}
	
	@Then("Verify {string} able to login or not")
	public void verify_able_to_login_or_not(String ClientName) 
	{
		

	}
	

	@Then("Click Forgot UserID link")
	public void click_Forgot_UserID_link() 
	{
		log = new LoginPage(driver);
		log.ClickforgotUserId();

	}
	
	@Then("Enter  {string}  and {string} and click Recover my User Id button")
	public void enter_and_and_click_Recover_my_User_Id_button(String nric, String nricDob) 
	{
		log = new LoginPage(driver);		
		log.EnterNRIC(nric);
		log.EnterNRICDob(nricDob);
		log.ClickRecovermyUserID();
	}
	
	@Then("Click Forgot Password link")
	public void click_Forgot_Password_link() 
	{
		log = new LoginPage(driver);
		log.ClickForgotPassword();

	}

	@Then("Click Reset my Password button")
	public void click_Reset_my_Password_button() 
	{
		log = new LoginPage(driver);
		log.ClickResetPassword();

	}

	@Then("Enter details {string} , {string} and {string} and click Reset my Password button")
	public void enter_details_and_and_click_Reset_my_Password_button(String UserId, String nric, String nricDob) 
	{
		log = new LoginPage(driver);
		log.EnterUserID(UserId);
		log.EnterNRIC(nric);
		log.EnterNRICDob(nricDob);
		log.ClickResetPassword();
	}
	
	

	
	
	

}
