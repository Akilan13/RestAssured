package Onsite;

public class Array_Interval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		int i=0;
		int temp =0;
		int N =5;
		int s = a.length;
		
		while (i<a.length-1) {
			
		int Start = i;
		int End = Math.min(i+N-1, a.length);
		if (End ==a.length) break;
		while (Start<End) {
		temp =a[Start];
		a[Start] = a[End];
		a[End] = temp;
		Start++;
		End--;
		}
		i =i+N;
		}
		
		for (int k : a) {
			
			System.out.print("[" + k + "]" + ",");
		}
	}

}
