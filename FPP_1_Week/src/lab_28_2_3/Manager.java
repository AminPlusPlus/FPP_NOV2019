package lab_28_2_3;

public class Manager extends Employee {
	
	private double bonus;
	
	public Manager(String name, double salary, int year, int month, int day) {
		super(name,salary,year,month,day);
	}

	public double getBonus() {
		return bonus;
	}
	
	public double getSalary() {
		return super.getSalary();
	}
	
	
	public String getCertificate() {
		return "CMA 1";
	}

}
