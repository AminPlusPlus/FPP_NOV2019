package prog_2_4;

import java.util.Date;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Professor p0 = new Professor("Joe",40000, 2019,5,10);
		Professor p1 = new Professor("Bob",50000,2019,5,10);
		Professor p2 = new Professor("Anna",45000,2019,5,10);
		p0.setNumPublications(10);
		p1.setNumPublications(10);
		p2.setNumPublications(10);
		Secretary s0 = new Secretary("Joan",50000,2019,5,10);
		Secretary s1 = new Secretary("Janet",40000,2019,5,10);
		s0.setOvertimeHours(200);
		s1.setOvertimeHours(200);
		DeptEmployee[] department = {p0,p1,p2,s0,s1};

		System.out.print("Do you wish to see the sum of all salaries in the department? (Y/N): ");
		Scanner sc = new Scanner(System.in);
		String answer = sc.next();
		
		if(answer.equalsIgnoreCase("Y")){
			double sum = 0.0;
			for(DeptEmployee de : department) {
				sum += de.computeSalary();
			}
			System.out.println("Sum of all salaries: "+sum);
		}
		
		


	}

}
