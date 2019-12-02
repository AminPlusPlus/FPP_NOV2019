package execution_class_flow;

public  class Employee {
	
	private String fullName;
	private double salary;
	
	static int counter;
	
	
	static {
		
		counter++;
		System.out.println("This is a Employee static block : " + counter);
	}
	
	{
		System.out.println("This is a Employee initialization block :" + counter);
	}
	
	public Employee (String name, double salary) {
		this.fullName = name;
		this.salary  = salary;
		counter++;
		System.out.println("Employee Constructor :"  + counter);
	}
	
	public String toString() {
		return "FullName : " + this.fullName + "Salary : "+this.salary;
	}

}
