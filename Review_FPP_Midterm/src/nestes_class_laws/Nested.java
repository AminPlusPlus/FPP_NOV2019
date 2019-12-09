package nestes_class_laws;


interface Age {
	void getAge();
}

class Outer {
	
	Outer() {
		System.out.println("Outer");
	}
	
	//static class inner
	static class InnerStatic {
		InnerStatic(){
			System.out.println("Static Innner");
		}
	}
	

	//Member inner class
	class NonStatic implements Age {
		
		NonStatic(){
			System.out.println("Im non Static");
		}

		@Override
		public void getAge() {
			System.out.println("My Age 11");
			
		}
	}
	
	//local class
	public void sayHello() {
		
		class SayHello  {
			SayHello(){
				System.out.println("from local class Hello");
			}
		}
		
		new SayHello();
	}
	
	
	public void anonomys (NonStatic c) {
		
	}
}

public class Nested {

	public static void main(String[] args) {
		
		Outer.InnerStatic a = new Outer.InnerStatic();
		Outer.NonStatic c = new Outer().new NonStatic();
		
		
		Age ag = new Outer().new NonStatic() {
			
		};
		
		ag.getAge();
		
		

	}

}
