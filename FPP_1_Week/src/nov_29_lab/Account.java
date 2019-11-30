package nov_29_lab;

public abstract class Account {
	
	private double balance;
	private Employee employee;
		
	public Account(Employee employee) {

		this.employee = employee;
	}
	
	public Account(double balance, Employee employee) {
		this.balance = balance;
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
		return "\nAccount type:" + this.getAcctType().toString() 
				+ "\n"+
				"Current bal:" + this.balance;
	}

	
	abstract public AccountType getAcctType();
	
	
}
