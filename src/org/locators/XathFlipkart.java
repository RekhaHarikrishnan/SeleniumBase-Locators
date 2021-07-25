package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XathFlipkart
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjithrekha\\eclipse-workspace\\SeleniumLocators\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		
		//WebElement Login = driver.findElement(By.xpath("//a[contains(@class,'_1_3w1N')]"));
		//Login.click();
		
		WebElement Phone = driver.findElement(By.xpath(("(//input[@type='text'])[2]")));
		Phone.sendKeys("rekhamca.h88@gmail.com");
		
		
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("Vibin@@16");
		
		
		WebElement Login = driver.findElement(By.xpath(("(//button[contains(@class,'_2KpZ6l ')])[2]")));
		Login.click();

	}

}
