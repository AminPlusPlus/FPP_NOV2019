package dataStructure;

public class FindCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(search("abcdeif",'1'));
	}
	
	
	public static boolean search(String s, char c) {
		
		if (s == null || s.isEmpty() )
			return false;
		
		if (s.length() == 1)
			return s.charAt(0) == c;

	
		int mid = s.length() / 2;
		
		if (c == s.charAt(mid))
			return true;
		
		if (c < s.charAt(mid)) 
		return search(s.substring(0,mid),c);
		
		
		return search(s.substring(mid+1),c);
		

		
	}

}
