package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ranjithrekha\\eclipse-workspace-new\\SeleniumProject\\Driver\\chromedrivernew.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div/form/div/div/div/label/input"));
		userName.sendKeys("rekhamca.h88@gmailcom");
		
		

	}

}
