package java_project;

public class FinallyConcept {
	
	//finally is always run if error occur or not. After try and catch

	public static void main(String[] args) {
		
          test1();
	}

	
	public static void test1()
	{
		try {
			
			System.out.println("Inside test1 method");
			throw new RuntimeException("test");
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block");
		}
		finally
		{
			System.out.println("Inside finally block");
			
		}
		
	}
}
