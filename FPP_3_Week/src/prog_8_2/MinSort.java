package prog_8_2;

import java.util.Arrays;

public class MinSort {
	int[] arr;
	MinSort(int[] arr){
		this.arr = arr;
	}
	public void sort(){
		if(arr == null || arr.length <=1) return;
		int len = arr.length;
		int temp = 0;
		for(int i = 0; i < len; ++i){
			int nextMinPos = minpos(i,len-1);
			swap(i,nextMinPos);
		}

	}
	void swap(int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
	//find minimum of arr between the indices fromIndex and toIndex
	public int minpos(int fromIndex, int toIndex){
		int m = arr[fromIndex];
		int index = fromIndex;
		for(int i = fromIndex+1; i <= toIndex; ++i){
			if(arr[i]<m){
				m = arr[i];
				index = i;
			}
		}
		//return location of min, not the min itself
		return index;
	}
	public static void main(String[] args){
		int[] test = {21,13,1,-22, 51, 5, 18};
		System.out.println(Arrays.toString(test));

		MinSort ss = new MinSort(test);
		ss.sort();
		System.out.println(Arrays.toString(ss.arr));

	}
}