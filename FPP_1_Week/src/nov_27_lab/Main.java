package nov_27_lab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Employee n1  = new Employee("Aminjoni",2019,4,12);
		
		n1.createNewChecking(300);
		n1.createNewRetirement(200);
		n1.createNewSavings(200);
		
		//System.out.println(n1.getFormatttedAccountInfo());
		
		Employee[] emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[1].createNewRetirement(900);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("See a report of all account balances? (y/n) ");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")){

	
		}
		else {
		//do nothing..the application ends here
		}
		

	}


}
