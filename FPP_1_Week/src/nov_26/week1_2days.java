package nov_26;

import java.util.Arrays;

public class week1_2days {

	public static void main(String[] args) {
		
		int[] somePrimes = {2,6,75,5,7,1,-3};
		
		int sum = 0;
		int max = 0;
		
		
		for (int i = 0; i<somePrimes.length ; i++ ) {
			
			sum = sum + somePrimes[i];
		}
		
		Arrays.sort(somePrimes);
		System.out.println(sum);
		System.out.println(somePrimes[somePrimes.length-1] );
		
		
		//Using Foreach:

	}

}
