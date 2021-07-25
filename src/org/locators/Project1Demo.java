package org.locators;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project1Demo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ranjithrekha\\eclipse-workspace-new\\SeleniumLocators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		signIn.click();
		
		WebElement emailId = driver.findElement(By.name("email_create"));
		emailId.sendKeys("Vibin123456@gmail.com");
		
		WebElement createAcnt = driver.findElement(By.name("SubmitCreate"));
		createAcnt.click();
		
		Thread.sleep(3000);
		WebElement radioBtn = driver.findElement(By.xpath(("//input[@value='2']")));
		radioBtn.click();
		
		WebElement firstName = driver.findElement(By.id("customer_firstname"));
		firstName.sendKeys("Rekha");
		
		WebElement lastName = driver.findElement(By.id("customer_lastname"));
		lastName.sendKeys("Harikrishnan");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("jenishaa");
		
		WebElement day = driver.findElement(By.name("days"));
		Select s =new Select(day);
		s.selectByValue("8");
		
		WebElement month = driver.findElement(By.id("months"));
		Select s1 = new Select(month);
		s1.selectByIndex(2);
		
		WebElement year = driver.findElement(By.name("years"));
		Select s2 = new Select(year);
		s2.selectByValue("1988");
		
		WebElement checkBox = driver.findElement(By.name("optin"));
		checkBox.click();
		
		WebElement concern = driver.findElement(By.id("company"));
		concern.sendKeys("Wipro");
		
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("Kambar Street,Wipro,ch-60012");
		
		WebElement address1 = driver.findElement(By.id("address2"));
		address1.sendKeys("No:A1,vishya homes,annastreet,ch-600047");
		
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Chennai");
		
		WebElement state = driver.findElement(By.name("id_state"));
		Select s3= new Select(state);
        s3.selectByVisibleText("Louisiana");
        
        WebElement pinCode = driver.findElement(By.id("postcode"));
        pinCode.sendKeys("60001");
        
        WebElement inform = driver.findElement(By.id("other"));
        inform.sendKeys("Filling The Form ");
        
        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("32147896");
        
        
        WebElement mobile = driver.findElement(By.id("phone_mobile"));
        mobile.sendKeys("24896325");
        
        WebElement address3 = driver.findElement(By.id("alias"));
        address3.sendKeys("No:A2, ch-600051");
        
        WebElement register = driver.findElement(By.name("submitAccount"));
        register.click();
        
        
     
       TakesScreenshot t = (TakesScreenshot)driver;
       File source = t.getScreenshotAs(OutputType.FILE);
       File destination = new File("C:\\Users\\ranjithrekha\\eclipse-workspace-new\\SeleniumLocators\\Screenshot\\automationpractice.com/index.php.png");
        
       FileUtils.copyFile(source, destination);
       
        
        
		

	}

}
