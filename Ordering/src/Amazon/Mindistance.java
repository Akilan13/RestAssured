package Amazon;

public class Mindistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "the brown quick frog quick the";
		
		String S1 ="the";
		
		boolean startflag = false;
		boolean middleflag = false;
		boolean endflag = false;
		
		int startindex =Integer.MIN_VALUE;
		int Endindex = Integer.MAX_VALUE;
		
		String[] d =s.toLowerCase().split("\\s+");
		//char [] c = s.toCharArray();
		
		for (int i =0;i<d.length;i++) {
			
			if (d[i].equals("the") && startflag == false) {
				
				startflag = true;
				startindex=i;
			} else if (startflag == true && middleflag == false && (!d[i].equals("the"))) {
				
				middleflag = true;
			} else if (middleflag == true && d[i].equals("the")) {
				endflag = true;
				Endindex =i;
				break;
				
			}
		}
		
		System.out.println(Endindex-startindex);

	}

}
