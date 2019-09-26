package dot;

public class Checkint {

	public boolean checkint(String s) {
		boolean Flag = true;
		try {
			
			Integer.parseInt(s);
		} catch (Exception e) {
			
			Flag = false;
		}
		
		return Flag;
		
		
	}
	
	public static void main (String[] args) {
		
		String s = "ab50dt614h";
		String k ="";
		String [] p = s.split("");
		boolean start = false;
		//boolean end =false;
		int startindex=0;
		int Endindex = 0;
		int sum =0;
		
		Checkint checkint = new Checkint();
		System.out.println(p.length);
		
		for (int i =0;i<p.length;i++) {
			 //sum =0;
			if ((checkint.checkint(p[i])) && !start) {
				
				start = true;
				 startindex =i;
				 if (i==p.length-1) System.out.println("true");
			} else if (((!checkint.checkint(p[i])) && start)){
				
					Endindex = i-1;
					 k = s.substring(startindex, Endindex+1);
					 sum  = sum + Integer.parseInt(k);
					 start = false;
			} 
			
			if (checkint.checkint(p[i]) && (i==p.length-1)) {
					Endindex = i;
					 k = s.substring(startindex, Endindex+1);
					 sum  = sum + Integer.parseInt(k);
					 start = false;
					
			}
			
			
			
			
			
		
			
			
		}
		

		
System.out.println(sum);
		
		
		

		
		
	}
}





