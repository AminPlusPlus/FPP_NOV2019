package prog_2_4;

import java.time.LocalDate;
import java.util.Date;


public class DeptEmployee {

	private String name;
	private double salary;
	private LocalDate hireDate;

	public DeptEmployee(String name, double salary, int year, int month, int dayOfMonth){
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.of(year, month, dayOfMonth);
	}
	
	//default implementation
	public double computeSalary() {
		return salary;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
