package nov_27_lab;

public class Account {
	private double balance;
	private AccountType accountType;
	private Employee employee;

	public Account(AccountType accountType, Employee employee) {
		this.accountType = accountType;
		this.employee = employee;
	}
	
	public Account(double balance,AccountType accountType, Employee employee) {
		this.balance = balance;
		this.accountType = accountType;
		this.employee = employee;
	}
	
	
	public String getBalance() {
		return Double.toString(balance);
	}

	public void makeDeposit(double amount ) {
		this.balance += amount;
	}
	
	public boolean makeWithdraw(double amount ) {
		
		
		if (amount > balance) return false;
		
		this.balance -= amount;
		
		return true;
	}
	
	public String toString() {
		return "\nAccount type:" + this.accountType.toString() 
				+ "\n"+
				"Current bal:" + this.balance;
	}
	
	
	
}
