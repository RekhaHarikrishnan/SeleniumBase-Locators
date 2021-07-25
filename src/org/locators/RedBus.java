package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {

		String month = "Sept 2021";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ranjithrekha\\eclipse-workspace-new\\SeleniumLocators\\Driver\\chromedrivernew.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		WebElement date = driver.findElement(By.id("onward_cal"));
		date.click();

		Thread.sleep(5000);
		while (true) {
			WebElement calender = driver.findElement(By.xpath("//td[@class='monthTitle']"));
			String text = calender.getText();

			if (text.equals(month)) {
				break;
			} else {
				WebElement arrow = driver.findElement(By.xpath("//td[@class='next']"));
				arrow.click();
			}

		}

		WebElement day1 = driver.findElement(By.xpath("//td[text()='17']"));
		day1.click();

	}

}
