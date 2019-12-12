package comparator_2_10_Dec;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Employee {
	// instance fields
	private String name;
	private LocalDate hireDay;
	private double salary;

	// constructor
	Employee(String aName, int aYear,
			int aMonth, int aDay,double salary) {
		name = aName;
		hireDay = java.time.LocalDate.of(aYear, aMonth, aDay);
		this.salary = salary;
	}

	// instance methods
	public String getName() {
		return name;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public String toString() {
		return name + " and " + hireDay + " : "+salary;
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Employee)) return false;
		Employee e = (Employee)ob;
		return e.name.equals(name) && e.hireDay.equals(hireDay);
	}
	
	public int hashCode() {
		int result = 17;
		result = result * 31 + name.hashCode();
		result = result * 31 + hireDay.hashCode();
		return result;
	}
	
	public static void main(String[] args) {
		
		
		
		
		Comparator<Employee> salaryComparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o1.getSalary(), o2.getSalary());
				
			}
			
		};
		
		Comparator<Employee> HireDateComparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getHireDay().compareTo(o2.getHireDay());
			}
			
		};
		
		
		
		Employee e1 = new Employee("Bob", 1999, 10, 2,500);
		Employee e2 = new Employee("Bob", 2001, 9, 4,450);
		Employee e3 = new Employee("Bob", 1980, 9, 4,1000);

		NameComparator comp = new NameComparator();
		System.out.println(e1.equals(e2));
		System.out.println(comp.compare(e1,e2));
		
		Employee[] arr = new Employee[3];
		
		
		arr[0] = e1;
		arr[1] = e2;
		arr[2] = e3;

		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr, salaryComparator);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, HireDateComparator);
		System.out.println(Arrays.toString(arr));
		
		
	}

	public double getSalary() {
		return salary;
	}

}
