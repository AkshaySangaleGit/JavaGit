import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ind");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//ul[@id='ui-id-1']//li[@class=\"ui-menu-item\"]/div[normalize-space()='India']")).click();
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	}

}
