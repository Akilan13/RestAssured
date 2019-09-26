package dot;

public class uncommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = { 10, 20, 30 }; 
        int arr2[] = { 20, 25, 30, 40, 50 }; 
  
        int n1 = arr1.length; 
        int n2 = arr2.length; 
        
        int i =0,j=0,k=0;
        
        while (i<n1 && j<n2) {
        	
            if (arr1[i] < arr2[j]) { 
                System.out.print(arr1[i] + " "); 
                i++; 
                k++; 
            } 
            else if (arr2[j] < arr1[i]) { 
                System.out.print(arr2[j] + " "); 
                k++; 
                j++; 
            } 
  
            // Skip common element 
            else { 
                i++; 
                j++; 
            } 
        } 
  
        // printing remaining elements 
        while (i < n1) { 
            System.out.print(arr1[i] + " "); 
            i++; 
            k++; 
        } 
        while (j < n2) { 
            System.out.print(arr2[j] + " "); 
            j++; 
            k++; 
        } 

	}

}
