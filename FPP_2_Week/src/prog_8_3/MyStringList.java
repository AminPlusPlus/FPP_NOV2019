package prog_8_3;

import java.util.Iterator;

public class MyStringList implements Iterable<String> {

	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {
		if (size == strArray.length)
			resize();
		strArray[size] = s;
		size++;
	}

	public String get(int i) {

		if (i < 0 || i >= size)
			return "Invalid";

		return strArray[i];

	}

	public boolean find(String s) {

		for (int i = 0; i < size; i++) {
			if (strArray[i].equals(s))
				return true;
		}

		return false;

	}

	public void add(String s, int pos) {

		// if(pos == )

		int lastIndex = size - 1;

		for (int i = lastIndex; i >= pos; i--) {
			strArray[i + 1] = strArray[i];
		}

		strArray[pos] = s;
		size++;

	}

	public boolean remove(String s) {

		int pos = -1;
		for (int i = 0; i < size; i++) {
			if (strArray[i].equals(s))
				pos = i;
		}

		if (pos == -1)
			return false;

		int lastIndex = size - 1;

		for (int i = pos; i < lastIndex; i++) {

			strArray[i] = strArray[i + 1];

		}

		strArray[lastIndex] = null;

		size--;

		return true;

	}

	private void resize() {

		String[] temp = new String[2 * strArray.length];

		System.arraycopy(strArray, 0, temp, 0, strArray.length);
		strArray = temp;

	}

	public String toString() {

		// System.out.println(Arrays.toString(strArray));
		 String result = "[";
		for (int i = 0; i < size; i++) {
			if (i == size - 1)
				result += strArray[i] + "]";
			else
				result += strArray[i] + ", ";

		}

		 return result;

	}

	public int size() {

		return size;

	}

	public boolean binarySearch(String key) {

		int left = 0;
		int right = size - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			// System.out.println("mid= " + mid);
			if (strArray[mid] == key) {
				return true;

			} else if (key.compareTo(strArray[mid]) < 0) {
				// update right
				right = mid - 1;
			} else {
				// update left
				left = mid + 1;
			}
		}
		return false;
	}

	public void sort() {

		for (int i = 0; i < size -1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (strArray[i].compareTo(strArray[j]) > 0) {
					String temp = strArray[i];
					strArray[i] = strArray[j];
					strArray[j] = temp;
				}
			}
		}
	}
	
	
	private class MyStringListIterator implements Iterator<String> {
		
		private int position = 0;
		
			
		
		
		@Override
		public boolean hasNext() {
			return (position < size);

		}

		@Override
		public String next() {
			if (hasNext())
				return strArray[position++];
			
			 throw new IndexOutOfBoundsException();
		}

		
	}

	public static void main(String[] args) {

		MyStringList l = new MyStringList();
		
		
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);

		
		l.sort();
		System.out.println(l);
		System.out.println(l.binarySearch("Bob"));
		System.out.println(l.binarySearch("Steve"));
		
		Iterator<String> iterator = l.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	@Override
	public Iterator<String> iterator() {
		return new MyStringListIterator() ;
	}
}
