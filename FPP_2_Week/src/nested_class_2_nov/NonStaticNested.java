package nested_class_2_nov;

public class NonStaticNested {
	
	//private final String hello = "Hello JIm";
	
	InnnerNonStatic md ;
	InnnerNonStatic.LocalClass lc;
	
	
					private int x = 1;
					
					public int getX() {
						return x;
					}
					
					public void setX (int x) {
						this.x = x;
					}
					
					
					void hello() {}
					
					static class StaticMan {
						
						NonStaticNested sn = new NonStaticNested();
						
						void helloStatic() {
						
							sn.x += 100;
							System.out.println("Hello from static X : " + sn.x  );
						}
						
					}
	

				class InnnerNonStatic extends NonStaticNested  {
				
				@Override
				void hello (){
					x = 180;
				}
				
				public InnnerNonStatic() {
					x = 10;
					
				
					
					LocalClass c = new LocalClass();
				}
		
		class LocalClass extends NonStaticNested   {
			 
			@Override
			void hello (){
				x = 180;		
				}
			
			int getMe() {
				return x + 12;
			}
			
			 public LocalClass() {
				 x = 12;
				 

			 }	
			 
			 
		}
		

	}

	


}
