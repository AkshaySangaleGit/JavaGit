package testNGDay1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	
	@Parameters({"URL"})
	@Test(groups= {"smoke"})
	public void ThridTest(String uname)
	{
		System.out.println("Demo on TestNG - Third Test");
		System.out.println(uname);
		
	}

}
