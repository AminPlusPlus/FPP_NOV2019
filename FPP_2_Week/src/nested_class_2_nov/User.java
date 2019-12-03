package nested_class_2_nov;

public class User  {
	
	private final String name;
	private final double salary;
	
	
	public String getName() {
		return name;
	}
	
	public User(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Name : "+ this.name+ " Salary: " + this.salary ;
	}

}
