package hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		HashMap<Employee, Integer> myMap = new HashMap<Employee, Integer>();
		
		myMap.put(new Employee("Aminjoni", 4000.0), 10);
		myMap.put(new Employee("Carry", 4200.0), 20);
		myMap.put(new Employee("Jim", 5000.0), 30);
		myMap.put(new Employee("Aminjoni", 6000.0), 40);
	
	 	
		System.out.println(myMap.get(new Employee("Aminjoni", 4000.0)));
		
	 	System.out.println(myMap.toString());

	}

}
