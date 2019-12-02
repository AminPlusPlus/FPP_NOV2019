package prog2_7_source_case2;


public class PersonWithJob extends Person {
	
	private double salary;
	PersonWithJob(String name, int year, int month, int dayOfMonth, double salary) {
		super(name, year, month, dayOfMonth);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
}
