package org.menu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DownAndDrop {

	public static void main(String[] args) {
		
		// Configure the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
			
		// Launch the browser
		WebDriver wd = new ChromeDriver();
		
		// To get specific url
		wd.get("https://www.facebook.com/reg/");
		
		WebElement dt = wd.findElement(By.id("day"));
		
		Select s = new Select(dt);
		
		// check whether DD is single or multiple selected
		boolean mul = s.isMultiple();
		System.out.println(mul);
		
		// select the option from DD
		
		s.selectByValue("11");
//		s.selectByVisibleText("20");
//		s.selectByIndex(4);
		
		// To print the number of options in the console
		List<WebElement> op1 = s.getOptions();
		int count = op1.size();
		System.out.println(count);
		
		// To print the DD values in the console using get attribute
		
		List<WebElement> op2 = s.getOptions();
		for(int i=0; i < op2.size(); i++) {
			
			WebElement ele = op2.get(i);
			String att = ele.getAttribute("value");
			System.out.println(att);
			
		}
		
		// To print the DD value in the console using get text
		List<WebElement> op3 = s.getOptions();
		
		for(WebElement x : op3) {
			String text = x.getText();
			System.out.println(text);
		}
		
			
	}
	

}
