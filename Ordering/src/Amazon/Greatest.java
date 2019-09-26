package Amazon;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,4,3,7,4,10,2,8,1};
		
		int Size = arr.length-1;
		
		int maxvalue = 0;
		
		for (int i=0;i<Size;i++) {
			
			if(arr[i]>arr[i+1]) {
				
				maxvalue = arr[i];
			}
				else {
					
					maxvalue = arr[i+1];
				}
				
				
				
				
			}
		System.out.println(maxvalue);
		
		}
		
				
				

	}


