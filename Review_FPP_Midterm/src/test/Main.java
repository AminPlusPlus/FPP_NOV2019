package test;



class SubClass extends Abstract {
	
	
	static {
		System.out.println("Im Static");
	}
	
	{
		System.out.println("Hello Baby");
	}
	
	public SubClass() {
		this.print();
		this.implementMe();
		
	}
	
	@Override
	public void print() {
		super.print();
	}

	@Override
	public void implementMe() {
		super.print();
	}
}

public class Main {

	public static void main(String[] args) {
		
		//SubClass s = new SubClass();
		Abstract a = new SubClass();
	
		//A a = new B();
		//A a1 = new A();
		
		//a.print();
		//a1.print();
		
		//
	}

}
