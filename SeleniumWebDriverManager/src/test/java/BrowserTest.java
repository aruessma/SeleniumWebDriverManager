import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation + "/lib/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev");
		
		
		driver.findElement(By.id("gsc-i-id1")).sendKeys("Automation Step by Step");
		//driver.findElement(By.xpath("////input[@id='gsc-i-id1']"))).sendKeys("Automation Step by Step");
		
		List<WebElement> textList = driver.findElements(By.xpath("//input"));

		int count = textList.size();
		System.out.println("Anzahl input : " + count);
		
		WebElement textBox = driver.findElement(By.id("gsc-i-id1"));

		textBox.sendKeys("Learn Automation" + Keys.ENTER);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	 
		driver.close();
		//driver.quit();
		
	}

}
