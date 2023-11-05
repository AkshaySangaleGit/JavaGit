import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href=\"/windows/new\"]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		
		String text = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(text);
		
		driver.switchTo().window(parent);
		String text2 = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(text2);
			
		

	}

}
