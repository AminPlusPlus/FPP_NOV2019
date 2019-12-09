package prog_8_SingleLinkedList;

public class MySinglyLinkedList   {
	Node header = null; //contains no data, cannot be removed
	
	public static int size ;

	public MySinglyLinkedList() {
		//header should never be null
		header = new Node(null,null);
	}
	public boolean search(String s) {

		return false;
	}

	
	public void addFirst(String s) {
		Node newNode = new Node(s,null);
		size ++;
		if (isEmpty()) {
			
			header.next = newNode;
			return;
		} 
			
		Node previousNode = header.next;
		newNode.next = previousNode;
		header.next = newNode;
		
		
	}

	public void addLast(String s) {
		
		Node newNode = new Node(s,null);
		size++;
		if (isEmpty()) {
			header.next = newNode;
			return;
		}  
		
		Node counterNode = header.next;
		while(counterNode.next != null) {
			counterNode = counterNode.next;
		}
		
		counterNode.next = newNode;
		

	}
	public void insert(String s, int pos) {
		
		if (pos<0 || pos> size) return;
		
		if (pos == 0)
			addFirst(s);
		else if (pos == size)
		 	addLast(s);
		else
        {
		   Node current = header.next;
		    
		    for (int i = 1; i<pos;i++) {
		    	
		    	current = current.next;
		    }
		    
		    Node newNode = new Node(s,current.next);
		    
		    current.next = newNode;
		    
		}
		size ++;
		

	}

	/** size = the number of non-null nodes */
	public int size() {
		
		if (isEmpty()) {
			return 0;
		}
		
		int size = 1;
		Node last = header.next;
		
		while (last.next != null) {
			size ++;
			last = last.next;
		}

		return size;
	}

	
	public void remove(String s) {
		
		if (isEmpty()) {
			return;
		}
		
		Node curr = header.next;
		
		size--;
		
		if (curr.data.equals(s)) {
			header.next = curr.next.next;
			return;
		}
		
		while (curr.next != null)
		{
			
			if (curr.next.data.equals(s)) {
				curr.next = curr.next.next ;
				return;
			} 
			
			
			curr = curr.next;
		}
		
		
	}
	
	public boolean isEmpty(){
		return (header.next == null) ? true : false;
	}
	
		@Override
   public String toString() {
			StringBuilder s =  new StringBuilder() ;
			if (isEmpty()) 
				s.append("[]");
			
			Node curr = header.next;
			while(curr != null)
			{
				s.append(curr.data + "->");
				curr = curr.next;
			}

			s.setLength(s.length()-2);

			return s.toString();
		}

	/** Implement as inner class */
	private static class Node {
		String data;
		Node next;

		private Node(String value, Node n){
			data = value;
			next = n;
		}
		
	}

	public static void main(String[] args) {

		MySinglyLinkedList listLast = new MySinglyLinkedList();
		listLast.addLast("Bob");
		listLast.addLast("Harry");
		listLast.addLast("Steve");
		listLast.addLast("Duke");
		System.out.println(listLast.size() + ": " +listLast);
//
		MySinglyLinkedList listFirst = new MySinglyLinkedList();
		listFirst.addFirst("Bob");
		listFirst.addFirst("Harry");
		listFirst.addFirst("Steve");
		listFirst.addFirst("Duke");
		System.out.println(listFirst.size() + ": " +listFirst);
//
		listFirst.insert("John",1);
		System.out.println(listFirst.size() + ": " +listFirst);
		
		listFirst.remove("Bob");
		System.out.println(listFirst.size() + ": " +listFirst);

	}
}


