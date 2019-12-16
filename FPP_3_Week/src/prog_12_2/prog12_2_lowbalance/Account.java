package prog_12_2.prog12_2_lowbalance;

class Account {
	final double MIN_START_BAL = 20;
	Employee e;
	double balance;
	Account(Employee e) {
		this.e = e;
	}
	void setStartBalance(double balance) throws LowBalanceException  {
		if(balance < MIN_START_BAL) {
			throw new LowBalanceException("Starting balance is too low");
		}
		else {
			this.balance = balance;
		}
	}
}
