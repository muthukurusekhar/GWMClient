package com.Gwm4.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Role {
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Add Role')]") 
	  WebElement btn_Role;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-select-value-13']/span") 
	  WebElement btn_OrgUnit;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(), 'QA Team I')]") 
	  WebElement Select_OrgUnit;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-select-value-15']/span") 
	  WebElement Select_RoleType;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-option-671']/span") 
	  WebElement Click_Role;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-select-value-17']/span") 
	  WebElement Click_RoleName;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-option-674']/span") 
	  WebElement Select_RoleName;	
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-date-range-input-0']") 
	  WebElement Click_Validdate;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),' 22')]") 
	  WebElement select_Validfrom;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),' 29')]") 
	  WebElement Select_ValidTo;
	

	
	 WebDriver driver;
	  
	  public Role(WebDriver driver)
	  {
		  this.driver= driver;
		  PageFactory.initElements(driver, this);
	  }
	  
	
	public void ClickRole() 
	  {			
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click();", btn_Role);	 
		
	  }	
	
	public void ClickOrgUnit() 
	  {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", btn_OrgUnit);
		 
	  }	
	
	public void SelectOrgUnit() 
	  {
		Select_OrgUnit.click(); 
	  }	
	
	public void SelectRoleType() 
	  {
		Select_RoleType.click(); 
	  }	
	
	
	public void ClickRoleType() 
	  {
		Click_Role.click(); 
	  }	
	
	
	public void ClickRoleName() 
	  {
		Click_RoleName.click(); 
	  }	
	
	
	public void SelectRoleName() 
	  {
		Select_RoleName.click(); 
	  }	
	
	public void ClickValidDate() 
	  {
		Click_Validdate.click(); 
	  }	
	
	public void EnterFromdate() 
	  {
		select_Validfrom.click();
	  }	
	
	public void EnterValidTo() 
	  {
		Select_ValidTo.click(); 
	  }	
	




}
