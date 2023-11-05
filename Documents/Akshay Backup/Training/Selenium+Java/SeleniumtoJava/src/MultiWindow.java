import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Switching browser tab or window
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> handels = driver.getWindowHandles();
		Iterator<String> it = handels.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com/");
		String course = driver.findElements(By.xpath("//a[contains(@href,'https://courses.rahulshettyacademy.com/p/')]")).get(1).getText();
		
		driver.switchTo().window(parentWindow);
		WebElement name = driver.findElement(By.xpath("//input[@name=\"name\"]"));
		name.sendKeys(course);
		//Taking screenshot
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("name.png"));
		
		//get dimentions
		int height = name.getRect().getDimension().getHeight();
		int width = name.getRect().getDimension().getWidth();
		System.out.println("Height of name textbox is :" + height + " and Width of textbox is: "+ width);
		driver.quit();

	}

}
