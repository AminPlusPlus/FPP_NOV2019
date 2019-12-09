package prog_2_7.case2;

import java.util.GregorianCalendar;


public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(getClass() != ob.getClass()) return false;
		Person p = (Person)ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}
	
	//For the 7/2013 exam hashCode does not need to be implemented
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	
	public static void main(String[] args) {


		Person original = new Person("Mr", new GregorianCalendar(1982, 11, 1)); 
		PersonWithJob gb1 = new PersonWithJob("Mr", new GregorianCalendar(1982, 11, 1),222); 
		PersonWithJob gb2 = new PersonWithJob("Mr", new GregorianCalendar(1982, 11, 1),222);
		
		System.out.println(gb1.equals(original)); // mixed-type comparison: yields false 
		System.out.println(original.equals(gb2)); // mixed-type comparison: yields false 
		System.out.println(gb1.equals(gb2)); // same-type comparison: yields false
		
	
	
	}

}
