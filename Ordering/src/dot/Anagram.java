package dot;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Mary";
				
		String s1= "Army";
		
		for (int i=0;i<=s.length()-1;i++) {
			
			for (int j = 0; j<=s1.length()-1;j++) {
				
				System.out.println(s.charAt(i));
				System.out.println(s1.charAt(j));
				
				if (s.charAt(i)==s1.charAt(j)){
					

					
					break;
				} else {
					
					System.out.println("not a num");
				}
				
			}
			
			
		}

	}

}
