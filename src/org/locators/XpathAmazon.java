package org.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAmazon
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjithrekha\\eclipse-workspace\\SeleniumLocators\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(22000);
		
		WebElement findElement = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		findElement.click();
		
		WebElement Create = driver.findElement(By.xpath("//a[@role='button']"));
		Create.click();
        
        WebElement Name = driver.findElement(By.xpath("//input[@tabindex='1']"));
       
        Name.sendKeys("Rekha.H");
        
        
        WebElement MobileNo = driver.findElement(By.xpath(("//input[@tabindex='3']")));
        MobileNo.sendKeys("9840344950");
        
        WebElement Email = driver.findElement(By.xpath("//input[@autocomplete='email']"));
        Email.sendKeys("rekhamca.h88@gmail.com");
        
        WebElement Password = driver.findElement(By.xpath("//input[@maxlength='1024']"));
        Password.sendKeys("Vibin@@16"); 
        
        WebElement Continue = driver.findElement(By.xpath("//input[@tabindex='8']"));
        Continue.click();
        
	}
	

}
