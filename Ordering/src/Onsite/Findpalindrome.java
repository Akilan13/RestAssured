package Onsite;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Findpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aabcbcbcc";
	Set<String> b = new HashSet<String>();	
	Map<Character,Integer>ma = new HashMap<Character,Integer>();
	//Map<Character,Integer>ma1 = new HashMap<Character,Integer>();
	String y = "";
	boolean Flag = false;
	String rev = "";
		
		for (int i =0;i<=s.length()-1;i++) {
			
			if (ma.containsKey(s.charAt(i))){
				
				ma.put(s.charAt(i), (int)(ma.get(s.charAt(i))+1));
				
				
			} else {
				
				ma.put(s.charAt(i), 1);
				
			}
		}
		

		Set<Character> se = ma.keySet();
		Iterator<Character> it = se.iterator();
		while(it.hasNext()) {
			
			char val = it.next();
			int temp = ma.get(val);
			int n = temp/2;
			int i =0;
			if (n>=1) {
			while (i<n) {
				y = y + val;
				i = i +1;
			}
			} else
			{
				
				y = y + val;
				Flag = true;
			}
		}
		
		
		if (Flag)
			
		 rev = y.substring(0, y.length()-1)+(y.charAt(y.length()-1))+new StringBuilder(y.substring(0, y.length()-1)).reverse().toString();
		else {
			
			rev = y+ new StringBuilder(y).reverse().toString();
		}
	
		System.out.println(rev);
	}

}
