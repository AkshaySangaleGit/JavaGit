import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaIfelse {
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
				break;
			}
			
			else
			{
				System.out.println(arr[i] + " Number is odd.");
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Akshay");
		a.add("Arti");
		a.add("Puja");
		a.add("Asha");
		a.add("Mayur");
		//a.get(2);
		//a.remove(3);
		//System.out.println(a.get(3));
		//a.remove(3);
		
		for(int i = 0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("---*-*---*");
		
		for( String val :a)
		{
			System.out.println(val);
		}
		
		System.out.println(a.contains("Mayur"));
		
		
		System.out.println("-----------------------------------");
		
		
		String[] name = {"Vasant", "Prakash", "Rohit", "Shubham"};
		List namArrayList = Arrays.asList(name);
		System.out.println(namArrayList.contains("Rohit"));
	
	}

}
