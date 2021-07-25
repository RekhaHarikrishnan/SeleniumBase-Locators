package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjithrekha\\eclipse-workspace\\SeleniumLocators\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/LOGIN");
		driver.manage().window().maximize();
		
		
		WebElement Login = driver.findElement(By.xpath("(//input[@autocorrect='off'])[1]"));
		Login.sendKeys("Rekha");
		
		
		WebElement Password = driver.findElement(By.xpath("(//input[@autocomplete='on'])[2]"));
		Password.sendKeys("vibin2216");
		
		WebElement Button = driver.findElement(By.xpath("//span[@class='css-901oao css-16my406 css-bfa6kz r-poiln3 r-bcqeeo r-qvutc0']"));
		Button.click();
	}

}
