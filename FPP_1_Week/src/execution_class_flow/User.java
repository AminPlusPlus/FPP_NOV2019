package execution_class_flow;

public class User extends Employee {
	
	
	static {
		counter++;
		System.out.println("Static User Method : "+ counter);
		
	}
	
	{
		counter++;
		System.out.println("Initialization User : "+ counter);
		
	}

	public User(String name, double salary) {
		super(name, salary);
		++counter;
		System.out.println("User Constructor : " + counter);
		
	}
	
	
	
	

}
