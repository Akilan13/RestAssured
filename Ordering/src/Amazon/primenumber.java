package Amazon;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int n = 3;
int temp =0;
boolean isprime = true;

for (int i =2;i<n/2;i++) {
	
	 temp = n%i;
	
	if (temp==0) {
		
		isprime = false;
		break;
		
		
	} 
}
		
	if (isprime) {
		
		System.out.println("Prime");
		
		
	}

	}

}
