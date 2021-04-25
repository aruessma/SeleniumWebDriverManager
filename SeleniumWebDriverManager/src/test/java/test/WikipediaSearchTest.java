package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.WikipediaSearchPage;

public class WikipediaSearchTest {
	
	private static String projectLocation = System.getProperty("user.dir");
	private static WebDriver driver;
	
	public static void main(String[] args) {
		
		openBrowser();
		wikipediaSearch("Automation Step by Step");
		closeBrowser();
	}

	
	public static void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org");
				
	}
	
	public static void wikipediaSearch(String searchItem) {
		
		WikipediaSearchPage.textboxSearch(driver).sendKeys(searchItem);
		WikipediaSearchPage.buttonSearch(driver).click();
					
	}
	
	public static void closeBrowser() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		System.out.println("Test successful finished.");
	}
}
