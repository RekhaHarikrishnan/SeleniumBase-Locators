package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Greens
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjithrekha\\eclipse-workspace\\SeleniumLocators\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		driver.manage().window().maximize();
		
		
		WebElement Cts = driver.findElement(By.xpath("//a[@data-target='#interview8']"));
		Cts.click();
		
	}

}
