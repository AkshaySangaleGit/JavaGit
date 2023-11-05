import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
		
		WebElement parentframe = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(parentframe);
		
		WebElement childframe = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(childframe);
		
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.switchTo().defaultContent();
		

	}

}
