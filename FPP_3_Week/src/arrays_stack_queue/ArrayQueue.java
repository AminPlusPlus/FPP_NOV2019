package arrays_stack_queue;

import java.util.Arrays;

public class ArrayQueue {
	
	private final int INITIAL_LENGTH = 2;
	private String[] arr = new String[INITIAL_LENGTH];
	private int size = 0;
	private int front = -1;
	private int rear = 0;
	
	
	/** Retrieves, but does not remove, the element at the front/head of the queue. */
	public String peek() { // throws IllegalStateException
		if (isEmpty())
			throw new IllegalStateException();
		// implement
		return arr[front];
	}
	
	/** Retrieves and Remove: removes the element at the front/head of the queue. */
	public String dequeue()  { // throws IllegalStateException {
		if (isEmpty())
			throw new IllegalStateException();
		
	
		String dataDequeue = arr[front];
		arr[front] = null;
		front++;
		
		return dataDequeue;
	}
	
	/** Insert: adds an element to the rear/end of the queue. */
	public void enqueue(String s) { 
		
		if (isEmpty()){
			front++;
			arr[front] = s;
			return;
		}
		
		
		if (isFull()) 
			resize();
		
		
		size++;
		rear++;
		
		arr[rear] = s;
		
	}
	private void resize() {
		
		String[]newArr = new String[INITIAL_LENGTH*2];
		
		System.arraycopy(arr, front, newArr, 0, size+1);
		
		arr = newArr;
		
	}

	private boolean isFull() {
	
		return (size == arr.length - 1);
	}
	/** Returns a string representation of this stack. The string
	 *  consists of all data values of the nodes in the stack, separated by spaces.
	 */
	@Override
	public String toString() {
		StringBuilder str  = new StringBuilder('[');
		
		for (int i = front; i<=size;i++) {
			str.append(arr[i] + ",");
		}
		
		return str.toString();
	}
	
	/** Returns the number of items in the queue */
	public int size() {
		//implement
		return size;
	}
	
	/** Returns true if there are no elements in the queue, false otherwise */
	public boolean isEmpty() {
		return (front<0 || size < 0);
	}

	/**
     * Removes all of the elements from this deque.
     * The deque will be empty after this call returns.
     */
	public void clear() {
		size = 0;
		front = -1;
		rear = 0;
		arr = new String[INITIAL_LENGTH];
	}

	/* You may use this method to test your stack */
	public static void main(String[] args) {
		try {
			ArrayQueue ns = new ArrayQueue();
			ns.enqueue("Bob");
			System.out.println(ns.size()+" " + ns);
			ns.enqueue("Harry");
			System.out.println(ns.size()+" " + ns);
			
			ns.enqueue("Steve");
			System.out.println(ns.size() +" "  + ns);
			System.out.println("Dequeue Operation : " + ns.dequeue());
			System.out.println("Dequeue Operation : " + ns.dequeue());
			System.out.println(ns.size()+" " + ns);
			ns.enqueue("Bill");
			System.out.println(ns.size()+" " + ns);
			
			ns.clear();
			System.out.println("After clear() Operation :" );
			System.out.println("Empty ArrayDeque : " + ns.isEmpty());


			System.out.println("Peek Operation : " + ns.peek());
			System.out.println(ns.size()+" " + ns);
			System.out.println("Dequeue Operation : " + ns.dequeue());
			System.out.println("Dequeue Operation : " + ns.dequeue());
			System.out.println("Empty ArrayDeque : " + ns.isEmpty());

			System.out.println("Dequeue Operation : " + ns.dequeue());

			
		} catch(Exception e) {
			System.out.println("Exception thrown of type " + e.getClass().getSimpleName());
		}
		
	}
}