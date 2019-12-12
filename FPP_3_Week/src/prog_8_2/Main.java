package prog_8_2;



public class Main {

	public static void main(String[] args) {


		MyStringLinkedList list = new MyStringLinkedList();
		list.add("Bob");
		list.add("Harry");
		list.add("Steve");

		System.out.println(list.size() + ": " + list);

		list.insert("Anna",1);
		System.out.println(list.size() + ": " + list);

		list.sort();
		System.out.println(list.size() + ": " + list);


	}

}
