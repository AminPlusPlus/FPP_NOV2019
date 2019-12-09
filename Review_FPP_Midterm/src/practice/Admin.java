package practice;



import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static List<Student> convertArray(Object[] studentArray) {
		List <Student> stud = new ArrayList <Student>();
		
		for (Object i : studentArray) {
			Student b = (Student)i;
			stud.add(b);
		}
		/* implement */
		
		return stud;
	}
	
	
	public static double computeAverageGpa(List<Student> studentList) {
		
		double average = 0.0;
		
		for (Student i : studentList) {
			average += i.computeGPA();
		}
		
		/*implement */
		return average / studentList.size();
	}
}
