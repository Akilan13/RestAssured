package dot;

import java.util.List;

public class NonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "is it your first company";
		
		String[] s1 = s.replaceAll("\\s", "").split("");
		
		boolean flag = true;
		
		System.out.println(s1.length);
		
		for (int i =0;i<s1.length-1;i++) {
			flag = false;
			for (int j = i+1;j<=s1.length-1;j++) {
				
				if (s1[i].equals(s1[j])) {
					flag = true;
					break;
				}
			}
			
			if (!flag) {
				
				System.out.println(s1[i]);
				break;
			}
			
			
		}

	}

}
