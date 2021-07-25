package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ranjithrekha\\eclipse-workspace-new\\SeleniumProject\\Driver\\chromedrivernew.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input"));
		email.sendKeys("rekhamca.h88@gmail.com");
		
		WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input"));
		username.sendKeys("Vibin@@16");
		
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/div/div/form/div[2]/button"));
        login.click();
		
	}

}
