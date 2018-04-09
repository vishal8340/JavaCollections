package java_project;

import java.util.Scanner;

public class EnterName {

	public static void main(String[] args) {
	 
		System.out.println("Enter your String");
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i)+"\n");
			
		}

	}

}
