package java_project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		String names[] = { "Java", "JavaScript", "Java", "Ruby", "Python", "C" };

		System.out.println("****Normal****");
		// 1. compare each element: O(nxn)
		for (int i = 0; i < names.length; i++) {

			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equalsIgnoreCase(names[j])) {

					System.out.println("Duplicate element is : " + (names[i]));
				}

			}

		}

		System.out.println("****HashSet****");

		// 2. using HashSet: java collection: it store unique values: O(n)

		Set<String> store = new HashSet<String>();
		for (String name : names) {

			if (store.add(name) == false) {

				System.out.println("Duplicate element is : " + name);
			}
		}

		System.out.println("****HashMap****");

		// 3. using HashMap: O(2n)

		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for (String name : names) {
			Integer count = storeMap.get(name);
			if (count == null) {

				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);

			}

		}

		// get the values from this HashMap:

		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate element is : " + entry.getKey());

			}

		}

	}

}
