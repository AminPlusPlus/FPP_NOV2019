package prog2_7_source_case3;

import java.time.LocalDate;

import prog2_7_source_case2.Person;

public class PersonWithJob  {
	
	
	private double salary;
	private Person person;
	
	
	PersonWithJob(String name, int year, int month, int dayOfMonth, double salary) {
		this.person = new Person(name, year, month, dayOfMonth);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getName() {
		return this.person.getName();
	}
	
	public LocalDate getHireDate() {
		return this.person.getDateOfBirth();
	}
	
	@Override
	public boolean equals (Object person) {
		if (person == null || !(person instanceof PersonWithJob)) 
			return false;
	
		PersonWithJob p = (PersonWithJob) person;
		return this.person.getName().equals(p.getName()) 
				&& this.person.getDateOfBirth().equals(p.getHireDate()) ;
	}
}
