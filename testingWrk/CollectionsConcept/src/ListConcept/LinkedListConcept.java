package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> lt = new LinkedList<String>();
		lt.add("Red");
		lt.add("Green");
		lt.add("Black");
		lt.add("Purple");
		
		System.out.println(lt);// Print list elements
		System.out.println(lt.size()); // Size of list
		lt.addFirst("Blue");
		lt.addLast("Orange");
		
		System.out.println("-------Print elements by for loop-------");
		
		for(int i=0;i<lt.size();i++)
		{
			System.out.println(lt.get(i));
		}
		
		lt.remove(3);
		System.out.println(lt);
		
		System.out.println("-------Print elements by advance for loop-------");
		
		for(String str:lt)
		{
			System.out.println(str);
		}
		
		System.out.println("-------Print elements by Iterator-------");
		      
		Iterator<String> it = lt.iterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
		
		System.out.println("-------Print elements by while-------");
		int i = 0;
		while(lt.size()>i)
		{
			System.out.println(lt.get(i));
			
			i++;
			
		}
			
		
		Employee e1 = new Employee("Peter Parker", 11, "QA");
		Employee e2 = new Employee("James Robatson", 12, "DP");
		Employee e3 = new Employee("Mary James", 13, "HR");
		
		LinkedList<Employee> lt1 = new LinkedList<Employee>();
		lt1.add(e1);
		lt1.add(e2);
		lt1.add(e3);
		
		  Iterator<Employee> it1 =  lt1.iterator();
		  while(it1.hasNext())
		  {
			  Employee emp = it1.next();
			  
			  System.out.println(emp.Name+"--"+emp.Age+"--"+emp.Dept);
		  }
		

	}

	
}
