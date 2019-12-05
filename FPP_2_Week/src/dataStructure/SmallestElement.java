package dataStructure;

import java.util.Arrays;

/**
 *
 * swap the smallest element to 0th position in the array
 *
 */
public class SmallestElement {

	public static void main(String[] args) {

		int[] nums = { 16, 35, 7, 1, -4, 36, 49 };
		System.out.println(Arrays.toString(nums));

		//implement
//		[-4, 35, 7, 1, 16, 36, 49] is the expected output.
		for (int i = 0;i<nums.length;i++)
		{
			for (int j = i+1;j<nums.length;j++) {
				if (nums[i]>nums[j]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;	
				}
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
	}

}
