package funtionalInterface;

public class User  {
	
	private String name;
	private double salary;
	
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public User(String name, double salary){
		this.name = name;
		this.salary = salary;
	}



}
