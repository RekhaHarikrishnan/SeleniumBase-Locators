package org.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ranjithrekha\\eclipse-workspace\\SeleniumLocators\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		// Locators

		WebElement Email = driver.findElement(By.name("email"));
		Email.sendKeys("rekhamca.h88@gmail.com");

		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("Vibin@@16");

	   // WebElement Login = driver.findElement(By.name("login"));
		//Login.click();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		WebElement From = driver.findElement(By.id("src"));
		From.sendKeys("Chennai");

		WebElement To = driver.findElement(By.id("dest"));

		To.sendKeys("Banglore");

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		WebElement Enter = driver.findElement(By.name("q"));
		Enter.sendKeys("Greens Technology");

		// driver.get("https://www.lvbankonline.in/index.html?module=login");

		// driver.manage().window().maximize();

		// WebElement Name = driver.findElement(By.id("login_username|input"));

		// Name.sendKeys("Rekha");
		// WebElement Password1 = driver.findElement(By.id("login_password|input"));
		// Password1.sendKeys("vibin");

		driver.get("https://twitter.com/LOGIN");
		driver.manage().window().maximize();

		WebElement Username1 = driver.findElement(By.name("session[username_or_email]"));

		Username1.sendKeys("Rekha");

		WebElement pwd = driver.findElement(By.name("session[password]"));
		pwd.sendKeys("vibin");

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();

		// WebElement Coustmerid = driver.findElement(By.name("fldLoginUserId"));

		// Coustmerid.sendKeys("2467899");

		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();

		WebElement Location = driver.findElement(By.id("location"));
		Location.sendKeys("Chennai");
		
		
		driver.get("https://www.snapdeal.com/login");
		driver.manage().window().maximize();
       WebElement MobileNo = driver.findElement(By.name("username"));
		MobileNo.sendKeys("1246788");
		
		

	}

}
