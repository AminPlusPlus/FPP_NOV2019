package prog_8_doubleLinkedList;



public interface MyLinkedList {
//	Ex: 1
	public void addLast(Object element);
	public void addFirst(Object element);
	public void add(int index, Object element);
	public Object/*Node*/ get(int index);//Node at the specified element index, -1 otherwise
	public boolean isEmpty();
	public String toString();
	public int size();

//	Ex: 2
	public Object findFirst();
	public Object findLast();
	public boolean find(Object s);
	public int findIndex(Object s);//the index of the String s, if found
	public Object removeFirst();
	public Object removeLast();
	public boolean remove(int index); //the index of the element to be removed
	public boolean remove(Object element); //element to be removed from this list, if present

//	Ex: 3
	public Object findMin();
	public Object findMax();
	
	public void sort();

//	Ex: 4
	public String recurMax();

}
