package org.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
	
	public static void main(String[] args) {
		
		// Configure the driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// To get specific url
		driver.get("https://www.facebook.com/");
		
		WebElement txtMail = driver.findElement(By.id("email"));
		
		// Typecast javascript executor to webdriver
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value', 'selenium')", txtMail);
		
		Object obj = js.executeScript("return arguments[0].getAttribute('value')", txtMail);
		
		// object to string - typecast
		String s1 = (String)obj;
		System.out.println(s1);
		
		WebElement txtPwd = driver.findElement(By.id("email"));
		
		// Typecast javascript executor to webdriver
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value', 'selenium')", txtPwd);
		
		Object obj1 = js1.executeScript("return arguments[0].getAttribute('value')", txtPwd);
		
		// object to string - typecast
		String s2 = (String)obj1;
		System.out.println(s2);
		
		WebElement btn = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", btn);
		
	}

}
