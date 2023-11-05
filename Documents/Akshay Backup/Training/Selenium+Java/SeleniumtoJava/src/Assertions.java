import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class Assertions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		Assertions p = new Assertions();
		String password = p.getPassword(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String username = "rahul";
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys(username);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		String welcomeText = driver.findElement(By.xpath("//div[@class='login-container']/p")).getText();
		Assert.assertEquals(welcomeText, "You are successfully logged in.");
	    System.out.println(welcomeText);
	    String greet = driver.findElement(By.xpath("//h2")).getText();
	    Assert.assertEquals(greet, "Hello "+ username + ",");
	    
	     driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	    //driver.close();
	     System.out.println("Logged out");
	     
	
	}
	
	public String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);//
		String resetPassword = driver.findElement(By.cssSelector("form p")).getText();
		String[] arrPass = resetPassword.split("'");
		String[] arrPass2 = arrPass[1].split("'");
		 String password = arrPass2[0];
		 return password;
		
	}

}
