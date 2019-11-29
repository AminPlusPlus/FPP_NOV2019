package lab_29nov;

import java.time.LocalDate;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDate;
	
	public Employee(String name,double salary, LocalDate hireDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public void setLocalDate(LocalDate date) {
		this.hireDate = date;
	}
	
	public double computeSalary() {
		return this.salary;
	}

}
