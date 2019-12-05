package src;

import java.util.Scanner;

class AClass {

	AClass(Main c){
		String[] args = new String[] {"a", "b", "c"}; 
		c.main(args);
		
	}
}

public class Main {
	
	public static void main(String[] args) {
		
		AClass a = new AClass(new Main());
		
	}

}
