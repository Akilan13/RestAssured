package Amazon;

public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar1 = { 1,3,5,7,9,11,45,67};
        int[] ar2 = { 2,4,6,8,9,11,34,56,789,789,999,1000};
        
        
        int maxarrlen = (ar1.length>ar2.length)? ar1.length:ar2.length;
        int minarrlen = (ar1.length>ar2.length)? ar2.length:ar1.length;
        
        
        int[] Result = new int[maxarrlen+minarrlen];
        
        int k = 0,i=0,j=0;
        
       while  (i<=ar1.length-1 && j<ar2.length-1) {
    	   
    	   if (ar1[i]<ar2[i]) {
    		   
    		   Result[k++] = ar1[i];
    		   Result[k++] = ar2[j];
    		   i++;
    		   j++;
    		   
    	   } else if (ar1[i]>ar2[i]) {
    		   
    		   Result[k++] = ar2[i];
    		   Result[k++] = ar1[j];
    		   j++;
    		   i++;
    		   
    	   } else {
    		   
    		   Result[k++] = ar2[i]; 
    		   i++;
    		   j++;
    	   }
    	   
    		   
       }
       
       if (i==ar1.length) {
    	   
    	   while (j<ar2.length-1) {
    		   
    		   Result[k++] = ar2[j];  
    		   j++;
    		   
    	   }
       } else {
    	   
    	   	while (i<ar1.length-1) {
    		   
    		   Result[k++] = ar1[i];  
    		   i++;
    		   
    	   }
    	   
    	   
       }
        
        
        
       for (int f: Result) {
    	   
    	   System.out.print(f);
       }
        
        
        

	}

}
