package Amazon;

public class Trueorfalse {

	public static void main(String[] args) {
        int[] s= {1,1,0,0,1,3,4};
//     /**/   int[] s = {/*1,1,1,*/0,0,3,4};
        int i=0;
        boolean isOneStart = false;
        boolean isOneEnd = false;
        boolean isConsec = true;
        while(i<s.length){

            if(isOneStart==false && s[i]==1){
                isOneStart = true;
            }

            else if(isOneStart==true && isOneEnd==false && s[i]!=1){
                isOneEnd = true;
            }

            else if(isOneEnd== true && s[i]==1){
                isConsec = false;
                break;
            }

            i++;
        }

        if(isOneStart==false){
            System.out.println("Array doesnt have any Ones");
        } else {
            if (isConsec) {
                System.out.println("It is consecutive");
            } else {
                System.out.println("It is not consecutive");
            }
        }
    }
}


