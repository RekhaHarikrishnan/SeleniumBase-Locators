package org.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFaceBook 
{

	public static void main(String[] args) throws InterruptedException 
	{
   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjithrekha\\eclipse-workspace\\SeleniumLocators\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement Create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Create.click();
		
		Thread.sleep(6000);
		
		WebElement FirstName = driver.findElement(By.xpath("(//input[@data-type='text'])[1]"));
		FirstName.sendKeys("Rekha");
		
		WebElement LastName = driver.findElement(By.name("lastname"));
		LastName.sendKeys("Harikrishnan");
		
		
		WebElement Mobile = driver.findElement(By.xpath(("(//input[contains(@class,'_58mg ')])[3]")));
		Mobile.sendKeys("9840344950");
		
		WebElement Password = driver.findElement(By.xpath("//input[@data-type='password']"));
		Password.sendKeys("Jenishaa@@16");
		
		WebElement Day = driver.findElement(By.id("day"));
		Select s = new Select(Day);
		s.selectByValue("6");
		
		
		WebElement Month = driver.findElement(By.id("month"));
		Select s1 = new Select(Month);
	    s1.selectByVisibleText("Feb"); 	
	 	
	    WebElement Year = driver.findElement(By.id("year"));
		Select s2 = new Select(Year);
		s2.selectByIndex(9);
		
		WebElement RBTN = driver.findElement(By.xpath(("(//input[contains(@class,'_8esa')])[1]")));
		
		RBTN.click();
		
		
		WebElement Signup = driver.findElement(By.name("websubmit"));
		Signup.click();
		
	
		
		
		
		

	}
	
	
	

}
