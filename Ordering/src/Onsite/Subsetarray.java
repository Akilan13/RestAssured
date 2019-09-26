package Onsite;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsetarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {1,0,0,1,1,0,0,1,0,1,0,0,0,1};
		
		boolean start = false;
		//boolean end = false;
		String s = "";
		String k = Arrays.toString(a);
		String[] strings = (k.replace("[", "").replace("]", "").split(", "));
		String s1 = (k.replace("[", "").replace("]", ""));
		String s2 = (s1.replace(",", ""));
		String s3 = s2.replaceAll("\\s", "");
		//String stringss = strings.toString();
		//String[] stringss = strings.replaceAll("\\s", "").split("");
		
		int Startindex = 0;
		int Endindex = 0;
		ArrayList<String> ai = new ArrayList<String>();
		for (int i =0;i<=strings.length-1;i++) {
			int result = Integer.parseInt(strings[i]);
			
			if (result==1 && !start) {
				
				start = true;
				Startindex = i;
				
			}else if (result==1 && start) {
				start = false;
				Endindex = i;
				s = s3.substring(Startindex, Endindex+1);
				ai.add(s);
				i =i-1;
			}
		}
		
System.out.println(ai);
	}

}
