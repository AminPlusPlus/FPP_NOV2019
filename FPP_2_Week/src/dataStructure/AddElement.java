package dataStructure;


import java.util.Arrays;
/**
 *
 * Add the element 9 at the position 1 
 *
 */
public class AddElement {

	public static void main(String[] args) {

		int[] nums = new int[8];
		int indexToInsert = 1;
		int size = 6;
		int numberToInsert= 9;
		
		nums[0] = 4;
		nums[1] = 5;
		nums[2] = 7;
		nums[3] = 1;
		nums[4] = 3;
		
		System.out.println(Arrays.toString(nums));
		
		//implement
		//added element 9 at pos 1: [4, 9, 5, 7, 1, 3, 0, 0]s
		for (int i = ++size; i>indexToInsert;i--)  
			nums[i] = nums[i-1];
		nums[indexToInsert] = numberToInsert;
		System.out.println(Arrays.toString(nums));
		

	}

}
