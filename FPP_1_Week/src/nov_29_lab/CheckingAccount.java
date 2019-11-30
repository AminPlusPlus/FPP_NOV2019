package nov_29_lab;

public class CheckingAccount extends Account {

	public CheckingAccount (Employee employee) {
		super(employee);
	}
	
	public CheckingAccount(double salary,Employee employee) {
		super(salary,employee);
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}
}
