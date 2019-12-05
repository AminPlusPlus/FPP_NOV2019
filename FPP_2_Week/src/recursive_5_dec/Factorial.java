package recursive_5_dec;

public class Factorial {


	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println("With Recursion: " +f.factorial(5));
	}
	private int factorial(int n) {
		   int result;
	       if(n<=1)
	         return 1;

	       result = factorial(n-1) * n;
	       return result;
	}


}