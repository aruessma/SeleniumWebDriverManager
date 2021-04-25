package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.WikipediaSearchPage;

public class WikipediaSearchTestNG_Demo2 {
	
	private static String projectLocation = System.getProperty("user.dir");
	private static WebDriver driver;
	private static String searchItem;
	
	/*
	 * main-Methode löschen,
	 * neu public void setupTest()
	 */
	
	@BeforeTest
	public static void setUpTest() {
		
		//Setup Browser, open weg page
		System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org");
		searchItem = "Selenium";
				
	}
	
	@Test
	public static void wikipediaSearch2() {
		
		
		WikipediaSearchPage.textboxSearch(driver).sendKeys(searchItem);
		WikipediaSearchPage.buttonSearch(driver).click();
					
	}
	
	@Test
	public static void wikipediaSearch3() {
		
		
		WikipediaSearchPage.textboxSearch(driver).sendKeys(searchItem);
		WikipediaSearchPage.buttonSearch(driver).click();
					
	}
	
	@AfterTest
	public static void tearDownTest() {
		
		//closeBrowser
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
