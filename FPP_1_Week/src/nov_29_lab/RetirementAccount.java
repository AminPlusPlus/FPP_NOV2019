package nov_29_lab;

public class RetirementAccount extends Account {

	
	public RetirementAccount (Employee employee) {
		super(employee);
	}
	
	public RetirementAccount(double salary,Employee employee) {
		super(salary,employee);
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}

}
