package Amazon;

public class Arthmeticexpression {
	
	
	public static boolean check(String s) {
		
		
		String[] s1 = s.split("");
		
		int n =0;
		
		for (int i =0;i<s1.length;i++) {
			
			if (s1[i].equals("(")) {
				n++;
				
			} else if
				
				 (s1[i].equals(")") && n==0) {
								
				return false;
				
			} else if (s1[i].equals(")") && n!=0){
				
				n--;
			}
		}
		
		
		
		return n==0;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "()()";
		
		if (check(s)) {
			
			System.out.println("Valid arth");
		} else {
			
			System.out.println("nota Valid arth");
		}
		

	}

}
