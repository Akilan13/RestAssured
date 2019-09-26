
public class Matchstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "string";
		String s2 = "strong";
		
		for (int i =0;i<s1.length();i++) {
			
			for (int j=0;j<s2.length();j++) {
				
				if (s1.charAt(i)==s2.charAt(j)) {
					
					System.out.print(s1.charAt(i)+"");
					break;
					
				}
			}
		}
		
		

	}

}
