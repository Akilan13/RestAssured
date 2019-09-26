package Amazon;

public class arrayrevsubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {1,2,3,4,5,6,7,8,9,10,11};
		int N =3;
		int Size = A.length;
		
		for (int i = 0; i < A.length; i += N) {
            int left = i;
            // in case right larger than A.length
            int right = Math.min(i + N - 1, A.length - 1);
         

            // reverse sub array
            while (left < right) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;

                left++;
                right--;
            }
        }

        for (int v : A) {
        	
        	System.out.println(v);
        }
	}

}
