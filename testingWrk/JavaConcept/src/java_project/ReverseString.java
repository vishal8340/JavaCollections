package java_project;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println("Enter your string to reserve.");
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);

		}

		System.out.println("Your reverse string output is:");
		System.out.println(reverse);

	}

}
