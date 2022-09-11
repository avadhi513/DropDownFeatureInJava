package org.menu;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShoting {

	public static void main(String[] args) throws IOException {

		// Configure the driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// To get specific url
		driver.get("https://www.facebook.com/");

		// typecast
		TakesScreenshot tk = (TakesScreenshot) driver;

		File src = tk.getScreenshotAs(OutputType.FILE);

		File des = new File("C:\\Users\\Aastha\\eclipse-workspace\\DropDownFeatureInJava\\Screenshots\\facebook.png");

		// copy file from src to des
		FileUtils.copyFile(src, des);

	}

}
