package Onsite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BokMap {

	public static void main(String[] args) {

	        Map<String,String> map=new HashMap<>();
	
	        map.put("Java","John");
	        map.put("C#","Rob");
	        map.put("Ruby","John");
	        map.put("Rails","Rob");
	        
	        mapping(map).forEach((key,value)->System.out.println(key+"->"+value));
	        
	
	}
	
	public static Map<String,List<String>> mapping(Map<String,String> map){
		Map<String,List<String>> hm=new HashMap<>();
        List<String> listRob=new ArrayList<>();
        List<String> listJohn=new ArrayList<>();
        Set<String> set=map.keySet();
        String val,temp;
        Iterator<String> it=set.iterator();
        while(it.hasNext()) {
        	val=it.next();
        	temp = map.get(val);
        	
        	if (temp=="Rob") {
        		listRob.add(val);
        		hm.put(temp, listRob);
        	}
        	if (temp=="John") {
        		listJohn.add(val);
        		hm.put(temp, listJohn);
        		
        	}
        	
        		
        		
        	}
        
        return hm;
        
	}
   
		
		
		
		
		
	}


