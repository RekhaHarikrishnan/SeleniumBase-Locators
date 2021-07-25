package org.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFacebook 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjithrekha\\eclipse-workspace\\SeleniumLocators\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement Login = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		Login.sendKeys("rekhamca.h88@gmail.com");
		
		Thread.sleep(7000);
		WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Password.sendKeys("Vibin@@16");
	    
		
		WebElement Button = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		Button.click();
		
	}

}
