package com.Gwm4.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Contact {
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"mat-select-8\"]/div/div[2]") 
	  WebElement Click_AddressType;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),' Home Address ')]") 
	  WebElement Select_AddressType;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-7']") 
	  WebElement txt_Address1;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-8']") 
	  WebElement txt_Address2;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-9']") 
	  WebElement txt_Address3;	
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-10']") 
	  WebElement txt_PostalCode;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-11']") 
	  WebElement txt_City;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-12']") 
	  WebElement txt_State;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-13']") 
	  WebElement txt_Country;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-14']") 
	  WebElement txt_Officenumber;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-15']") 
	  WebElement txt_HomeNumber;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-16']") 
	  WebElement txt_MobileNumber;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-17']") 
	  WebElement txt_Emailid;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Save')]") 
	  WebElement btn_Save;
	
	
	
	
	
	
		
	
	 WebDriver driver;
	  
	  public Contact(WebDriver driver)
	  {
		  this.driver= driver;
		  PageFactory.initElements(driver, this);
	  }
	  
	
	public void ClickAddressType() 
	  {
		Click_AddressType.click(); 
	  }	
	
	public void SelectAddress() 
	  {
		Select_AddressType.click(); 
	  }	
	
	public void EnterAddress1(String addres1) 
	  {
		txt_Address1.sendKeys(addres1); 
	  }	
	
	public void EnterAddress2(String addres2) 
	  {
		txt_Address2.sendKeys(addres2); 
	  }	
	
	public void EnterAddress3(String addres3) 
	  {
		txt_Address3.sendKeys(addres3); 
	  }	
	
	public void EnterPostalCode(String Postalcode) 
	  {
		txt_PostalCode.sendKeys(Postalcode); 
	  }	
	
	public void EnterCity(String city) 
	  {
		txt_City.sendKeys(city); 
	  }	
	
	public void EnterState(String state) 
	  {
		txt_State.sendKeys(state); 
	  }	
	
	public void Entercountry(String country) 
	  {
		txt_Country.sendKeys(country); 
	  }	
	
	public void EnterOfficenum(String officenumber) 
	  {
		txt_Officenumber.sendKeys(officenumber); 
	  }	
	
	public void EnterHomenum(String homenumber) 
	  {
		txt_HomeNumber.sendKeys(homenumber); 
	  }	
		
	public void EnterMobilenum(String mobilenumber) 
	  {
		txt_MobileNumber.sendKeys(mobilenumber); 
	  }	
	
	public void EnterEmailId(String email) 
	  {
		txt_Emailid.sendKeys(email); 
	  }	
	
	
	
	

}
