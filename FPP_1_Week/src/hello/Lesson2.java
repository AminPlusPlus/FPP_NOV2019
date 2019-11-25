package hello;

public class Lesson2 {

	public static void main(String[] args) {
		
		int num = -1;
		
		
		//Logic conditions
		
		if (num > 0) {
			System.out.println("hello");
		}
		
		int a = 1;
		int b = 5;
		
		//And condition
		if (a> 0 && b > 0) {
			System.out.println(a+b);
		}
		
		if (a> 0 || b > 0) {
			System.out.println(a+b);
		}
		
		boolean bool = true;
		
		if (!bool) {
			System.out.println("Not True");
		}
		
		
		//Loops
		for (int i = 0; i<5;++i) {
			System.out.println(i);
		}
		
		while (a<1) {
			System.out.println(a);
			a--;
		}
		
		
		
		
		
		

	}

}
