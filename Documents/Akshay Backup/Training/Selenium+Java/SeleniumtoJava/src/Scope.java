import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Get number of links present on page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//get number of links in footer 
		//System.out.println(driver.findElements(By.xpath("//div[@id='gf-BIG']//a")).size());
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement footertable = driver.findElement(By.xpath("//table//td[1]/ul"));
		System.out.println(footertable.findElements(By.tagName("a")).size());
		
		
		for(int i = 1; i< footertable.findElements(By.tagName("a")).size(); i++)
		{
			String clickOnTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			footertable.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
			
		
			
		}
		
		Set<String> x = driver.getWindowHandles();
		Iterator<String> it = x.iterator();
	
		while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
		
	}

}
