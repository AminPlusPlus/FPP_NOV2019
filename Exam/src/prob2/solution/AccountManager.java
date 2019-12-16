package prob2.solution;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		
		double sum = 0.0;
		
		
		for (Employee emp : emps) {
			for (Account acc : emp.accounts) {
				sum += acc.getBalance();
			}
		}
	
		
		return sum;
	}
}