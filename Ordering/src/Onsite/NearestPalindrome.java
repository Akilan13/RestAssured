package Onsite;

public class NearestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n ="1221748798347938";
		long num = Long.parseLong(n);
        for (long i = 1;; i++) {
            if (isPalindrome(num - i)) {
             
            System.out.println("snallest" + (num - i));
            break;
            }
        }
        for (long i = 1;; i++) {
            if (isPalindrome(num + i)) {
             
            System.out.println("Greatest" + (num + i));
            break;
            }
        }
    }
    static boolean isPalindrome(long x) {
        long t = x, rev = 0;
        while (t > 0) {
            rev = 10 * rev + t % 10;
            t /= 10;
        }
        return rev == x;
		
		

	}

}
