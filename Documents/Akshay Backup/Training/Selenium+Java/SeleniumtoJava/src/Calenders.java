import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class Calenders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		
		//WebDriverWait w = new WebDriverWait(driver, 10);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")));
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		Thread.sleep(3000);
		
		while(!driver.findElement(By.xpath("//div[@class='flatpickr-current-month']/span")).getText().contains("February"))
		{
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
			Thread.sleep(3000);
		}
		
		//List<WebElement> dates = driver.findElements(By.className("ui-state-default")); 
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		
		//int count = driver.findElements(By.className("ui-state-default")).size();
		int count = driver.findElements(By.className("flatpickr-day")).size();
		//System.out.println(count);
		
		for(int i = 0; i < count; i++)
		{
			//String text =  driver.findElements(By.className("ui-state-default")).get(i).getText();
			String text =  driver.findElements(By.className("flatpickr-day")).get(i).getText();
			
			if(text.equalsIgnoreCase("29"))
			{
				//driver.findElements(By.className("ui-state-default")).get(i).click();
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				//System.out.println(text);
				break;
			}
			
		}	

	}

}
