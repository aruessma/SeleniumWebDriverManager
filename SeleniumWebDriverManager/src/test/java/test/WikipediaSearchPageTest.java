package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.WikipediaSearchPageObjects;

public class WikipediaSearchPageTest {
	
	private static String projectLocation = System.getProperty("user.dir");
	private static WebDriver driver = null;
	private static WikipediaSearchPageObjects searchPageObj = null;
	
	public static void main(String[] args) {

		wikipediaSearchTest();
	}
	
	public static void wikipediaSearchTest() {
		
		openBrowser();
		
		searchPageObj.setTextInTextBox("A B C D");
		searchPageObj.clickSearchButton();
		
		closeBrowser();
	}
	
	public static void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		WikipediaSearchPageObjects searchPageObj = new WikipediaSearchPageObjects(driver);
		
		driver.get("https://www.wikipedia.org");
				
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
