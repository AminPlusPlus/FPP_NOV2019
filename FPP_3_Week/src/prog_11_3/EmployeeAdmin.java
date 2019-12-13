package prog_11_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		
		if(table.isEmpty() || socSecNums.isEmpty())
			throw new NullPointerException();
		
		ArrayList<Employee> rostedEmployees =  new ArrayList<Employee>() ;
		
		for (String socId :  socSecNums) {
			if (table.containsKey(socId) && table.get(socId).getSalary()>80000)
				rostedEmployees.add(table.get(socId));
		}
		
		Collections.sort(rostedEmployees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
		
				return Integer.compare(Integer.parseInt(o1.getSsn()), Integer.parseInt(o2.getSsn()));
			}
			
		});
		
		
		
		return rostedEmployees;
	}
	
	/**
		Returns a list of Employees whose social security number is not in the input list socSecNums
	*/
	public static List<Employee> findSsnIsNotInList(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		if(table.isEmpty() || socSecNums.isEmpty())
			throw new NullPointerException();
		
		ArrayList<Employee> rostedEmployees =  new ArrayList<Employee>() ;
		
		
		for (Map.Entry<String, Employee> users :  table.entrySet()) {
			
			if (!socSecNums.contains(users.getKey()))
				rostedEmployees.add(users.getValue());
		}
		
		return rostedEmployees;
	}
}
