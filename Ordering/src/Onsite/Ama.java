package Onsite;

public class Ama {
	
	public static void main(String[] args) {

		int a[] = {1,2,4,4,1,2,3};

		int n = a.length;

		if (n==0 || n==1){

		System.out.println("no sum");


		}

			for (int i =1;i<n;i++){
			
			int Sum1=0;
			int Sum2=0;

				for (int j=0;j<i;j++){
				
				Sum1+=a[j];
				
				}
				
				for (int k=i+1;k<n;k++){
				
				Sum2+=a[k];
				
				}
				
				if (Sum1==Sum2){
				
				System.out.println("equal");
				System.out.println(Sum1);
				break;

			}


		}

}
	
}
