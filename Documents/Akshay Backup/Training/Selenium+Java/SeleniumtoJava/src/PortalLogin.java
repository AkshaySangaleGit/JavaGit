import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PortalLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("https://nof1-v230-qa.nof1health.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("dnn_Login_LoginButton")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("Email Address")).sendKeys("nof1v230qa+WadeRobinson@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Nof1V230qa"); //Nof1V230qa
		String email = driver.findElement(By.xpath("//label[@for='email']")).getText();
		System.out.println(email);
		
		driver.findElement(By.xpath("//button[@id='next']")).click();
		
		
		//driver.close();
		
	}

}


