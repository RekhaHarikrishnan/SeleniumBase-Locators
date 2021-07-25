package org.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathToolsqa
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjithrekha\\eclipse-workspace\\SeleniumLocators\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}

}
