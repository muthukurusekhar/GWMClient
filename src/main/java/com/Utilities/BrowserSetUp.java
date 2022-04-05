package com.Utilities;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserSetUp 
{
	
	public static WebDriver driver;
	public static Properties prop;

	
	public BrowserSetUp() throws Throwable
	{
		prop = new Properties();
		FileInputStream fi = new FileInputStream("C:\\Users\\admin.QA01\\Desktop\\GWMWEB\\config.properties");		
		prop.load(fi);	
		
	}	
	public static void initialization() throws Throwable
	{
		String browserName = prop.getProperty("browser");	
		
		if(browserName.equals("chrome"))
		{
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    }
		
		
		else if(browserName.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
		}
		
		else
		{
			
	    WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
			
		}	
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		// mainer change to put skip if security pop up not there 
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		
		
	}
}
