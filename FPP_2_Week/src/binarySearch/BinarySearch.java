package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,4,5,10,13};
		
		System.out.println(binarySearch(arr,1));
		
	}
	
	public static boolean binarySearch(int[] arr ,int x) {
		return binarySearch(arr, x, 0 , arr.length - 1);
	}
	
	public static boolean binarySearch(int[] arr ,int x,int left, int right) {
		
		if (left > right ) return false;
		
		int mid = (left + right) / 2;
		
		if (arr[mid] == x) return true;
		
		else if (x<mid) {
			return binarySearch(arr, x, left, mid - 1);
		} else {
			return binarySearch(arr, x, mid + 1, right);
		}
		
		
	}

}
