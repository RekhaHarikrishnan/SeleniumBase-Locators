package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjithrekha\\eclipse-workspace\\SeleniumLocators\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(0);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		WebElement Login = driver.findElement(By.xpath("(//input[@autocorrect='off'])[1]"));
		
		Login.sendKeys("Rekha");
		
	    WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
	    
	    Password.sendKeys("Vibin@@16");
	    
	    WebElement LButton = driver.findElement(By.xpath("//button[contains(@class,'sqdOP  ')]"));
	    
	    LButton.click();
	}

}