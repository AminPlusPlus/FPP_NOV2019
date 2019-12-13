package test;

import java.util.Arrays;

class SubClass extends Abstract {
	
	
	static {
		System.out.println("Im Static");
	}
	
	{
		System.out.println("Hello Baby");
	}
	
	public SubClass() {
		this.print();
		this.implementMe();
		
	}
	
	@Override
	public void print() {
		super.print();
	}

	@Override
	public void implementMe() {
		super.print();
	}
}

public class Main {

	public static void main(String[] args) {
		
//		int[] arr1 = new int[]  {1,2,4,5,};
//		int[] arr2 = new int[arr1.length*2];
//		
//		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
//		System.out.println(Arrays.toString(arr2));
		
		int[] arr1 = new int[] {1,2,3,4,5,6};
		int[] arr2 = new int[] {10,20,40,60};
		
		int[] arr3 = new int[arr1.length*2];
		
		//System.arraycopy(arr1, 0, arr2, 3, 1);
		
		System.arraycopy(arr1, 1, arr3, 0, 0);
		
		System.out.println(Arrays.toString(arr3));
	
	}

}
