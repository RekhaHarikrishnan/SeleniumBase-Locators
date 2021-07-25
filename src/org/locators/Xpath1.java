package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjithrekha\\eclipse-workspace\\SeleniumLocators\\Driver\\chromedriver.exe");
     
		WebDriver driver  = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn");
	    driver.manage().window().maximize();
	    
	    WebElement Login = driver.findElement(By.xpath("//input[@name='DUMMY1']"));
	
	    Login.sendKeys("Rekha");
	
	
	    WebElement MobilleNo = driver.findElement(By.xpath("((//input[@type='text'])[4]"));
	    
	    MobilleNo.sendKeys("12467890");	
	}
	
	
	

}
