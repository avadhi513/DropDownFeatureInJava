package org.menu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectedOptions {
	
	public static void main(String[] args) {
		
		// Configure the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
			
		// Launch the browser
		WebDriver wd = new ChromeDriver();
		
		// To get specific url
		wd.get("https://demoqa.com/select-menu");
		
		WebElement car = wd.findElement(By.id("cars"));
		
		Select s = new Select(car);
		
		// check whether DD is single or multiple selected
		boolean mt = s.isMultiple();
		System.out.println(mt);
		
		// select the option from DD
		
		s.selectByValue("saab");
		s.selectByVisibleText("Audi");
		s.selectByIndex(0);
		
		// To print the number of options in the console
		List<WebElement> op1 = s.getOptions();
		int count = op1.size();
		System.out.println(count);
		
		// To print the Dd values in the console using get text
		List<WebElement> op3 = s.getOptions();
		for(WebElement x : op3) {
			String text = x.getText();
			System.out.println(text);
		}
		
		// To print First Selected Option
		WebElement fs = s.getFirstSelectedOption();
		String att1 = fs.getAttribute("value");
		System.out.println(att1);
		
		// To print all the selected options
		List<WebElement> all = s.getAllSelectedOptions();
		for(WebElement y : all) {
			System.out.println(y.getText());
		}
			
		// deselect
//		s.deselectByValue("saab");
//		s.deselectByVisibleText("Audi");
//		s.deselectByIndex(0);
		
		s.deselectAll();

		
	}

}
