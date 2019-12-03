package nested_class_2_nov;

import java.util.Arrays;
import java.util.Comparator;

import nested_class_2_nov.NonStaticNested.InnnerNonStatic;
import nested_class_2_nov.NonStaticNested.InnnerNonStatic.LocalClass;

public class Main {

	public static void main(String[] args) {
		
		 NonStaticNested top = new  NonStaticNested();
		 
		 InnnerNonStatic nc =  top.new InnnerNonStatic();
		 
		 LocalClass sn = nc.new LocalClass();
		 
		 NonStaticNested.StaticMan stati = new NonStaticNested.StaticMan();
		 stati.sn.setX(10);
		 stati.helloStatic();
		
		
		
		
		 System.out.println(top.getX());
		// top.setX(22);
		 System.out.println(top.getX());
		 
		// System.out.println( sn.getMe());
		 
		// stati.helloStatic();
		 
		 
//		 User[] users = new User[3] ;
//		 
//		 users[0] = new User("jmin",100);
//		 users[1] = new User("min",40);
//		 users[2] = new User("Amin",99);
//		 
////		 Arrays.sort(users, new Comparator<User>() {
////
////			@Override
////			public int compare(User o1, User o2) {
////				// TODO Auto-generated method stub
////				return o1.getName().compareTo(o2.getName());
////			}
////			 
////		 });
//		 
//		 
//		 Arrays.sort(users,(o1,o2) -> o1.getName().compareTo(o2.getName()));
//		 
//		 for (User u : users) {
//			 System.out.println(u);
//		 }
		 
	}

}
