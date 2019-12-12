package comparator_1_10_Dec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
	// instance fields
	private String name;
	private double salary;

	// constructor
	Employee(String aName, double aSalary) {
		name = aName;
		salary = aSalary;

	}

	// instance methods
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "name : " + this.name + " salary:" + salary;
	}

	public static void main(String[] args) {
		
		//create employee array with three employees
		Employee[] employees1 = new Employee[] {
				new Employee("Jack Danie",5000),
				new Employee("ANka",2000),
				new Employee("Bay",3000),
				};
		
		Arrays.sort(employees1,new NameComparator());
		System.out.println(Arrays.toString(employees1));
		
		
		List<Employee> employess2 = new ArrayList<Employee>();
		employess2.add(new Employee("Jack Danie",5000));
		employess2.add(new Employee("WDCF",3229));
		employess2.add(new Employee("Hahhil",500));
		
		
	 Collections.sort(employess2, new Comparator<Employee>(){

		@Override
		public int compare(Employee o1, Employee o2) {
			double a = o1.getName().compareTo(o2.getName());
			double b = o1.getSalary() - o2.getSalary();
		
			return Double.compare(a, b);
		}
		 
	 });
	 System.out.println(employess2);


	}

}
