import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		// Static dropdown with select tag
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); 
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		String firstselected = dropdown.getFirstSelectedOption().getText();
		System.out.println(firstselected);	
		dropdown.selectByVisibleText("INR");
		String firstselected1 = dropdown.getFirstSelectedOption().getText();
		System.out.println(firstselected1);
		dropdown.selectByValue("AED");
		String firstselected3 = dropdown.getFirstSelectedOption().getText();
		System.out.println(firstselected3);

	}

}
