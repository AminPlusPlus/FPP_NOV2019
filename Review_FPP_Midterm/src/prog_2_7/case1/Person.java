package prog_2_7.case1;



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
		if(!(ob instanceof Person)) return false;
		Person p = (Person)ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}
	
	public static void main(String[] args ) {
		
		Person p = new Person("amin",new GregorianCalendar(1996,2,4));
		Person c = new PersonWithJob("amin",new GregorianCalendar(1996,2,4),500);
		
		System.out.println(p.equals(c));
		
		
	}

}
