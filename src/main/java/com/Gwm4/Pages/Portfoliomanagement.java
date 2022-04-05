package com.Gwm4.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Portfoliomanagement {
	
	 WebDriver driver;
	 
	@FindBy(how=How.XPATH,using="html/body/div[1]/div/nav/div/ul/li[1]/ul/li/div/div/div[2]/div/div/ul/li[2]/a")
	WebElement link_Portfoliomanagement;
	@FindBy(how=How.XPATH,using="//*[@id='zoid-sector']/app-model-portfolio-list/div/div/div/div[3]/button")
	WebElement btn_CreatemodelPortfolio;
	//*[contains(text(),'Create Model Portfolio')]
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-0']")
	WebElement txt_modelname;
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Select Risk Profile')]")
	WebElement drop_riskprofile;
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Test')]")
	WebElement Select_riskprofilevalue;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-1']")
	WebElement click_recommendedportfolio;
	
	@FindBy(how=How.XPATH,using="//*[@id='cdk-overlay-1']/div/div/div[1]/div[1]/div/span[1]")
	WebElement select_recommendedportfolio;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Apply')]")
	WebElement btn_Apply;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-2']")
	WebElement txt_Profilesize;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-select-value-5']")
	WebElement Click_FundSource;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Test')]")
	WebElement select_FundSource;
	
	@FindBy(how=How.XPATH,using="//*[@id='mat-input-3']")
	WebElement txt_Corridor;
	
	
	
	public Portfoliomanagement(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void ClickPortfoliomgmt()
	{
		link_Portfoliomanagement.click();
	}
	
	public void ClickCreatemodelPortfolio()
	{
		btn_CreatemodelPortfolio.click();
	}
	
	public void EnterModelName(String Modelname)
	{
		txt_modelname.sendKeys(Modelname);
	}
	
	public void ClickRiskProfile()
	{
		drop_riskprofile.click();
	}
	
	public void SelectRiskProfile()
	{
		Select_riskprofilevalue.click();
	}
	
	public void ClickRecommendedPortfolio()
	{
		click_recommendedportfolio.click();
	}
	
	public void SelectCountry()
	{
		select_recommendedportfolio.click();
	}
	
	public void ClickApply()
	{
		btn_Apply.click();
	}
	
	public void EnterProfileSize(String profilesize)
	{
		txt_Profilesize.sendKeys(profilesize);
	}
	
	
	public void ClickFundsource()
	{
		Click_FundSource.click();
	}
	
	public void SelectFundsource()
	{
		select_FundSource.click();
	}
	
	
	public void EnterCorridor(String corridor)
	{
		txt_Corridor.sendKeys(corridor);
	}
	
		
	
	
}
