package org.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeoWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjithrekha\\eclipse-workspace-new\\SeleniumLocators\\Driver\\chromedrivernew.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		
		driver.manage().window().maximize();
		
		System.out.println("**** All Data ****");
		List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement data : allData)
        {
             String text = data.getText();
			 System.out.println(text);
			
		}
		
		System.out.println("**** Row Data****");
		List<WebElement> rowData = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
		for (WebElement data : rowData)
        {
             String text = data.getText();
			 System.out.println(text);
			
		}
		
		System.out.println("****Column Data****");
		List<WebElement> columnData = driver.findElements(By.xpath("//table/tbody/tr/td[6]"));
		for (WebElement data : columnData)
        {
             String text = data.getText();
			 System.out.println(text);
			
		}
		
		System.out.println("****Particular Data****");
		WebElement partdata = driver.findElement(By.xpath("//table/tbody/tr[4]/td[5]"));
		String text = partdata.getText();
		System.out.println(text);
		
	}

}
