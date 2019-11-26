package homework_25_nov;


//Question  10.

class Laptop {
	
	String name;
	String productYear;
	String CPU;
	int ram;
	double price;
	
	public Laptop(String name, String productYear, String CPU, int ram, double price ) {
		this.name = name;
		this.productYear = productYear;
		this.CPU = CPU;
		this.ram = ram;
		this.price = price;
	}
}


public class OtherQuestions {
	
	/*
	Question 7.
	Is Java case-sensitive? 
	
	Answer : Yes 
	
	Question 8.
	Explain the Java keywords.List some Java keywords you learned in this chapter:
	
	Well especially from the today lesson:
	int, public, void, return , static boolean etc..
	
	*/

	public static void main(String[] args) {
	
		//Question 10.
//		System.out.println('Welcome to Java'); -> We to use double quote " " , ''- using for characters
	
		
//		Question 11.
		int i = 0; // missing initialize
		int k = 100; // not 100.0
		int j = i+1; // space between data types and naming
		
		System.out.println("j is "+j+" and k is"+k);

	}

}
