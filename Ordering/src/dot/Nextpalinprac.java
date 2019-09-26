package dot;

public class Nextpalinprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = { 9, 4, 9, 8, 7, 9, 7, 8, 3, 2, 2 }; 
		
	int size = num.length;
	int mid = (size/2);
	
	int i = mid -1;
	int j = (size/2==0)? mid:mid+1;
	
	while (i>=0 && num[i]==num[j]) {
		
		i--;
		j++;
	}
	
	boolean leftsmaller = false;
	
	if (num[i]<num[j]) {
	
		leftsmaller = true;
		
	}
	
	while (i>=0) {
		
    num[j]=num[i];
    j++;
    i--;
	}
	
	 if (leftsmaller) {
		 int carry =1;
		 
		 if (size%2==1) {
		 
		 num[mid]+=1;
		 
		  carry = num[mid]/10;
		 num[mid]%=10;
		 
		 
	 }
	 
	  i = mid-1;
	  j =  (size/2==0)? mid:mid+1;
	 
	 while (i>=0) {
		 
		 num[i]= num[i]+carry;
		 carry = num[i]/10;
		 num[i]%=10;
		 num[j]=num[i];
		 j++;
		 i--;
		 
	 }

	}
	 
	 for (int l :num) {
		 
		 System.out.println(l);
	 }
	}
}
