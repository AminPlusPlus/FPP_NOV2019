package prog_11_1;

import java.util.HashMap;
import java.util.Map;

public class MyTable {
	private Entry[] entries;
	private int index = -1;
	private int size = 0;
	
	MyTable(){
		this.entries = new Entry[26];
	}
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		if (index < 0)
			return  "";
		
		for (Entry ent : entries) {
			if(ent.key  == c) {
				return ent.str;
			}
		}

		return "";
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		Entry newEntery = new Entry(s,c);
		
		if (index > 0)
		{
			for (int i = 0; i<size;i++) {
				if(entries[i].key == c) {
					entries[i].str = s;
					return;
				}
			}
		}
		
		
		index++;
		size++;
		entries[index] = newEntery;
		
		//implement
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		
		StringBuilder b = new StringBuilder();
		
		for (int i = 0 ; i<size;i++) 
			b.append(entries[i]);
		
		
		return b.toString();
	}
	
	
	
	
	private class Entry {
		private char key;
		private String str;
		
		Entry(String str, char ch){
			//implement
			this.key = ch;
			this.str= str;
		}
		//returns a String of the form "ch->str" 
		public String toString() {
			
			//implement
			return "\n"+key+ " -> " + str + "" ;
		}
	}
	
	public static void main(String[] args){
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('b',"Anka");
		t.add('w',"Willie");
		
		System.out.println(t);
		
		String s = t.get('b');
		System.out.println(s);
		
		
	}

}