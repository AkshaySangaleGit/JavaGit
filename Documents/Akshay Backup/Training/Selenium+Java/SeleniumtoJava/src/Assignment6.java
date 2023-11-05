import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		String option = driver.findElement(By.xpath("//label[@for='benz']")).getText().trim();
		
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText(option);

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(option);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		String message = driver.switchTo().alert().getText();
		String[] splited = message.split(",");
		String[] enteredOption = splited[0].split(" ");
		String user = enteredOption[1].trim();
				
		if(option.equals(user))
		{
			System.out.println("Welcome user is from selected option");
		}
		else
		{
			System.out.println("wrong welcome user");
		}
	}

}
