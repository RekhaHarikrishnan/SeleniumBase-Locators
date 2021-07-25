package org.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ranjithrekha\\eclipse-workspace-new\\SeleniumLocators\\Driver\\chromedrivernew.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		driver.manage().window().maximize();
		
		//Scroll Down		
		
	     //WebElement village = driver.findElement(By.xpath("//a[text()='Village pump']"));
		
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	     Thread.sleep(5000);
		
		//JavascriptExecutor  js = (JavascriptExecutor) driver;
	     //js.executeScript("arguments[0].scrollIntoView();", village);
	     
	     
	     //scroll up
	     //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	     
	    // WebElement doYouWord = driver.findElement(By.xpath(("(//a[text()='June 17'])[1]")));
	     
	    // JavascriptExecutor js1 = (JavascriptExecutor) driver;	
	    // js1.executeScript("arguments[0].scrollIntoView();", doYouWord);
	     
	     
	     //Scroll Bottom of the page
	     
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	     
	}

}
