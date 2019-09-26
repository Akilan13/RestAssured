package Onsite;

public class Converttoplaindrome {
	static String s =  "abcdtfhgdgchjdghj";
	static char[] s1 = s.toCharArray();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int n = s1.length;
		for (int i =0;i<n-1;i++) {
			
			int left = i;
			int right = n-1;
			while(left<right) {
			if (s1[left]==s1[right]) {
				
				left++;
				right--;
			} else {
				s1[right]=s1[left];
				left++;
				right--;
			}
			}
			
			break;
			
		}
		
			String q = new String(s1);
			
			if (isplaindrome(q)) {
				
				System.out.println(q + ' '+ "is a plaindrome");
			}

	}
	
	public static boolean isplaindrome(String s) {
		boolean flag = false;
		String s4 = new StringBuilder(s).reverse().toString();
		
		if  (s4.equals(s)) {
			
			flag = true;
		}
		
		return flag;
		
		
	}

}
