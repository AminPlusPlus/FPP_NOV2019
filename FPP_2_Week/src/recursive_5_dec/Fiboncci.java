package recursive_5_dec;

public class Fiboncci {

	public static void main(String[] args) {
		Fiboncci f = new Fiboncci();
		System.out.println("With Recursion: " + f.fib(7));

	}

	private int fib(int n) {
		
		if (n <=1)
			return n;
		// implement
		System.out.println(fib(n-1) + fib(n-2));
		return fib(n-1) + fib(n-2);
	}
}
