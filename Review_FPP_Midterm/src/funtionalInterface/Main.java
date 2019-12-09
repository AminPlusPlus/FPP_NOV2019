package funtionalInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
//		MyInterface inter = () -> System.out.println("Hi anno");
//					
//		inter.sayHello();
//		inter.hi();
//		
		List<User> users = new ArrayList<User>();
		users.add(new User("Amin",3000));
		users.add(new User("Jim",7000));
		users.add(new User("Haa",3000));
		users.add(new User("Mark",6000));
		
		
	
		IUser i = (salary) -> salary > 5000 ? true : false;
		
		   new IUser () {

				@Override
				public boolean isRich(double salary) {
					// TODO Auto-generated method stub
					return false;
				}
				
			};
		
		
		 IUser b = new IUser () {

				@Override
				public boolean isRich(double salary) {
					// TODO Auto-generated method stub
					return false;
				}
				
			};
		
		
	//	System.out.println(a);
		
		i.richUsers(users);
		
		//
		//i.isRich(7000);

		
	}

}
