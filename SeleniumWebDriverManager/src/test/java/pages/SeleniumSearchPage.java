package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumSearchPage {

	private static WebElement element = null;
	private static String textboxSearchID = "gsc-i-id1"; 
	
	
	public static WebElement textboxSearch(WebDriver driver) {
		
		element = driver.findElement(By.id(textboxSearchID));
		return element;
	}
	
	public static WebElement buttonSearch(WebDriver driver) {
	
		element = driver.findElement(By.id(textboxSearchID));
		return element;

	}
	
}
