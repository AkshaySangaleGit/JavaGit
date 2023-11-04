package testNGDay1;

import org.testng.annotations.*;

public class Day1 {
	
	@Parameters({"URL"})
	@Test
	public void Demo(String URLname)
	{
		System.out.println("Demo on TestNG - First Test");
		System.out.println(URLname);
		
	}
	
	@Test(groups= {"smoke"})
	public void SecondTest()
	{
		System.out.println("Demo on TestNG - Second Test");
	}
	
	
	@BeforeTest
	public void Prerequisite()
	{
		System.out.println("Pre-requisite Method");
	}
	
	@BeforeSuite
	public void FirstofAll()
	{
		System.out.println("Will be executed before suite gets executed.");
	}
	
	@AfterSuite
	public void LastofAll()
	{
		System.out.println("Will be executed after suite gets executed.");
	}

}
