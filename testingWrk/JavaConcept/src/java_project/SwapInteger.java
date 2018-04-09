package java_project;

public class SwapInteger {

	public static void main(String[] args) {

		// 1.Swap integer using third variable
		int x = 5;
		int y = 10;

		System.out.println("Values of x and y before swaping.");
		System.out.println("Value of x : " + x);
		System.out.println("Value of y : " + y);

		System.out.println("Values of x and y After swaping.");
		int swap = 0;
		swap = x + y;
		x = swap - x;
		y = swap - y;

		System.out.println("Value of x : " + x);
		System.out.println("Value of y : " + y);

		// 2.Swap integer using third variable

		int a = 5;
		int b = 10;
		System.out.println("Values of a and b before swaping.");
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);

		System.out.println("Values of a and b After swaping.");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);

	}

}
