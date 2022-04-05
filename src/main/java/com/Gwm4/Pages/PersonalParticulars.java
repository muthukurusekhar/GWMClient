package com.Gwm4.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PersonalParticulars {
	
	
	@FindBy(how=How.XPATH,using="//*[@id='servicesDropdown']") 
	  WebElement Click_Portfolio; 
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/nav/div/ul/li[1]/ul/li/div/div/div[2]/div/div[1]/ul/li/a") 
	  WebElement click_PendingTrans;
			
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Create Person')]") 
	  WebElement Click_CreatePerson;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-select-value-3']") 
	  WebElement SelectTitle;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),' Mr. ')]") 
	  WebElement ClickTitle;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-0']") 
	  WebElement txt_FirstName;
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-1']") 
	  WebElement txt_Lastname;
	@FindBy(how=How.XPATH,using="//*[@class='mat-select-arrow-wrapper ng-tns-c72-15']") 
	  WebElement IdType;
	@FindBy(how=How.XPATH,using="//*[contains(text(),'NRIC')]")	
	  WebElement SelectID;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-2']") 
	  WebElement txt_IdentityNumber;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-3']") 	  
	  WebElement Click_DOB;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-calendar-button-0']") 	  
	  WebElement Click_Year;
	
	@FindBy(how=How.XPATH,using="//*[@aria-label='Previous 24 years']") 	  
	  WebElement Click_LeftArrow;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),' 1992 ')]") 	  
	  WebElement Click_CorrectYear;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),' FEB ')]") 	  
	  WebElement Click_month;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),' 6 ')]") 	  
	  WebElement Click_day;
	
	
	@FindBy(how=How.XPATH,using="//*[@class='mat-select-arrow-wrapper ng-tns-c72-19']") 
	  WebElement ClickMetirialSts;
	
		
	@FindBy(how=How.XPATH,using="//*[contains(text(),' Single ')]") 
	  WebElement SelectMetirialSts;
	
	@FindBy(how=How.XPATH,using="//*[@class='mat-radio-label-content']") 
	  WebElement MaleRadio;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-4']") 
	  WebElement SelectNation;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-5']") 
	  WebElement SelectRace;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-6']") 
	  WebElement txt_Remarks;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Save')]") 
	  WebElement btn_Save;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Next')]") 
	  WebElement btn_Next;
	
	
		
	
	  WebDriver driver;
	  
	  public PersonalParticulars(WebDriver driver)
	  {
		  this.driver= driver;
		  PageFactory.initElements(driver, this);
	  }
	  
	
	public void ClickPortfolio() 
	  {
		Click_Portfolio.click(); 
	  }	
	
	public void ClickPendingTrans() 
	  {
		click_PendingTrans.click(); 
	  }

	public void ClickCreatePerson() 
	  {
		Click_CreatePerson.click(); 
	  }

	public void ChooseTitle() 
	  {
		SelectTitle.click(); 
	  }
	public void ClickParticularTitle() 
	  {
		ClickTitle.click(); 
	  }
	public void EnterFirstName(String firstName) 
	  {
		txt_FirstName.sendKeys(firstName); 
	  }
	public void EnterLastName(String lastName) 
	  {
		txt_Lastname.sendKeys(lastName); 
	  }
	public void SelectIDType() 
	  {
		IdType.click(); 
	  }
	public void SelectId() 
	  {
		SelectID.click(); 
	  }
	public void EnterID(String Id) 
	  {
		txt_IdentityNumber.sendKeys(Id);
	  }
	public void ClickDOB() 
	  {
		Click_DOB.click();
	  }
	
	public void ClickYear() 
	  {
		Click_Year.click();
	  }
	
	public void ClickArrow() 
	  {
		Click_LeftArrow.click();
	  }
	
	public void ClickExactdate() 
	  {
		Click_CorrectYear.click();
	  }
	
	public void ClickMonth() 
	  {
		Click_month.click();
	  }
	
	public void ClickDay() 
	  {
		Click_day.click();
	  }
	
	public void EnterDOB(String dob) 
	  {
		Click_DOB.sendKeys(dob); 
	  }
	
	public void ClickMetirialStatus() 
	  {
		ClickMetirialSts.click();
	  }
	public void SelectMetirialStatus() 
	  {
		SelectMetirialSts.click();
	  }
	
	public void SelectRadiobutton() 
	  {
		MaleRadio.click();
	  }
	
	public void SelectNation(String nation) 
	  {
		SelectNation.sendKeys(nation);
	  }
	
	public void SelectRace(String Race) 
	  {
		SelectRace.sendKeys(Race);
	  }
	
	public void EnterRemarks(String Remarks) 
	  {
		txt_Remarks.sendKeys(Remarks);
	  }
	
	public void ClickSaveButton() 
	  {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", btn_Save);
		
	  }
	
	public void ClickNextButton() 
	  {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", btn_Next);
		
	  }
	
	
	
	
	
	
	
	
	
	

}
