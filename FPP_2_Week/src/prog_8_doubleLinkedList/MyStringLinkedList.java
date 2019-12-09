package prog_8_doubleLinkedList;

public class MyStringLinkedList {

	Node header;
	static int size;

	MyStringLinkedList() {
		header = new Node(null, null, null);
	}
	
	public boolean isEmpty() {
		return (header.next == null) ? true : false;
	}
	
	public void addLast(String element) {
		
		size++;
		
		Node newNode = new Node(null, element, null);
		
		if (isEmpty()) {
			header.next = newNode;
			newNode.previous = header;
			return;
		}
		
		Node current = header.next;
		
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = newNode;
		newNode.previous = current;

	}
	
	public void addFirst(String element) {
		
		size ++;
		Node newNode = new Node(null, element, null);
		
		if (isEmpty()) {
			header.next = newNode;
			newNode.previous = header;
			return;
		}
		
		Node currentNode = header.next;
		
		newNode.next = currentNode.next.previous;
		newNode.next.previous = newNode;
		newNode.previous = header;
		
		header.next = newNode;
	}
	
	public void add(int index, String element) {
		
		if (index < 0 || index > size) return;
		
		Node newNode = new Node(null, element, null);
		
		if (index == 0) {
			newNode.next = header.next.next;
			header.next = newNode;
			newNode.previous = header;
		}
		
		else if (index == size) {
			addLast(element);
			return;
		}
		else {
		
		Node current = header.next;
		for (int i = 1 ; i<index;i++) 
			current = current.next;

		
	    
		newNode.previous = current.next.previous;
		newNode.next = current.next;
		current.next.previous = newNode;
		current.next = newNode;
		}
		
		size++;
	}
	
	
	public String get(int index) {
		
		if (index < 0 || index > size)
			return "";
		
		Node current = header.next;
		for (int i = 0 ; i<index;i++) 
			current = current.next;

		return current.value;
	}
	
	
	public String findFirst() {
		if (isEmpty())
			return "";
		
		return header.next.value;
	}

	public String findLast() {
		if (isEmpty())
			return "";
		Node current =  header.next;
		while(current.next != null)
			current = current.next;
		
		return current.value;
		
	}
	
	public boolean find(String s) {
		if (isEmpty())
			return false;
		
		Node current = header.next;
		
		if(current.value.equals(s))
			return true;
		
		while(current.next != null) {
			
			if (current.value.equals(s))
				return true;
			
			current = current.next;
			
		}
		return false;
	}
	
	
	public int findIndex(String s) {
		
	}
	

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node curr = header.next;
		while (curr != null) {
			sb.append(curr.value + "-> ");
			curr = curr.next;
		}
		
		sb.setLength(sb.length()-3);
		
		return sb.toString();
	}

	class Node {
		Node previous;
		String value;
		Node next;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList list = new MyStringLinkedList();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");
		
		list.addFirst("Amin");
		list.add(4, "Jim");
		
		System.out.println(list.size + ": " + list);
		System.out.println("Get Index: " + list.get(4));
		System.out.println("Get First: "+list.findFirst());
		System.out.println("Get Last: "+list.findLast());

	}
}
