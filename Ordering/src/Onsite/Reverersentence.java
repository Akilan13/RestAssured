package Onsite;

public class Reverersentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "This is sample text";
		String Reverse = "";
		
		StringBuilder n = new StringBuilder(s);
		
		String rev = n.reverse().toString();
		
		String[] a = rev.split("\\s+");
		
		for (int i =a.length-1;i>=0;i--) {
			
			
			
			Reverse = Reverse +a[i] + ' ';
			
			
		}
		
		System.out.println(Reverse);

	}

}
