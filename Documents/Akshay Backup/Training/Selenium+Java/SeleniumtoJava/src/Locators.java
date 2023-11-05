import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
	public static void main(String[] args)
	{
 		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("zxc"); //secret_sauce
		driver.findElement(By.className("submit-button")).click();
		String errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
		System.out.println(errorMessage);
		driver.findElement(By.name("password")).clear(); //secret_sauce
		driver.findElement(By.name("password")).sendKeys("secret_sauce"); //secret_sauce
		driver.findElement(By.className("submit-button")).click();
		//driver.close();
		//driver.quit();		
	}

}
