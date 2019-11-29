package lab_29nov;

import java.time.LocalDate;

public class Secretary extends Employee {
	
	private double overTimeHour;

	public Secretary(String name, double salary, LocalDate hireDate, double overTime) {
		super(name, salary, hireDate);
		this.overTimeHour = overTime;
		
	}


	public double getOverTimeHour() {
		return overTimeHour;
	}

	public void setOverTimeHour(double overTimeHour) {
		this.overTimeHour = overTimeHour;
	}
	

	public double computeSalary() {
		return super.computeSalary()  + this.overTimeHour * 12;
	}
	
}
