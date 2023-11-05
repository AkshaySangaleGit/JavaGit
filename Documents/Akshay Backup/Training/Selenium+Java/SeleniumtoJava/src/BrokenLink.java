import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		SoftAssert a = new SoftAssert();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class=\"gf-li\"] a"));
		
		for(WebElement link : links)
		{
			String urlLink = link.getAttribute("href");
			System.out.println(urlLink);
			HttpURLConnection conn = (HttpURLConnection) new URL(urlLink).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode = conn.getResponseCode();
			a.assertTrue(responseCode < 400, "Link with text" + link.getText() + " Is broken with code " + responseCode);
			
			/*if(responseCode> 400)
			{
				System.out.println("Link with text" + link.getText() + " Is broken with code " + responseCode); 
				Assert.assertTrue(false);
			}*/
		}
		a.assertAll();
		
		//String url = driver.findElement(By.xpath("//div[@id='gf-BIG']//table//a[contains(text(), 'Broken Link')]")).getAttribute("href");
	//	System.out.println(url);
		
		//HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		//conn.setRequestMethod("HEAD");
		//conn.connect();
		
		//System.out.println(conn.getResponseCode());
	}

}
