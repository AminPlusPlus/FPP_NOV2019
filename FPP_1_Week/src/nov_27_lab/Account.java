package nov_27_lab;

public class Account {
	double balance;
	AccountType accountType;
	Employee employee;

	public Account(AccountType accountType, Employee employee) {
		this.accountType = accountType;
		this.employee = employee;
	}
	
	public Account(double balance,AccountType accountType, Employee employee) {
		this.balance = balance;
		this.accountType = accountType;
		this.employee = employee;
	}
	
	
	public double getBalance() {
		return balance;
	}

	public void makeDeposit(double amount ) {
		this.balance += amount;
	}
	
	public boolean makeWithdraw(double amount ) {
		this.balance -= amount;
		return true;
	}
	
	public String toString() {
		return "to String";
	}
	
	
	
}
