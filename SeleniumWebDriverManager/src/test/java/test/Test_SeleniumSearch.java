package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_SeleniumSearch {
	
	private static String projectLocation = System.getProperty("user.dir");
	private static WebDriver driver;
	
	public static void main(String[] args) {
		
		openBrowser();
		seleniumSearch("Automation Step by Step");
		closeBrowser();
	}

	
	public static void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev");
				
	}
	
	public static void seleniumSearch(String searchItem) {
		
		
		driver.findElement(By.id("gsc-i-id1")).sendKeys(searchItem  + Keys.ENTER);
		
		/*
			 * Alternative
		driver.findElement(By.id("gsc-i-id1")).sendKeys(searchItem);
		driver.findElement(By.xpath("//[@id=\'navbar\']/div[2]/div/img")).sendKeys(Keys.RETURN);
		 */
		
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
