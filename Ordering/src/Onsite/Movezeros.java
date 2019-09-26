package Onsite;

import java.util.ArrayList;
import java.util.Arrays;

public class Movezeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,0,0,6,7,0,6,0,5};
		
	ArrayList<Integer> Li = new 	ArrayList<Integer>();	
		
		
		
		Arrays.sort(a);
		
		for (int i =a.length-1;i>=0;i--) {
			
			Li.add(a[i]);
			}
		
		System.out.println(Li);
		}
	}


