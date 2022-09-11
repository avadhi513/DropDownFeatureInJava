package org.menu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableIteration {
	
	public static void main(String[] args) {
		
		// Configure the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
			
		// Launch the browser
		WebDriver wd = new ChromeDriver();
		
		// To get specific url
		wd.get("https://demo.guru99.com/test/web-table-element.php");
		
		// Iterate the rows and cells
/*		List<WebElement> tRows = wd.findElements(By.tagName("tr"));
		
		for(int i=0; i < tRows.size(); i++) {
			WebElement rows = tRows.get(i);
			
			List<WebElement> tData = rows.findElements(By.tagName("td"));
		
			for(int j=0; j < tData.size(); j++) {
			
				WebElement data = tData.get(j);
				String text = data.getText();
				System.out.println(text);
			}
			
		}
*/			
		
/*		    // Iterate cells directly without the rows
		    List<WebElement> tData = wd.findElements(By.tagName("td"));
			for(int j=0; j < tData.size(); j++) {
				
				WebElement data = tData.get(j);
				String text = data.getText();
				System.out.println(text);
				
			}
*/
		
/*	    // Iterate the rows directly
	    List<WebElement> tData = wd.findElements(By.tagName("tr"));
		for(int j=0; j < tData.size(); j++) {
			
			WebElement data = tData.get(j);
			String text = data.getText();
			System.out.println(text);
			
		}
*/
		
/*	    // Iterate the headings
	    List<WebElement> tData = wd.findElements(By.tagName("th"));
		for(int j=0; j < tData.size(); j++) {
			
			WebElement data = tData.get(j);
			String text = data.getText();
			System.out.println(text);
			
		}
*/
		
/*		// Iterate the particular data
		List<WebElement> tRows = wd.findElements(By.tagName("tr"));
		
		for(int i=0; i < tRows.size(); i++) {
			WebElement rows = tRows.get(i);
			
			List<WebElement> tData = rows.findElements(By.tagName("td"));
		
		    for(int j=0; j < tData.size(); j++) {
			
				WebElement data = tData.get(j);
				String text = data.getText();
				
				if(text.equals("Ambuja Cements Ltd.")) {
					System.out.println(text);
					System.out.println("Row no.: "+i);
					System.out.println(("Column no: "+j));
				}
				
			}
			
		}
*/
		
		// Iterate using enhanced for loop
		List<WebElement> tRows = wd.findElements(By.tagName("tr"));
		
		for(WebElement x : tRows) {
			
			List<WebElement> tData = x.findElements(By.tagName("td"));
			
			for(WebElement y : tData) {
				System.out.println(y.getText());
			}
			
		}
		
		
	}

}
