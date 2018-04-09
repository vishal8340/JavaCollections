package java_project;

public class SwapString {

	public static void main(String[] args) {
		String x = "Hello";
		String y = "World";
		System.out.println("Values of x and y before swaping.");
		System.out.println("Value of x : " + x);
		System.out.println("Value of y : " + y);

		System.out.println("Values of x and y After swaping.");
		
		x=x+y;//HelloWorld
		y = x.substring(0,x.length()-y.length());
		x = x.substring(y.length());
		System.out.println("Value of x : " + x);
		System.out.println("Value of y : " + y);
		
	}

}
