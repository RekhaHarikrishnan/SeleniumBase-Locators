package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjithrekha\\eclipse-workspace-new\\SeleniumLocators\\Driver\\chromedrivernew.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div/span"));
		signin.click();
		
		WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input"));
		email.sendKeys("rekhamca.h88@gmail.com");
		
		WebElement continue1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span/span/input"));
		continue1.click();

	}

}
