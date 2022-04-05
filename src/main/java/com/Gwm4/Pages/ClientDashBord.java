package com.Gwm4.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ClientDashBord 
{
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/nav/div/ul/li[1]/ul/li/div/div/div[2]/div/div[2]/ul/li/a")
	WebElement link_ClientDashbord;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-select-value-1']")
	WebElement drop_month;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),' Jan')]")
	WebElement Select_month;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-select-value-3']")
	WebElement drop_year;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),' 2022')]")
	WebElement Select_year;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Search')]")
	WebElement btn_search;
	
	
	WebDriver driver;
	
	
	public ClientDashBord(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickClientdashbord()
	{
		link_ClientDashbord.click();
	}
	
	public void clickmonthdrop()
	{
		drop_month.click();
	}
	
	public void Selectmonth()
	{
		Select_month.click();
	}
		
	
	public void clickyeardrop()
	{
		drop_year.click();
	}
	
	public void Selectyear()
	{
		Select_year.click();
	}
	
	public void clicksearchbutton()
	{
		btn_search.click();
	}
	
	
	
	
	
	
	

}
