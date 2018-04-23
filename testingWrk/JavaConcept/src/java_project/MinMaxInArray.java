package java_project;

import java.util.Arrays;

public class MinMaxInArray {

	public static void main(String[] args) {
		int numbers[] = {-10,22,45,50,-88,999};
		
		int max= numbers[0];
		int min = numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>max)
			{
				max = numbers[i];
				
			}
			else if(numbers[i]<min)
				
			{
				
				min = numbers[i];
			}
			
			
		}
		System.out.println("\nGiven array is : "+ Arrays.toString(numbers));
		System.out.println("Maximum number is : "+ max);
		System.out.println("Minimum number is : "+ min);

	}

}
