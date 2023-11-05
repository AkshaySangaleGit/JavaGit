
public class Methodspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodspractice d = new Methodspractice();
		d.demo1();
		demo2();
		Methodspractice2 d1 = new Methodspractice2();
		d1.demo3();
		String s = d.demo1();
		System.out.println(s);
		

	}
	
	public String demo1()
	{
		System.out.println("Method inside the same class.");
		return "Hello world";
	}
	
	public static void demo2()
	{
		System.out.println("Static method inside the same class.");
	}

}
