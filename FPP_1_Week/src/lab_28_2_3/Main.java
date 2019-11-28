package lab_28_2_3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Manager Anka =  new Manager("Anka",8000,2020,8,1);
		Employee Amin =  new Employee("Amin",8000,2020,8,1);
		Employee Jim =  new Employee("Jim",8000,2020,8,1);
		
		ArrayList<Employee> empls = new ArrayList<Employee>();
		empls.add(Anka);
		empls.add(Amin);
		empls.add(Jim);
		
		for (Employee e : empls){
			System.out.println(String.format("name=%s , salary=%s", e.getName(),e.getSalary()));
		}
		
		

	}

}
