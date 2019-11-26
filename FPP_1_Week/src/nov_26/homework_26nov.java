package nov_26;

import java.util.Scanner;

public class homework_26nov {

	public static void main(String[] args) {
		
		String s = "a friendly face";
		s.charAt(2);
		
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		System.out.println(s.subSequence(2, 9));
		System.out.println(s.substring(4));
		
		String s1 = new String("Hello");
		String s2 = "Hello";
		System.out.print(s1.compareTo(s2));
		
		
		//Question 2;
		for (int i = 0;i <= 5; i++) {
			for(int j = 0 ; j<i;j++) 
				System.out.print(" * ");
			
			System.out.println();
		}
		
		
		//Question 4:
		
		intSample();
		
		

	}
	
	public static void intSample() {
		Scanner sc = new Scanner(System.in);
		
		String outPut = "";
		switch (sc.nextInt()) {
		case 2: case 4: case 6: case 8:
			outPut = "even";
			break;
			
		default:
			outPut = "odd";
			break;
			
		}
		System.out.println("You chose an " +outPut+ " number");
		
	}

}
