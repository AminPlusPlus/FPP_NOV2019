package src;

import java.util.Scanner;

import protect.Protect;
import protect.SubProtect;

class AClass extends Protect {

	AClass(){
		System.out.println("AClass : "+name);
	}
}


class BClass extends AClass {
	
	BClass() {
		System.out.println("BClass : "+name);
	}
	
}

class DClass extends SubProtect{
	
	DClass (){
		System.out.println("DClass : "+name);
	}
}

class StaticTest {
	static int count= 0;
	
	StaticTest(){
		count++;
	}
}



public class Main {
	
	public static void main(String[] args) {
		
	    System.out.println(StaticTest.count);
		
	}
	

}
