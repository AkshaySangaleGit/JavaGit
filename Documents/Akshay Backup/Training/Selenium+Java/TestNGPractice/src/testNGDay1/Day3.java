package testNGDay1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void FourthTest()
	{
		System.out.println("Demo on TestNG - Fourth Test");
	}
	
	@Test(groups= {"smoke"})
	public void FifthTest()
	{
		System.out.println("Demo on TestNG - Fifth Test");
	}
	
	@Parameters({"URL"})
	@Test
	public void SixthTest(String uname)
	{
		System.out.println("Demo on TestNG - Sixth Test");
		System.out.println(uname);
	}
	
	
	@Test(dependsOnMethods= {"SixthTest"})
	public void Mobile()
	{
		System.out.println("Mobile Demo");
	}
	
	@Test(enabled=false)
	public void MobileLogin()
	{
		System.out.println("Mobile Log in");
	}
	
	@Test
	public void MobileSignup()
	{
		System.out.println("Mobile Sign up");
	}

}
