package java_project;


public class SubClass extends SuperClass
{
   
	public void PrintMethod()
	{
		super.PrintMethod();
		System.out.println("Hello from SubClass");
		return;
		
	}
	public static void main(String[] args) {
		
        SubClass obj = new SubClass();
        obj.PrintMethod();
        
	}

}
