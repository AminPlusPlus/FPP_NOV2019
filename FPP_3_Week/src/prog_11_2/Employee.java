package prog_11_2;

import java.util.HashMap;
import java.util.Iterator; 
import java.util.Map;
import java.util.Map.Entry;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String,Double> salaryRecord =  new HashMap<String,Double>();
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public void addEntry(String date, double salary) {
		//implement
		salaryRecord.put(date, salary);
		
	}
	public void printPaymentAmount(String date) {
		
		if(!salaryRecord.containsKey(date)) {
			System.out.println("Not Paid " +  firstName + " "+ lastName);
			return;
		}
		
		Double salary = salaryRecord.get(date);
		
		System.out.println(firstName+" "+lastName+ " was paid " + salary+" on " + date );
		
	}
	public void printAveragePaycheck() {
		//implement
		Double sum = 0.0;
		
		for (Double salary : salaryRecord.values()) {
			sum += salary;
		}
		
		Double average  = sum / salaryRecord.size();
		
		System.out.println("Average paycheck for " + firstName + " " 
		+ lastName + " was " + average);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 0; i < 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
	
		
	}


}
