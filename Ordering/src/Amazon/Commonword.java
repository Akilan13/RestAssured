package Amazon;

import java.util.HashMap;
import java.util.Map;

public class Commonword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "new world is the new word hello world";
		
		String banned = "new is the";
		
		
		String[] s1= s.split("\\s+");
		String[] s2 = banned.split("\\s+");

		
		Map<String,Integer> mi = new HashMap<String,Integer>();
		
		for (int i =0;i<s1.length;i++) {
			boolean flag=true;
			for (int j=0;j<s2.length;j++) {
				
				if (s1[i].equals(s2[j])) {
					
					flag=false;
					break;
				}
				

			}
			
			if (flag && mi.containsKey(s1[i])) {
				
				mi.put(s1[i], mi.get(s1[i])+1);
				
			} else if (flag)  {
				
				mi.put(s1[i], 1);
			}
			

			
		}
		
		System.out.println(mi);
		
		int   tempnum = Integer.MAX_VALUE;
		String charc = "a";
		for (String temp:mi.keySet()) {
			
			if (mi.get(temp)<tempnum) {
				
				tempnum = mi.get(temp);
				charc = temp;
			}
			
			
			
		}
		
		System.out.println(charc + tempnum);
	}

}
