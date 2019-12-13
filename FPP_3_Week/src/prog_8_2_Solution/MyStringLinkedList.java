package prog_8_2_Solution;

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

		if (pos < 0 || pos > size())
			throw new IndexOutOfBoundsException();

		if (pos == 0) {

			Node first = header.next;

			if (first == null) {

				Node n = new Node(header, data, null);
				header.next = n;
			} else {

				Node n = new Node(header, data, first);
				header.next = n;
				first.previous = n;

			}

		} else if (pos == size()) {

			Node last = header.next;

			if (last == null) {

				Node n = new Node(header, data, null);
				header.next = n;

			} else {

				
				Node curr = header.next;
				while (true) {

					if (curr.next == null) {
						last = curr;
						break;

					}
					curr = curr.next;
				}
				Node n = new Node(last, data, null);

				last.next = n;

			}

		} else {

			Node temp = getNode(pos);

//			System.out.println(temp.value);
			Node n = new Node(temp.previous, data, temp);
			temp.previous.next = n;
			temp.previous = n;

		}

	}


	public void sort(){

		if(isEmpty())
			return;
//		for(int i = 0; i < size(); i++){
//			Node curr = getNode(i);
//			Node mNode = minNode(curr);
//			swap(curr,mNode);
//		}

		Node curr = header.next;
		while(curr != null){
			Node mNode = minNode(curr);
			swap(curr,mNode);
			curr = curr.next;
		}

	}
	void swap(Node n1, Node n2){

		String temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;

	}

	public boolean isEmpty(){
		return header.next == null;
	}
	public Node minNode(Node node){
		Node temp = node;

		for(Node i = temp.next; i != null; i = i.next){

			if(temp.value.compareTo(i.value) > 0){
				temp = i;
			}
		}
		return temp;
	}

	public Node getNode(int pos){

		if(pos < 0 || pos >= size())
			throw new IndexOutOfBoundsException();
		Node curr = header.next;
		for (int i = 1; i <= pos; i++) {
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

