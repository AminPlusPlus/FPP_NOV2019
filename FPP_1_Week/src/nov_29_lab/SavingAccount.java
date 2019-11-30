package nov_29_lab;

public class SavingAccount extends Account {

	public SavingAccount (Employee employee) {
		super(employee);
	}
	public SavingAccount(double balance, Employee employee) {
		super(balance, employee);
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.SAVING;
	}

}
