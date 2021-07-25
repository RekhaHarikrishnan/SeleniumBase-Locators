package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjithrekha\\eclipse-workspace\\SeleniumLocators\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lvbankonline.in/index.html?module=login");
		driver.manage().window().maximize();

		//WebElement Login = driver.findElement(By.name("username"));
		//Login.sendKeys("Rekha");
		
		
		WebElement Login = driver.findElement(By.xpath(("//input[@type='text'][3]")));
		Login.sendKeys("REkha");
		
		
		
	}

}
