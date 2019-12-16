//@author Aminjoni Abdullozoda

package data_strcuture;

import java.util.Arrays;

public class MyArrayList {
	
	private String[] arr =  new String[5];
	private int size = -1;
	

	/**
	 * Adding new item to the MyArrayList
	 */
	public void add(String item) {
		size++;
		if (size == arr.length)
			resize();
		
		arr[size] = item;
	}
	
	public void removeByIndex (int index) {
		
	}
	
	
	
	/**
	 * Resize when size of Array
	 */
	private void resize() {
	    System.out.println("RESIZE");
		String[] newArray = new String[arr.length*2];
		System.arraycopy(arr, 0, newArray, 0, arr.length);
		arr = newArray;
	}





	@Override
	public String toString() {
		
		//empty array
		if (size<0)
			throw new IllegalStateException();
		
		StringBuilder arrToString = new StringBuilder("[");
		
		for (int i = 0 ; i <=size; i++) {
			arrToString.append(arr[i]+", ");
		}
		
		arrToString.setLength(arrToString.length()-2);
		arrToString.append("]");
		
		return arrToString.toString() ;
	
	}
	

	public static void main(String[] args) {
		MyArrayList strList = new MyArrayList();
		strList.add("Amin 1");
		strList.add("Amin 2");
		strList.add("Amin 3");
		strList.add("Amin 4");
		strList.add("Amin 5");
		strList.add("Amin 6");
		strList.add("Amin 7");
		
		System.out.println(strList);
	}

}
