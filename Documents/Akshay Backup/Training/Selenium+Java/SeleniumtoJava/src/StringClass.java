import java.util.ArrayList;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Akshay Sangale Selenium training.";
		String str = new String("Welcome to Java");
		
		String[] splitedString1 = s.split(" ");
		System.out.println(splitedString1[1]);
		
		String[] splitedString2 = s.split("Sangale");
		System.out.println(splitedString2[1].trim());
		
		String[] splitedString = s.split("");
		System.out.println("---------------String in normal order------------");
		for(int i = 0; i< splitedString.length; i++)
		{
			
			System.out.println(splitedString[i]);
		}
		
		System.out.println("---------------String in reverse order------------");
		
		for(int i = splitedString.length - 1; i >= 0; i--)
		{
			System.out.println(splitedString[i]);
		}
	}

}
