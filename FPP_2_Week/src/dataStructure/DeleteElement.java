package dataStructure;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {

		int[] nums = new int[8];
		int indexToDelete = 1;
		int size = 4;

		nums[0] = 4;
		nums[1] = 5;
		nums[2] = 7;
		nums[3] = 1;
		nums[4] = 3;

		System.out.println(Arrays.toString(nums));
		
		for (int i = indexToDelete; i<size;i++)
			nums[i] = nums[i+1];
		
		nums[size] = 0;

		System.out.println(Arrays.toString(nums));
		//[4, 7, 1, 3, 0, 0, 0, 0] is the expected output.
		
		String s1 = null;
		String s2 = null;
		
		System.out.println(s1.equals(s2));
		
	}

}
