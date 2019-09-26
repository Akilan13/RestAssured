package dot;

public class Minimum_Swaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,4,5,1,3};
		
		int swap=0;
		boolean visited[]=new boolean[arr.length];

		for(int i=0;i<arr.length;i++){
			int j=i,cycle=0;

			while(!visited[j]){
				visited[j]=true;
				j=arr[j]-1;
				cycle++;
			}
			
			if(cycle!=0)
				swap+=cycle-1;
		}
		System.out.println(swap);;

	}

}
