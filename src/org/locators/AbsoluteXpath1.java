package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjithrekha\\eclipse-workspace-new\\SeleniumLocators\\Driver\\chromedrivernew.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/LOGIN");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div[1]/label/div/div[2]/div/input"));
		
		userName.sendKeys("rekhamca.h88@gmail.com");
		
	
		WebElement password = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div[2]/label/div/div[2]/div/input"));
		
		password.sendKeys("Vibin@@16");
		
		
		WebElement login = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div[2]/form/div/div[3]/div/div/span"));
		login.click();
		
	}

}
