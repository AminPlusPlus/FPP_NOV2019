package prog_8_2;

import java.util.NoSuchElementException;

public class MyStringLinkedList {
	Node header;
	MyStringLinkedList(){
		header = new Node(null,null, null);
	}
	public void add(String item){

		// implement
		Node first = header.next;

		if (first == null) {
			Node n = new Node(header, item, null);
			header.next = n;

		} else {
			Node n = new Node(header, item, first);
			header.next = n;
			first.previous = n;

		}

	}

	//inserts a new Node contain data so that its
	//position in the list is now pos
	void insert(String data, int pos) {
		if (pos<0 || pos>size())
			throw new IndexOutOfBoundsException();
		
		Node newNode = new Node(null,data,null);
		
		if (pos == 0) {
			newNode.next = header.next;
			newNode.previous = header.next;
			newNode.next.previous = newNode;
			this.header.next = newNode;
		} 
		else if (pos == size()) {

			Node endNode = getNode(pos-1);
			
			newNode.previous = endNode;
			newNode.previous.next = newNode;
			newNode.next = null;
			endNode.previous = newNode;	
		}
		else {
			Node endNode = getNode(pos);
			
			newNode.previous = endNode.previous;
			newNode.previous.next = newNode;
			newNode.next = endNode;
			endNode.previous = newNode;	
			
		}
		 
	}
	 

	public void sort(){

		

	}
	void swap(Node n1, Node n2){

		String temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;

	}

	public Node minNode(Node n){
		
		Node temp =  n;
		
		for (Node i = temp.next;i != null;i = temp.next) {
			if (temp.value.compareTo(i.value)>0)
				temp = i;
		}
		
		return temp;
		
	}

	public Node getNode(int pos){

		if(pos > size())
			throw new IndexOutOfBoundsException();
		Node curr = header.next;
		for (int i = 0; i < pos; i++) {
			curr = curr.next;
		}
		return curr;
	}

	// Count the number of nodes in the list
		public int size() {
			// implement
			int count = 0;
			Node curr = header.next;

			while (curr != null) {
				count++;
				curr = curr.next;
			}

			return count;
		}
		public String toString() {
			// implement
			String result = "";
			Node curr = header.next;

			while (curr != null) {
				result += curr.value + "-> ";
				curr = curr.next;
			}

			return result;
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


}

