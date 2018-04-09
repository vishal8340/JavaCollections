package java_project;

import java.util.Scanner;

public class ReverseStrF {

	public static void main(String[] args) {
		System.out.println("Enter your String to Reverse.");
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();

		String reverse = "";
		StringBuilder sb = new StringBuilder(str);
		
			reverse = sb.reverse().toString();

	

		System.out.println("Your reverse string output is:");
		System.out.println(reverse);
	}

}
