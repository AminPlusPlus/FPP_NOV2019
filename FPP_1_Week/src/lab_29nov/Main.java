package lab_29nov;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Professor("Ami",300.0,LocalDate.of(2019, 8, 3),2);
		Employee s1 = new Secretary("Jim",400.0,LocalDate.of(2019, 2, 10),10);
		

		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(s1);
		
		System.out.println(s1);
		
		list.forEach((e) -> {
			
			if (e instanceof Secretary)
			{
				Secretary s =  (Secretary)e;
				System.out.println(s);
				s.setOverTimeHour(50);
			}
		
			System.out.println(String.format("Name : %s \nSalary : %.2f",e.getName(), e.computeSalary()));
		});
		

	}

}
