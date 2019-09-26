package Onsite;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Mindelta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] a1 = new int[]{4, 7, 57, 98, 999};
        int[] a2 = new int[]{99, 57};
        int k=0;
        
    	TreeMap<Integer,Integer>ti = new TreeMap<Integer,Integer>();
        for (int i =0;i<=a1.length-1;i++) {
        	
        
        	
        	ti.put(a1[i], a1[i]);
        }
        
        for (int i =0;i<=a2.length-1;i++) {
        	
        	
        	
        	ti.put(a2[i], a2[i]);
        }
        
     
        k =  ti.firstKey() - ti.lastKey();
        System.out.println(k);
	}
	


}
