package nov_29_lab;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private LocalDate hireDate;
	
	private List<Account> accounts = new ArrayList<Account>();
	
	
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}
	
	
	
	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public String getFormatttedAccountInfo() {
		
		String result = "Accoint Info For " + this.getName() + ":" + "\n\n" ;
		
		result += this.accounts.get(0).toString();
		result += this.accounts.get(1).toString();
		result += this.accounts.get(2).toString();
		
		return result;
	}
	
	public void deposit(AccountType type, double amount) {
		
		this.accounts.forEach((a) -> {
			if(a.getAcctType() == type)
				a.makeDeposit(amount);
		});
	}
	
	public boolean withDraw(AccountType type, double amount) {
		
		for (Account a : accounts) {
			if(a.getAcctType() == type)
				return a.makeWithdraw(amount);
		}
		
		return false;
	}
	
	public void createNewSavings(double startingBalance) {
		Account act = new SavingAccount(startingBalance,this);
		this.accounts.add(act);
	}
	
	public void createNewChecking(double startingBalance) {
		Account act = new CheckingAccount(startingBalance,this);
		this.accounts.add(act);
		
		
	}
	public void createNewRetirement(double startingBalance) {
		Account act = new RetirementAccount(startingBalance,this);
		this.accounts.add(act);
	
	}



	public List<Account> getAccounts() {
		return accounts;
	}



	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}


}
