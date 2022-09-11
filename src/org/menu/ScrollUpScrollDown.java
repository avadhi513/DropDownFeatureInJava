package org.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpScrollDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Configure the driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// To get specific url
		driver.get("https://www.facebook.com/");
		
		// Typecast webdriver to javascriptExecutor
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement scDown = driver.findElement(By.xpath("//li[text()='English (UK)']"));
		WebElement scUp = driver.findElement(By.xpath("email"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", scDown);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)", scUp);
		
	}

}
