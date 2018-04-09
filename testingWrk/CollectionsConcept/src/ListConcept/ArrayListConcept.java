package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		@SuppressWarnings("unused")
		int a[] = new int[3]; // Static Array -- size fixed

		// Dynamic array --ArrayList:
		// 1. Can contain duplicate values/ elements
		// 2. Maintains insertion order
		// 3. allows random access to fetch the element because it stores the values on
		// the basis of indexes

		// Non-generic ArrayList -- Are not specify the data type accept any type
		// values/elements.
		ArrayList ar = new ArrayList();

		ar.add("Hello World!");
		ar.add(23);
		ar.add(7.5);
		ar.add(true);

		System.out.println(ar.size());
		System.out.println(ar.get(2));
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));

		}

		// generic ArrayList -- Are specify the data type and accept specific type
		// values/elements.

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Apple");
		ar1.add("Orange");
		ar1.add("Mango");
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Banana");
		ar2.add("Cherry");
		ar1.addAll(ar2);
		System.out.println("--------******----------");
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));

		}
		System.out.println("--------******----------");
		ar1.removeAll(ar2);

		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));

		}

		@SuppressWarnings("unused")
		ArrayList<E> ar3 = new ArrayList<E>();

		Employee e1 = new Employee("Vimal Verma", 1, "GDS");
		Employee e2 = new Employee("Ravi Ranjan", 2, "GDS");
		Employee e3 = new Employee("Rajesh Thakur", 3, "VeryChik");
		Employee e4 = new Employee("Mukesh Jha", 4, "VeryChik");
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		ar4.add(e4);

		
		for (int i = 0; i < ar4.size(); i++) {

			System.out.println(ar4.get(i).Name + "-" + ar4.get(i).Age + "-" + ar4.get(i).Dept);

		}
		
		System.out.println("--------******----------");
		
		//iterator to traverse the values
		Iterator <Employee> it = ar4.iterator();
		while(it.hasNext())
		{
			Employee emp = it.next();
			System.out.println(emp.Name);
			System.out.println(emp.Age);
			System.out.println(emp.Dept);
			
			
		}
			

	}

}
