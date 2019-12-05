package recursive_5_dec;

public class ReverseString {
	
	
	StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString s = new ReverseString();
		String a = "Amin";
		System.out.println(s.reverse("Amin"));
		
		System.out.println(a.substring(1));
		System.out.println(a.charAt(0));

	}
	
	private String reverse(String s) {
		
		System.out.println(s.length());
		
		if(s.length() == 0) {
			return s;
		}
		
		return reverse(s.substring(1)) + s.charAt(0);
	}
	
	
	//revese utility 
	private String reverseUti(String s, int len) {
		if (len <0)
			return sb.toString();
		
		sb.append(s.charAt(len));
		return reverseUti(s,len-1);
	}
	

}
