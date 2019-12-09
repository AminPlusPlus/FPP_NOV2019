package prog_2_7.case3;

import java.util.GregorianCalendar;

public class PersonWithJob  {
	private Person person;
	private double salary;
	
	private double bonus;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		person = new Person(name, dob);
		this.salary = salary;
		this.bonus = 0;
	}
	public String getName() {
		return person.getName();
	}
	public GregorianCalendar getDateOfBirth() {
		return person.getDateOfBirth();
	}
	public double getSalary() {
		return salary;
	}
	

	public Person getPerson() {
		return this.person;
	}
	
	public double getBonus() {
		return this.bonus;
	}
	
	
	//Can use either same classes or instanceof strategy here
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)ob;
		return p.getPerson().equals(this.person) && p.getBonus() == this.bonus;
	}
}
