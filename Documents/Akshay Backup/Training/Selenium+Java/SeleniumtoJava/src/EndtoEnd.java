import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//Invoke chrome browser and Go to URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//Select radio button for One way trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		//select Departure city from dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		Thread.sleep(5000);
		//select arrivel city from dropdown
		driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value='PNQ']")).click();
		
		//Select today's date in calender for one way trip as Depart date
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		
		//Check for return date calender field is disabled.
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Calender is enabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Calender is disabled");
			Assert.assertFalse(false);
		}
		
		//Select multiple travelers from dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(5000);
		int i = 1;
		while(i < 5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Select country code for currency
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByValue("USD");
		
		//Click on Search button
		driver.findElement(By.xpath("//span[@class='btn-find-flight-home']//input[@type=\"submit\"]")).click();
	}
		

	}

