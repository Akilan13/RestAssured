package dot;

public class singledigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1234;
	    int sum = 0; 
	     
	    // Loop to do sum while 
	    // sum is not less than 
	    // or equal to 9 
	    while(a > 0 || sum > 9) 
	    { 
	        if(a == 0) 
	        { 
	            a = sum; 
	            sum = 0; 
	        } 
	        sum += a % 10; 
	        a /= 10; 
	    } 
	    System.out.println(sum);; 
				
				

	}

}
