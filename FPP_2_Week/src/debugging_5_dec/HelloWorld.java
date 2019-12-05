package debugging_5_dec;


public class HelloWorld {
	
	public String Hello() {
		return "Hello";
	}
	
	public static String join(String str1,String str2) {

		return  (str1.length() == 0 && str2.length() ==0) ? "Empty" : str1+str2;
	}
	
	public static int multiply(int x, int y) {
		return x*y;
	}

	

}
