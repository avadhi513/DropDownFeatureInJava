package org.menu;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAndTypeCasting {

	public static void main(String[] args) {

		// Configure the driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// To get specific url
		driver.get("https://www.facebook.com/");

		// Implicit wait - whole page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MICROSECONDS);

		// Explicit Wait - specific locator
		WebElement btn = driver.findElement(By.name("login"));

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10)); // seconds

		WebElement loc = w.until(ExpectedConditions.elementToBeClickable(btn));
		loc.click();

		// Fluent Wait - specific locator but with polling time

		Wait w1 = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10))
				.ignoring(Throwable.class);

		// Typecasting - converting one form 2 another, object 2 web element
        /*float f = 89.67f;
		long l = (long)f;
		System.out.println(l);*/
		
		Object ob = w1.until(ExpectedConditions.elementToBeSelected(btn));
		
		WebElement elem = (WebElement) ob;
		elem.click();


	}

}
