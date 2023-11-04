package testNGDay1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test
	public void SeventhTest()
	{
		System.out.println("Demo on TestNG - Seventh Test");
	}
	
	@Test
	public void EighthTest()
	{
		System.out.println("Demo on TestNG - Eighth Test");
	}

	@Test
	public void NinethTest()
	{
		System.out.println("Demo on TestNG - Nineth Test");
	}
	
	@AfterTest
	public void LastActivity()
	{
		System.out.println("I will be executed at last");
	}
}
