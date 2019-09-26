package Amazon;

import java.util.TreeMap;

public class Mindiffprimenumbers {

	public static void main(String[] args) {
		int[] numbers = {4,-113,1,45,78,-2,-3,7};
		System.out.println(new Mindiffprimenumbers().findPrimes(numbers));	
		
	}
	
	private int findPrimes(int [] numbers) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for(int i=0;i<numbers.length;i++){
			if(isPrime(numbers[i]))
				map.put(numbers[i], numbers[i]);
		}
		
		return map.firstKey().intValue() - map.lastKey().intValue();
	}
	
	private boolean isPrime(int n){
			
		if(n<0)
 			n = 0 - n;  //just convert n to positive for simplicity
		for(int i = 2;i<=n/2;i++){
			if(n%i==0)
			return false;
			break;
		}
		return true;
	}
}