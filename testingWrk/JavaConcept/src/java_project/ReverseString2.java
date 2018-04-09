package java_project;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args)

	{

		System.out.println("Enter your String to Reverse.");
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		StringBuffer sf = new StringBuffer(str);
		String reverse = "";
		reverse = sf.reverse().toString();
	

		System.out.println("Your reverse string output is:");
		System.out.println(reverse);
	}

}
