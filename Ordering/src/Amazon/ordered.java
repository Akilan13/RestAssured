package Amazon;

import java.util.Arrays;

public class ordered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[7];
		int[] b = new int[3];
		
		
		a[0]=40;
		a[1]=4;
		a[2]=2;
		a[3]=5;
		
		b[0]=6;
		b[1]=7;
		b[2]=9;
		
Arrays.sort(a);
Arrays.sort(b);

for (int i=0;i<b.length;i++) {
	
	a[i]=b[i];
	
}

Arrays.sort(a);
for (int k : a) {
	
	System.out.println(k);
}
	}

}
