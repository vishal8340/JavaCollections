package java_project;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println("Enter the Integer value to Reverse.");
		@SuppressWarnings("resource")
		Scanner sn = new Scanner(System.in);
		int num = sn.nextInt();
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}

		System.out.println("Your reverse Integer value output is:");
		System.out.println(rev);

	}

}
