package Onsite;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int n =4;
	boolean flag = true;
	
	for (int i =2;i<=n/2;i++) {
		
		if (n%i==0) {
			flag = false;
			break;
		}
		
		}
	
	if (flag) {
		System.out.println("Number is prime");
	} else {
		
		System.out.println("Number is not prime");
	}

	}

}
