package com.Gwm4.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLogin 
{
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Create Login')]") 
	  WebElement btn_createLogin;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-23']") 
	  WebElement txt_Loginid;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Check Availability')]") 
	  WebElement btn_checkAvailabulity;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-18']") 
	  WebElement txt_Validfrom;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-19']") 
	  WebElement txt_ValidTo;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-select-value-11']/span") 
	  WebElement btn_Action;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Password via email')]") 
	  WebElement txt_Save_mail;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-dialog-0']/app-logindialog/mat-dialog-actions/button[2]") 
	  WebElement txt_CreateloginSave;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Next')]") 
	  WebElement btn_Next;	
	
		
	
	 WebDriver driver;
	  
	  public CreateLogin(WebDriver driver)
	  {
		  this.driver= driver;
		  PageFactory.initElements(driver, this);
	  }
	  
	
	public void ClickcreateLogin() 
	  {
		btn_createLogin.click(); 
	  }	
	
	public void EnterLoginId(String LoginId) 
	  {
		txt_Loginid.sendKeys(LoginId); 
	  }	
	
	
	public void ClickcheckAvailabulity() 
	  {
		btn_checkAvailabulity.click(); 
	  }	
	
	
	public void entervalidFrom(String validfrom) 
	  {
		txt_Validfrom.sendKeys(validfrom); 
	  }	
	
	
	public void entervalidTo(String ValidTo) 
	  {
		txt_ValidTo.sendKeys(ValidTo);
	  }	
	
	public void ClickAction() 
	  {
		btn_Action.click(); 
	  }	
	
	
	public void SelectAction() 
	  {
		txt_Save_mail.click(); 
	  }	
	
	public void ClickcreateSave() 
	  {
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", txt_CreateloginSave);
		
	  }	
	
	
	
	
	
	
}
