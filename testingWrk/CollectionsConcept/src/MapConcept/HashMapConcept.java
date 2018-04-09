package MapConcept;
import java.util.HashMap;
import java.util.Map.Entry;

import ListConcept.Employee;
public class HashMapConcept {

	public static void main(String[] args) {
		/*
		 * HaspMap is a class implements Map Interface extends AbstractionMap It
		 * contains only unique elements stores the values - key - value pair It may
		 * have one null key and multiple null values It maintains no order HashMap is
		 * non-synchronize -- not thread safe
		 */

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Mango");
		hm.put(2, "Orange");
		hm.put(3, "Grapes");
		hm.put(4, "Apple");
		hm.put(null, "Cherry");
		hm.put(5, "WaterMalen");
		hm.put(6, null);
		hm.put(7, null);			
		
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println(hm.get(4));
		
		for(Entry<Integer, String> m : hm.entrySet() ) {
			
			System.out.println("Key Value : "+m.getKey()+" Elment Name : "+m.getValue());
		}
		
		
		Employee e1 = new Employee("Peter Parker", 11, "Testing");
		Employee e2 = new Employee("James Robatson", 12, "Devlopment");
		Employee e3 = new Employee("Mary James", 13, "Human Resource");
		
		HashMap<Integer,Employee> hm1 = new HashMap<Integer,Employee>();
		hm1.put(1,e1);
		hm1.put(2,e2);
		hm1.put(3,e3);
		
		for(Entry<Integer, Employee> m1 : hm1.entrySet())
		{
			int key = m1.getKey();
			Employee e = m1.getValue();
			System.out.println("KeyInfo. "+key);
			System.out.println("Emplpyee Info. "+e.Name+"-"+e.Age+"-"+e.Dept);
			
			
			
			
		}
		
		
	}

}
