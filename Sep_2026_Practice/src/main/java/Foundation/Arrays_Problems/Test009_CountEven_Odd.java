package Foundation.Arrays_Problems;

public class Test009_CountEven_Odd {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,0} ;
        int evencount =0;
        int oddcount=0;

        for(int x :arr){
          if( x%2==0) {
              evencount++;
          }else if(x%2!=0){
              oddcount++;
          }

        }
        System.out.println(evencount);
        System.out.println(oddcount);

    }
}
