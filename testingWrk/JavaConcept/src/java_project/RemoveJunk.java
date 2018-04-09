package java_project;

import java.util.Scanner;

public class RemoveJunk {

	public static void main(String[] args) {

		System.out.println("Enter your junk value.");
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		String value = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Junk Values are removed.");
		System.out.println(value);
		

	}

}
