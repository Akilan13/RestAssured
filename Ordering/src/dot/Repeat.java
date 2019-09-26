package dot;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "a";
		//String m ="";
		long n = 100;
		long len = n/(s.length());
		long rem = n%(s.length());
        long countForSubstring = 0;
        long totalCount = 0;
		//String reverse = "";
		
		for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'a')
            {
            	countForSubstring++;
            }
        }
		
		//Find the number of instances
		
		totalCount = countForSubstring*len;
		
		
		for(int k = 0; k < rem; k++)
        {
            if(s.charAt(k) == 'a')
            {
            	totalCount++;
            }
        }
System.out.println(totalCount);
	}

}
