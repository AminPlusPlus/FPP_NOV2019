package prog_5_4;



public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
			
		
	}
	
	public String get(int i){
		//implement
		return strArray[i];
	}
	
	public boolean find(String s){
		
		
		for (int i = 0;i < strArray.length;i++) {
			if (strArray[i].equals(s))
				return true;
		}
		return false;
	}
	
	public boolean remove(String s){
		//implement
		return false;
	}
	
	
	private void resize(){
		String[] newResize = new String[size*2];
		
		System.arraycopy(strArray, 0, newResize, 0, size);
		
	}
	public String toString(){
		//implement
		return "";
	}
	public int size() {
		return size;
	}

	public static void main(String[] args){
		//copy test code and run it
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
	}

}
