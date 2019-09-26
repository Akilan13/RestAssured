package Amazon;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Maxcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "HO HELLO";
		
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i =0;i<s.length();i++) {
			
			if(hm.containsKey(s.charAt(i))) {
				
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				//hm.get(s.charAt(i));
				//System.out.println(hm.get(s.charAt(i)));
				
			} else {
				
				hm.put(s.charAt(i),1);
				System.out.println(hm.get(s.charAt(i)));
			}
			
			
			}
		
        int tempNum = 0;
        char tempChar = 'a';
        for (Character temp:hm.keySet()){
            if (hm.get(temp) > tempNum){
                tempNum = hm.get(temp);
                tempChar = temp;
            }
        }
        System.out.println(tempChar + " - " + tempNum);
    } 
		
		
		
		
		
		
		//System.out.println(hm);

	}


