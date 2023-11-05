
public class Arrays {
	
	public static void main(String[] args)
	{
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		String[] name = {"Akshay", "Mayur", "Arti", "Asha", "Puja"};
		
		System.out.println("List from Array 1");
		for(int i = 0; i< arr.length; i++ )
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("List from Array 2");
		for(int i = 0; i< arr2.length; i++ )
		{
			System.out.println(arr2[i]);
		}
		
		System.out.println("List of testers with emp ID:");
		for(int i = 0; i< arr.length; i++ )
		{
			System.out.println(name[i]+" is the tester with emp ID: "+ arr[i]);		
			
		}
		
		for(String s: name)
		{
			System.out.println(s);		
			
		}
		
		
		
	}
	
	

}
