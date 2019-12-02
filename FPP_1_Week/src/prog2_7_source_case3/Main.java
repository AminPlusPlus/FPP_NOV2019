package prog2_7_source_case3;

public class Main {

	public static void main(String[] args) {

		//Person p = new Person("Joe", 2018, 10, 21);
		PersonWithJob p1 = new PersonWithJob("Joe", 2018, 10, 21, 500);
		PersonWithJob p2 = new PersonWithJob("Joe", 2018, 10, 21, 500);
		
		//System.out.println(p.equals(p2));
		System.out.println(p1.equals(p2));
	}
}
