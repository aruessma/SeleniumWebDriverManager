package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikipediaSearchPageObjects {

	private static By textboxSearch = By.id("searchInput");
	private static By buttonSearch = By.xpath("//i[contains(text(),'Search')]");
	private static WebDriver driver = null;

	public WikipediaSearchPageObjects(WebDriver driver) {
	
		this.driver = driver;
	}
	
	public static void setTextInTextBox(String searchItem) {

		driver.findElement(textboxSearch).sendKeys(searchItem);
		
	}
	
	public static void clickSearchButton() {
		
		driver.findElement(buttonSearch).click();
		
	}

}
