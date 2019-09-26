package dot;

public class Left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d=2;
		int [] a = {1,2,3,4,5};
		
       
        for (int i = 0;i<d;i++){
        	 int temp=a[0];
            for (int j=0;j<a.length-1;j++){
            //a[j]=temp;
            a[j]= a[j+1];


        }
        //int k=0;
        a[a.length-1]=temp;
        }
        System.out.println(a);

	}

}
