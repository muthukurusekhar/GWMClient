package StepDefination;

import com.Gwm4.Pages.Contact;
import com.Gwm4.Pages.PersonalParticulars;
import com.Utilities.BrowserSetUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class PersonalParticulars_Steps extends BrowserSetUp{
	public PersonalParticulars_Steps() throws Throwable {
		super();
		
	}
	PersonalParticulars per;
	Contact con;
	

	@Then("click portfolio dropdown")
	public void click_portfolio_dropdown() throws Throwable 
	{
		Thread.sleep(5000);
		per = new PersonalParticulars(driver);
		per.ClickPortfolio();
	}
	
	@Given("user navigate to pending Tranation page")
	public void user_navigate_to_pending_Tranation_page() throws Throwable 
	{
		Thread.sleep(5000);
		per = new PersonalParticulars(driver);
		per.ClickPortfolio();
		per.ClickPendingTrans();
		

	}

	
	  @Then("Click Create person") 
	  public void click_Create_person() throws Throwable 
	  { 
	  
	  per = new PersonalParticulars(driver);
	  Thread.sleep(5000);
	  driver.switchTo().frame(0);
	  per.ClickCreatePerson();
	    
	  }
	  
	  @Then("enter valid details {string} , {string} , {string} , {string} , {string} and {string}")
	  public void enter_valid_details_and(String firstName, String lastName, String Id, String nation, String Race, String Remarks) throws Throwable 
	  {
	  
	  Thread.sleep(5000);
	  per = new PersonalParticulars(driver);
	  per.ChooseTitle();
      per.ClickParticularTitle();
	  per.EnterFirstName(firstName); 
	  per.EnterLastName(lastName);
	  per.SelectIDType(); 
	  per.SelectId();
	  per.EnterID(Id);
	  per.ClickDOB();
	  per.ClickYear();
	  per.ClickArrow();
	  per.ClickExactdate();
	  per.ClickMonth();
	  per.ClickDay();
	  per.ClickMetirialStatus();
	  per.SelectMetirialStatus();
	  per.SelectRadiobutton(); 
	  per.SelectNation(nation); 
	  per.SelectRace(Race);
	  per.EnterRemarks(Remarks);
	  
	  
	  }
	  
	  @Then("Click save") public void click_save() throws Throwable 
	  {
	   Thread.sleep(3000); 
	   per = new PersonalParticulars(driver);
	   per.ClickSaveButton(); 
	  
	  }
	  @Then("Click next")
	  public void click_next() 
	  {
		  per = new PersonalParticulars(driver);
	      per.ClickNextButton();
	  }
	  @Given("Enter valid address {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} and {string}")
	  public void enter_valid_address_and(String addres1, String addres2, String addres3, String Postalcode, String city, String state, String country, String officenumber, String homenumber, String mobilenumber, String email) throws Throwable 
	  {
		 Thread.sleep(3000);
		 con = new Contact(driver) ;
		 con.ClickAddressType();
		 con.SelectAddress();
	     con.EnterAddress1(addres1);
	     con.EnterAddress2(addres2);
	     con.EnterAddress3(addres3);
	     con.EnterPostalCode(Postalcode);
	     con.EnterCity(city);
	     con.EnterState(state);
	     con.Entercountry(country);
	     con.EnterOfficenum(officenumber);
	     con.EnterHomenum(homenumber);
	     con.EnterMobilenum(mobilenumber);
	     con.EnterEmailId(email);
	  }


}
