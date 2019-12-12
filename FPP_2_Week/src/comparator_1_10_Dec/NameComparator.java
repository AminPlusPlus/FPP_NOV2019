package comparator_1_10_Dec;


import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		int a = o1.getName().compareTo(o2.getName());


		return a;
	}

	//implement
}
