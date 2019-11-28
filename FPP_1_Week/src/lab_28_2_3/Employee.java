package lab_28_2_3;

import java.time.LocalDate;

public class Employee {
	
	private String name;
	private double salary;
	private LocalDate hireDate;
	
	
	public Employee(String aName, double aSalary , int aYear, int aMonth, int aDay) {
		this.name = aName;
		this.salary = aSalary;
		this.hireDate  =  LocalDate.of(aYear, aMonth, aDay);
	}


	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}
	
	
	public void raiseSalary (double percentage ) {
		if (salary>0) 
			salary += salary*percentage/100;
	}
	

}
