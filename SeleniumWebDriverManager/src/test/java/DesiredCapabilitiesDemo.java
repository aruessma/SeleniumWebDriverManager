import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	private static String projectLocation = System.getProperty("user.dir");
	private static WebDriver driver;
	
	private static String textboxSearchID = "searchInput"; 
	private static String buttonSearchXPath = "//i[contains(text(),'Search')]";
	
	private static DesiredCapabilities caps = new DesiredCapabilities();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver/chromedriver.exe");
		
		//caps.setCapability("ignoreProtectModeSettings", true);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		
		driver = new ChromeDriver(options);
		
		driver.get("https://www.wikipedia.org");
		
		driver.findElement(By.id(textboxSearchID)).sendKeys("Automation");
		driver.findElement(By.xpath(buttonSearchXPath)).click();
		
		driver.close();
		driver.quit();
		
	}

}
