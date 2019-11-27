package nov_27_lab;

import java.time.LocalDate;

public class Employee {
	
	private Account savingAcc;
	private Account checkingAcc;
	private Account retirementAccount;
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
		return "";
	}
	
	public void deposit(AccountType type, double amount) {
			
	}
	
	public void withDraw(AccountType type, double amount) {
		
	}
	
	public void createNewSavings(double startingBalance) {
		
	}
	
	public void createNewChecking(double startingBalance) {
		
	}
	public void createNewRetirement(double startingBalance) {
	
	}

	
	
	
	
	
	
	

}
