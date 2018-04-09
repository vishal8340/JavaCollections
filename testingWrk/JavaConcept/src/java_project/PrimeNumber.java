package java_project;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		/*A Prime number is a natural number greater than 1 that has no positive 
		 * divisors other than 1 and itself.*/
		
	
		int no, i;
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number :");
		no=s.nextInt();
		  if(no==1)
		  {
		  System.out.println("Smallest Prime number is 2");
		  }
		  for(i=2;i<no;i++)
		  {
		  if(no%i==0)
		  {
		  System.out.println("Not Prime");
		  break;
		  }
		  }
		 if(no==i)
		 {
		 System.out.println("Prime");
		 }
		}

	}


