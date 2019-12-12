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
		
		int[] arr1 = new int[]  {1,2};
		int[] arr2 = new int[arr1.length*2];
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.out.println(Arrays.toString(arr2));
	
	}

}
