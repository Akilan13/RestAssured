package dot;

public class Subpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "banana";
		if (s.isEmpty()) {
			System.out.println("");;
		}
	 
		if (s.length() == 1) {
			System.out.println(s);;
		}
	 
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			// get longest palindrome with center of i
			String tmp = helper(s, i, i);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
	 
			// get longest palindrome with center of i, i+1
			tmp = helper(s, i, i + 1);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
		}
	 
		System.out.println(longest);;
	}
	 
	// Given a center, either one letter or two letter, 
	// Find longest palindrome
	public static String helper(String s, int begin, int end) {
		int max = s.length();
		while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		return s.substring(begin + 1, end);
	}

	}


