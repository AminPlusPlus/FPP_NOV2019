package prog_11_4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class CountWord {
	// This function prints frequencies of all elements
	static void printFreq(String arr[]) {
		// Creates an empty HashMap
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		//implement
		for (String item : arr) {
			if(hmap.containsKey(item)) {
				int value = hmap.get(item);
				hmap.put(item, ++value);
			} else {
				hmap.put(item, 1);
			}
		}
		
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.putAll(hmap);

		// Print result
		for (Map.Entry m : hmap.entrySet())
			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
	}

	// Driver method to test above method
	public static void main(String[] args) {
		String arr[] = { "andy", "mike", "andy", "andy", "andy", "mike", "emma" };
		printFreq(arr);
	}
}