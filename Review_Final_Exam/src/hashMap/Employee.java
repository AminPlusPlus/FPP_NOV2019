package hashMap;

import java.util.Objects;

public class Employee {
	
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return name+ " " + salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,salary);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null || !(obj instanceof Employee)) return false;
		Employee emp  = (Employee)obj;
		return name.equals(emp.name) && salary == emp.salary;
	}
}
