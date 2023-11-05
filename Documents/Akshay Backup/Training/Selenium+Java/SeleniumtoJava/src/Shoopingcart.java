import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;

public class Shoopingcart {


	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		Shoopingcart a = new Shoopingcart();
		
		
		String[] items = {"Brocolli", "Beetroot", "Cucumber", "Brinjal"};
		
		//invoke broser and go to URl
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Implicite wait condition
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Explicite wait method object
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//Method called in main Method for execution of functionality
		a.addItem(driver, items);
		
		//Go to cart page and apply the promo code for purchase
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='cart-preview active']//div[@class='action-block']/button")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class=\"promoCode\"]")));
		driver.findElement(By.xpath("//input[@class=\"promoCode\"]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		
		
	}
	
	
	
	
	
	
	//Method created for specific activities
	public void addItem(WebDriver driver, String[] items)
	{
		//get the all items listed on the page
				List<WebElement> products = driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));
				
				for(int i = 0; i<products.size();i++)
				{
					String[] name = products.get(i).getText().split("-");
					String formatedName = name[0].trim();
					
					//convert items Array into ArrayList
					
					List iRequired = Arrays.asList(items);
					
					//Search for the specifc item and add into cart
					int j = 0;
					if(iRequired.contains(formatedName))
					{
						j++;
						driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();
						
						System.out.println(formatedName);
						if(j==items.length)
						{
							break;
						}
						
					}			
				}
				System.out.println(items.length);		
	}

}
