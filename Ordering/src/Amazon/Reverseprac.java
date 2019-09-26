package Amazon;

public class Reverseprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		int N=3;
		
		for (int i =0;i<arr.length;i+=N) {
			
			int left =i;
			
			
			
			int j =Math.min(i+N-1, arr.length-1);
			
			int right =j;
			
			while(left<right) {
				
				int temp = arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
				
	
				
			}
			
		}
		
		for (int c:arr) {
			
			System.out.print(c);
		}


		}
	


}
