package dot;

public class Clouds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] c = {0,0,1,0,0,1,0};

        int count=0;
        int i =0;

        while (i<c.length-1){
        	
        	int j =i+2;

            if (c[i]+c[j]!=1){

                count++;
                i = i+2;


            }else {
            	
            	count++;
            	i=i+1;
            }
            }
        System.out.println(count);;
        }

      

	}


