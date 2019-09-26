package Amazon;

import java.util.ArrayList;
import java.util.List;

public class addarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {6,5,8,3};
        int arr2[] = {4,4,7,9,55};
        //int arr3[] = new int[13];
        int k = 0;
        int i =0;
        int m =0;
        ArrayList <Integer> a3 = new ArrayList<Integer>();
        while (i<arr1.length && m<arr2.length) {
            int sum = arr1[i] +arr2[m];
            int a =sum;
            i++;
            m++;
            if(a>9)
            {
               String s = Integer.toString(a);
                System.out.println(s);
                for (int j = 0; j < s.length(); j++) {
                    
                    a3.add(Integer.parseInt(s.substring(j, j+1)));
                }
            }
            else
            {
                a3.add(sum);

 
            }
        }
        
        {
        	
        	while (m<arr2.length-1) {
        		
        		a3.add(arr2[m]);
        		m++;
        	}
        	
     
        	
        	while (i<arr1.length-1) {
          		a3.add(arr2[i]);
        		i++;
        		
        	}
        }
        
    
        
        System.out.println(a3);

    }

}
