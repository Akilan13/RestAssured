package Amazon;

import java.util.HashMap;
import java.util.Map;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,2,3,4,5,2,2,4,5,1,2};
		
		Map<Integer,Integer>Ma = new HashMap<Integer,Integer>();
		
		for (int i =0;i<=arr.length-1;i++) {
			
			if (Ma.containsKey(arr[i])) {
				
				Ma.put(arr[i], Ma.get(arr[i])+1);
			} else {
				
				Ma.put(arr[i],1);
			}
		}
		
		System.out.println(Ma);

	}

}
