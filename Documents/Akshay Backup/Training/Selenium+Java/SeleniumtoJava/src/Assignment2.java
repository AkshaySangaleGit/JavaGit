import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
				
		//Invoke chrome browser and Go to URL
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		//enter name
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Akshay");
		
		//Enter email
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='email']")).sendKeys("Test@gmail.com");
		
		//enter Password
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Pa$$w0rd");
		
		//select checkbox for icecream
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		
		//select gender from dropdown
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select dropdownoption = new Select(dropdown); 
		dropdownoption.selectByIndex(0);
		
		//Select radio button for employment status - Student
		driver.findElement(By.id("inlineRadio1")).click();
		
		//Enter birthdate  of the candidate
		driver.findElement(By.name("bday")).sendKeys("10/11/1991");
		
		//Click on Submit button
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		Thread.sleep(2000);
		
		//Capture the success message
		String success = driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText();
		System.out.println(success);
		
		driver.close();

	}

}
