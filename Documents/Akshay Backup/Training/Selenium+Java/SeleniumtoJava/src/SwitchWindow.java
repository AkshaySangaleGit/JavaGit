import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		//Window w = new Window();
		Actions a = new Actions(driver);
		
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		
		String parentId = it.next();
		
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By.xpath("//p[@class=\"im-para red\"]")).getText());
		
		String email = driver.findElement(By.xpath("//p[@class=\"im-para red\"]")).getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(email);
		
		//driver.close();
		
		driver.switchTo().window(parentId);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
			

	}

}
