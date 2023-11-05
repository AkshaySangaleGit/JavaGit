import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		Assignment3 a = new Assignment3();
		String[] items = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='myModal']//div[@class='modal-content']//div[@class='modal-footer justify-content-center']//button[@id='okayBtn']")));
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='myModal']//div[@class='modal-content']//div[@class='modal-footer justify-content-center']//button[@id='okayBtn']")).click();
		WebElement staticdropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		a.addItem(driver, items);
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
		
	}
	
	
	public void addItem(WebDriver driver, String[] items)
	{
		List<WebElement> products = driver.findElements(By.xpath("//app-card//h4[@class=\"card-title\"]"));
		
		for(int i = 0; i<products.size();i++)
		{
			String[] name = products.get(i).getText().split("-");
			String formatedName = name[0].trim();
			
			//convert items Array into ArrayList
			
			List iRequired = Arrays.asList(items);
			
			//Search for the specifc item and add into cart
			int j=0;
			if(iRequired.contains(formatedName))
			{
				j++;
				driver.findElements(By.xpath("//app-card//button[@class=\"btn btn-info\"]")).get(i).click();
				if(j==items.length)
				{
					break;
				}
				
			}		
	}

}
}
