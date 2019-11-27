package homework_26_nov;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		
		int[] nums = {2,4,3,8,10,11,14,16,17,20};
		
		for (int i = 0;i<nums.length;i++) {
			if (i%2 == 0) {
				System.out.println(String.format("Even index %s : %s ",i,nums[i]));
			}
		}
		
		System.out.println();
		
		for (int i = 0;i<nums.length;i++) {
			if (nums[i]%2 == 0) 
				System.out.println(String.format("Even numbers : %s",nums[i]));
			
		}
		
		System.out.println();
		
		for (int i = 0;i<nums.length;i++) 
			System.out.println(String.format("Even numbers : %s -> %s",nums[i],(nums[i]%2==0)?"Even":"Odd"));


	}

}
