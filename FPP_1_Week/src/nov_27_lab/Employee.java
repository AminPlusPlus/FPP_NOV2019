package nov_27_lab;

import java.time.LocalDate;

public class Employee {
	
	private Account savingAcc;
	private Account checkingAcc;
	private Account retirementAcc;
	private String name;
	private LocalDate hireDate;
	
	
	
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
		
		result += savingAcc.toString();
		result += checkingAcc.toString();
		result += retirementAcc.toString();
		
		return result;
	}
	
	public void deposit(AccountType type, double amount) {
		
		switch(type) {

		case CHECKING:
				this.checkingAcc.makeDeposit(amount);
				break;	
		case  SAVING:
				this.savingAcc.makeDeposit(amount);
			break;		
		case RETIREMENT:
				this.retirementAcc.makeDeposit(amount);
			break;
			
		default:
			break;
			
		}
							
	}
	
	public boolean withDraw(AccountType type, double amount) {
	
		switch(type) {
		case CHECKING: return this.checkingAcc.makeWithdraw(amount);			
		case  SAVING: return this.savingAcc.makeWithdraw(amount);
		case RETIREMENT: return this.retirementAcc.makeWithdraw(amount);	
		default: return false;
		}
		
		
	}
	
	public void createNewSavings(double startingBalance) {
		this.savingAcc = new Account(startingBalance,AccountType.SAVING,this);
	}
	
	public void createNewChecking(double startingBalance) {
		this.checkingAcc = new Account(startingBalance,AccountType.CHECKING,this);
		
	}
	public void createNewRetirement(double startingBalance) {
		this.retirementAcc = new Account(startingBalance,AccountType.RETIREMENT,this);
	
	}


}
