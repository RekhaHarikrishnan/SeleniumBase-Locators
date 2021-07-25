package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjithrekha\\eclipse-workspace\\SeleniumLocators\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		
		WebElement Enter = driver.findElement(By.name("username"));
		Enter.sendKeys("rekha");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("vibin");
	}

}
