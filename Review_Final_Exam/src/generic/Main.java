package generic;


class Generic<T> {
	
	public T a;
	
	Generic(T t) {
		this.a = t;
		
		System.out.println(this.a.getClass().getTypeName());
	}
	
}


public class Main {

	public static void main(String[] args) {
		
		Generic<Integer> newGeneric = new Generic<Integer>(1020);

	}

}
