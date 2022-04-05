package StepDefination;

import org.openqa.selenium.By;

import com.Gwm4.Pages.Role;
import com.Utilities.BrowserSetUp;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddRole_Steps extends BrowserSetUp
{
	Role role;
	
	public AddRole_Steps() throws Throwable 
	{
		super();
		
	}

	@Given("user Click AddRole")
	public void user_Click_AddRole() 
	{
		role = new Role(driver);
		role.ClickRole();  
	}

	@Then("Enter Role details")
	public void enter_Role_details() throws Throwable 
	{
		role = new Role(driver);
		Thread.sleep(5000);
	    role.ClickOrgUnit();
	    role.SelectOrgUnit();
	    role.SelectRoleType();
	    role.ClickRoleType();	    
	    role.ClickRoleName();
	    role.SelectRoleName();
	    role.ClickValidDate();
	    role.EnterFromdate();
	    role.EnterValidTo();    
	    
	}
	@Then("Verify Login ID")
	public void verify_Login_ID() throws Throwable 
	{
	driver.findElement(By.xpath("//*[@id='zoid-sector']/div/app-persondetails/div/div/div[2]/button")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='mat-tab-content-2-0']/div/div[2]/div/div[2]/img[1]")).click();
	driver.findElement(By.xpath("//*[@id='mat-radio-8']/label/span")).click();
	driver.findElement(By.xpath("//*[@id='mat-input-25']")).sendKeys("PhillipQAO");
	driver.findElement(By.xpath("//*[contains(text(),'Retrieve')]")).click();
	
	}
	
}
