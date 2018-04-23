package MapConcept;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableConcept {

	public static void main(String[] args) {
		
		/*
		 * A HashTable is an array of list. Each list is known as a bucket. 
		 * The position of bucket is identified by calling the hashCode() method. 
		 * A HashTable contains values based on the key.
		 * It contains only unique elements.
		 * It may have not have any null key or value.
		 * It is synchronized. 
		 */
	
       Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
       ht.put(1,"Vimal Verma");
       ht.put(2,"Ravi Ranjan");
       ht.put(3, "Mukesh Jha");
       ht.put(4,"Rajesh Thakur");
   
       
       System.out.println(ht);
       
       for(Entry<Integer, String> m1 : ht.entrySet())
		{
			int key = m1.getKey();
			String str = m1.getValue();
			System.out.println(key);
			System.out.println(str);
			
		
		
       }
	}

}
