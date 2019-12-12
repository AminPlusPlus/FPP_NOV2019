package arrays_stack_queue;

import java.util.EmptyStackException;

public class ArrayStack {
	
	private final int INITIAL_LENGTH = 10;
	private int top;
	private String[] stackArray;
	
	public ArrayStack() {
		stackArray = new String[INITIAL_LENGTH];
		top = 0;
    }
	
	/** Pushes input onto the stack */
	public void push(String s) {
		
		if (top == stackArray.length)
		{
			//TODO: implement resize
		}

		stackArray[top] = s;
		top++;
	}
	
	/** Pops the input from the stack */
	public String pop()  { 
		
		if(isEmpty())
			throw new EmptyStackException();
		
		String popElement = stackArray[top-1];
		top--;
		stackArray[top] = null;
		
		
		return popElement ;
	}
	
	/** Returns (but does not remove) the value at the top of the stack */
	public String peek() { 
		if(isEmpty())
			throw new EmptyStackException();
		
		return stackArray[top-1];
		
	}
	
	/** Returns a string representation of this stack. The string
	 *  consists of all data values of the nodes in the stack, separated by spaces.
	 */
	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder("[");
		
		for (int i = 0; i < top; i++) {
			str.append(stackArray[i]+",");
		}
		
		str.setLength(stackArray.length-1);
		str.append("]");
		
		return str.toString();
	}
	
	/** Returns the number of elements in the stack */
	public int size() {
		//implement
		return top;
	}
	
	/** Returns true if there are no elements in the stack, false otherwise */
	public boolean isEmpty() {
		return (top<=0);
	}

	/**
	 * It determines whether an String exists in the stack. 
	 * If the element is found, it returns the 1-based position of the element from the top of the stack. 
	 * Else, it returns -1.
	 * 
	 */
	public int search(String o) {
		
		if(isEmpty())
			throw new EmptyStackException();
		
		for (int i = 0;i<top;i++) {
			if(stackArray[i] == o)
				return i;
		}
		
        return -1;
    }
	
	private int lastIndexOf(String o) {
		//implement
		int pos = -1;
		for (int i = 0; i < top; i++) {
			if(stackArray[i].equals(o)){
				pos = i;
				break;
			}
		}
		return pos;
	}

	/* You may use this method to test your stack */
	public static void main(String[] args) {
		try {
			ArrayStack ns = new ArrayStack();
			ns.push("Bob");
			System.out.println(ns.size()+" " + ns);
			ns.push("Harry");
			System.out.println(ns.size()+" " + ns);
			ns.push("Steve");
			System.out.println(ns.size() +" "  + ns);
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println(ns.size()+" " + ns);
			ns.push("Bill");
			System.out.println(ns.size()+" " + ns);
	        System.out.println("Search() Operation : "  + ns.search("Bob"));

			System.out.println("Peek Operation : " + ns.peek());
			System.out.println(ns.size());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Empty stack : " + ns.isEmpty());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Empty stack : " + ns.isEmpty());
			

		} catch(Exception e) {
			System.out.println("Exception thrown of type " + e.getClass().getSimpleName());
		}
		
	}
}