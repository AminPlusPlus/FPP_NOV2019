package funtionalInterface;

import java.util.List;

@FunctionalInterface
public interface IUser {
	
	boolean isRich(double salary);
	
	default void richUsers(List<User> user) {
		for(User u : user ) {
			if(isRich(u.getSalary()))
				System.out.println(u.getName());
		}
	}
}
