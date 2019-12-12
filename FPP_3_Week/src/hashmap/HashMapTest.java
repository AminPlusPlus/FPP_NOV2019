package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Student {
	
}

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> dict = new HashMap<String, Integer>();
		dict.put("1", 1);
		dict.put("2", 3);
		dict.put("3", 4);
		dict.put("3",5);
		
		
		ArrayList<Map<String,Map<String,Integer>>> arrayDict ;
		
		
		//Map<String,Student> students = new HashMap<String,Student>();
		
	   //Student newStudent  = students.get("Anka");
		
		
		for (Map.Entry<String, Integer> e : dict.entrySet())
		{
			System.out.println(e.getKey() + " : " +e.getValue());
		}

	}

}
