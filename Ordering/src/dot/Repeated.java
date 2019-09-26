package dot;

public class Repeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "ab";
		String m ="";
		long n = 100;
		long len = n/(s.length());
		long rem = n%(s.length());
		int Count = 0;
		
			String reverse = "";
			for (int i =0; i<len;i++){

				reverse = reverse+s;
		
			}
			if (rem>0) {
			for (int k = 0;k<rem;k++) {
				
				 m = reverse+s.charAt(k);
			}
			}else {
				m=reverse;
				
			}

			for (int j = 0; j<=m.length()-1;j++){
				
				String result = Character.toString(m.charAt(j));

			    if (result.equals("a")){

			Count++;
			    }

			    
			}
			System.out.println(Count);
	}

}

