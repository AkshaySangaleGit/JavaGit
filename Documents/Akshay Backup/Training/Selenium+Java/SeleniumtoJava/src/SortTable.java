import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on column heading
		driver.findElement(By.xpath("//table[@class='table table-bordered']//th[@role=\"columnheader\"][contains(.,\"Veg/fruit name\")]")).click();
		
		//capture all the ements in the column
		List<WebElement> elements = driver.findElements(By.xpath("//table[@class='table table-bordered']//tr//td[1]"));
		List<String> fruits = elements.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedList = fruits.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(fruits.equals(sortedList));
		List<String> price;
		do 
		{
			List<WebElement> elementsNext = driver.findElements(By.xpath("//table[@class='table table-bordered']//tr//td[1]"));
			price = elementsNext.stream().filter(s->s.getText().contains("Rice")).map(s->getVegiesPrize(s)).collect(Collectors.toList());
			
			price.forEach(a->System.out.println(a));
			
			if(price.size()<1)
			{
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
		} while(price.size()<1);
	}

	private static String getVegiesPrize(WebElement s) {
		// TODO Auto-generated method stub
		String value = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return value;
	}

}
