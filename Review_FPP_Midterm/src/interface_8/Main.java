package interface_8;

import java.util.ArrayList;

import java.util.List;

import funtionalInterface.User;


public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		List<Employee> listEmps = new ArrayList<Employee>();
		listEmps.add(emp1);
		
		for (Employee e : listEmps) {
			e.log();
		}

	}

}
