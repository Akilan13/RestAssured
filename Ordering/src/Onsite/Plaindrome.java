package Onsite;

public class Plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n = "283929349";
		StringBuilder s = new StringBuilder(n);
		//String s = Integer.toString(n);
		//char[] s1 = s.toCharArray();
		int Len = s.length();
		int mid = ((Len-1)%2==0)? Len/2:((Len-1)/2);
		
	


		
		if (Len%2==0 && s.charAt(mid)<s.charAt(mid+1)){
			
			s.replace(mid, mid+1, ""+ (char)(s.charAt(mid) + 1));
			 
		
			 String P = mirroring(s.toString());
			 
			 //int y = Integer.parseInt(P);
			 System.out.println(P);
			 
			 int Diff1 = Integer.parseInt(n)-Integer.parseInt(P);
			 System.out.println(Diff1);
			 
			 
			 
		} else if (Len%2==0 && s.charAt(mid)>s.charAt(mid+1)) {
			
			String P = mirroring(s.toString());
			System.out.println(P);
			 int Diff1 = Integer.parseInt(n)-Integer.parseInt(P);
			 System.out.println(Diff1);
			 
			 
		} else if (Len%2==1 && s.charAt(mid-1)>s.charAt(mid+1)) {
			String P = mirroring(s.toString());
			System.out.println(P);
			 int Diff1 = Integer.parseInt(n)-Integer.parseInt(P);
			 System.out.println(Math.abs(Diff1));
			 
			
		} else if (Len%2==1 && s.charAt(mid-1)<s.charAt(mid+1)) {
			//s.replace(mid-1, mid, ""+ (char)(s.charAt(mid-1) + 1));
			s.replace(mid, mid+1, ""+ (char)(s.charAt(mid) + 1));
			
			 String P = mirroring(s.toString());
			 
			 //int y = Integer.parseInt(P);
			 System.out.println(P);
			 
			 int Diff1 = Integer.parseInt(n)-Integer.parseInt(P);
			 System.out.println(Diff1);
			
			
		}
		
	}
	
	public static String mirroring(String s2) {
		
		String s = s2.substring(0, s2.length()/2);
		
		return s + (s2.length()%2==1? s2.charAt(s2.length()/2):"")+ new StringBuilder(s).reverse().toString();
		
		
		
		
	}

}
