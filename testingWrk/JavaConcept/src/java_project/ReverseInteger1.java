package java_project;

import java.util.Scanner;

public class ReverseInteger1 {

	public static void main(String[] args) {

		System.out.println("Enter the Integer value to Reverse.");
		@SuppressWarnings("resource")
		Scanner sn = new Scanner(System.in);
		int num = sn.nextInt();

		String s = new String();
		@SuppressWarnings("static-access")
		String value = s.valueOf(num);
		StringBuffer sf = new StringBuffer(value);

		System.out.println(sf.reverse());

	}

}
