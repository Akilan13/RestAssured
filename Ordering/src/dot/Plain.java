package dot;

public class Plain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "MALAYALAMS";
		
		StringBuffer si = new StringBuffer();
		si.append(s);
		
		StringBuffer rev = si.reverse();
		
		if (rev.equals(si)) {
			
			System.out.println("Palindrome");
			
			
		} else {
			
			System.out.println("Not a Plaindrome");
		}
		
		
		
		

	}

}
