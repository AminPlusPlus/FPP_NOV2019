package nov_27_lab;

public class Main {

	public static void main(String[] args) {
		
		Employee n1  = new Employee("Aminjoni",2019,4,12);
		
		n1.createNewChecking(300);
		n1.createNewRetirement(200);
		n1.createNewSavings(200);
		
		System.out.println(n1.getFormatttedAccountInfo());

	}

}
