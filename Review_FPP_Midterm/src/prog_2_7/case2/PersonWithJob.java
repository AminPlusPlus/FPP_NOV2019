package prog_2_7.case2
;
import java.util.GregorianCalendar;

final public class PersonWithJob extends Person {
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (getClass() != ob.getClass())
			return false;
		PersonWithJob p = (PersonWithJob) ob;
		return p.getName().equals(getName()) && p.getDateOfBirth().equals(getDateOfBirth()) && p.salary == salary;
	}
}
