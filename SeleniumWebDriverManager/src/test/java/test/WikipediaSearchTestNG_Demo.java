package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import pages.WikipediaSearchPage;

public class WikipediaSearchTestNG_Demo {
	
	private static String projectLocation = System.getProperty("user.dir");
	private static WebDriver driver;
	private static String searchItem;
	public static String browserName = null;
	
	/*
	 * main-Methode löschen,
	 * neu public void setupTest()
	 */
	
	@BeforeTest
	public static void setUpTest() {
		
		//Fetch Browser Name from config.properties
		PropertiesFile.getProperties();
		
		//Setup Browser
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectLocation + "/lib/chromedriver/chromedriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Der Browser wird nicht unterstützt!");
			
		}
				
		//Open web page
		driver.get("https://www.wikipedia.org");
		searchItem = "TestNG";
				
	}
	
	@Test
	public static void wikipediaSearch() {
		
		//Start search
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
		driver.quit();
		
		//Set result in config.properties
		PropertiesFile.setProperties();
		
	}

}
