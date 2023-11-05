import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class Launchportal {
	
	public static void main(String[] args)
	{
 		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nof1-v230-qa.nof1health.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//driver.findElement(By.id("dnn_Login_LoginButton")).click();
		driver.close();
		//driver.quit();		
	}

}



