import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FlightBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//Select radio button for Round trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//check for the return date element is enabled or not		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
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
		
		//Select radio button for one way trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		//Select From city 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		Thread.sleep(5000);
		
		//Select destination city
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value=\"PNQ\"]")).click();
		
		//Select today's date in calender for one way trip
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		
		////check for the return date element is enabled or not if "One Way" trip checkbox is selected
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
	}

}
