package prog_12_2.prog12_2_lowbalance;

class FinancialCoordinator {
	Account acctToManage;
	void createNewAccount(Employee e, double balance) throws LowBalanceException {
		acctToManage  = new Account(e);
		acctToManage.setStartBalance(balance);
	}
}
