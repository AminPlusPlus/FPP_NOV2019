package prog_2_4;

public class Secretary extends DeptEmployee {
	public Secretary(String name, double salary, int year, int month, int dayOfMonth) {
		super(name, salary, year, month, dayOfMonth);
	}
	private double overtimeHours;


	public double getOvertimeHours() {
		return overtimeHours;
	}
	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	//overrides superclass method
	@Override
	public double computeSalary() {

		return super.computeSalary() + 12*overtimeHours;
	}
}
