package java_project;

public class StringFunction {

	public static void main(String[] args) {
	
				String str = "Hello World yo";
				String str1 = "Hello world yo";
				
				System.out.println(str.length());
				System.out.println(str.charAt(6));
				System.out.println("1st occurrence of O : " +str.indexOf("o"));
				System.out.println("2nd occurrence of O : "+str.indexOf("o",str.indexOf("o")+1));
				System.out.println("3rd occurrence of O : "+str.indexOf("o",str.indexOf("o",str.indexOf("o")+1)+1));
				System.out.println(str1.indexOf("Hello"));
				System.out.println(str1.indexOf("World")); // -1
				//string comparison
				System.out.println(str.equals(str1));
				System.out.println(str.equalsIgnoreCase(str1));
				
				//substring
				System.out.println(str.substring(0, 5));
				
				//trim
				String s ="   Vimal Vimal  ";
				System.out.println(s.trim());
				System.out.println(s.replace(" ",""));
				String date = "10-02-18";
				System.out.println(date.replace("-","/"));
				
				//split
				String test = "Hello_World_Test_Selenium";
				String testval[]=test.split("_");
				for(int i=0;i<testval.length;i++)	
				{
					System.out.println(testval[i]);
					
					
				}
				
				
				
	}	}
