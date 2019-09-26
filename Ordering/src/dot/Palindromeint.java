package dot;

public class Palindromeint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int palindrome = 121;
		int reverse = 0;
		while (palindrome!=0) {
		int remainder = palindrome%2;
		
		reverse = reverse + remainder;
		
		palindrome = palindrome/10;
		
		
				
	}
		
	
		
	if (palindrome==reverse) {
		
		System.out.println("Plaindrome");

}
	
}
}
