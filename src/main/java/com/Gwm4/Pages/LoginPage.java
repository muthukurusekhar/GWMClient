package com.Gwm4.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{	
  
  
  @FindBy(how=How.XPATH,using="//*[@id='UserID']") 
  WebElement txt_username; 
  @FindBy(how=How.XPATH,using="//*[@id='input-pwd']") 
  WebElement txt_password;
  @FindBy(how=How.XPATH,using="//*[@id='loginform']/div[3]/div/button") 
  WebElement btn_Login;
  @FindBy(how=How.XPATH,using="//*[@class='btn btn-outline-primary']") 
  WebElement btn_skip;
  
  
  @FindBy(how=How.XPATH,using="//*[contains(text(),'Forgot User ID?')]") 
  WebElement link_ForgotUserID;
  @FindBy(how=How.XPATH,using="//*[@id='input-nric']") 
  WebElement txt_NRIC;
  @FindBy(how=How.XPATH,using="//*[@id='DateofBirth']") 
  WebElement txt_NRICDOB;
  @FindBy(how=How.XPATH,using="//*[contains(text(),'Recover my User ID')]") 
  WebElement btn_RecovermyUserID;
  
  
  @FindBy(how=How.XPATH,using="//*[contains(text(),'Forgot Password?')]") 
  WebElement Link_ForgotPassword;
  @FindBy(how=How.XPATH,using="//*[contains(text(),'Reset my Password')]") 
  WebElement btn_ResetPassword;
  @FindBy(how=How.XPATH,using="//*[@id='UserID']") 
  WebElement txt_userid;
  @FindBy(how=How.XPATH,using="//*[contains(text(),'Reset my Password')]") 
  WebElement btn_ResetmyPassword;
  
  
  
  
  
  WebDriver driver;
  
  public LoginPage(WebDriver driver)
  {
	 this.driver= driver;
	 PageFactory.initElements(driver, this);
  }
  
  public void Enterusername(String Username) 
  {
	  txt_username.sendKeys(Username); 
  }
  
  public void Enterpassword(String Password) 
  {
	txt_password.sendKeys(Password); 
  }
  public void ClickLoginbtn () 
 {
	  btn_Login.click();
 }
  
  public void ClickSkipbtn () 
  {
	  btn_skip.click();
  }
	
  public void ClickforgotUserId() 
  {
	  link_ForgotUserID.click();
  }
  
  public void EnterNRIC(String nric) 
  {
	  txt_NRIC.sendKeys(nric);
  }
  
  public void EnterNRICDob(String nricDob) 
  {
	  txt_NRICDOB.sendKeys(nricDob);
  }
  
  public void ClickRecovermyUserID() 
  {
	  btn_RecovermyUserID.click();
  }
  public void ClickForgotPassword() 
  {
	  Link_ForgotPassword.click();
  }
  
  public void ClickResetPassword() 
  {
	  btn_ResetPassword.click();
  }
  
  public void EnterUserID(String UserId) 
  {
	  txt_userid.sendKeys(UserId);
  }
  

}
