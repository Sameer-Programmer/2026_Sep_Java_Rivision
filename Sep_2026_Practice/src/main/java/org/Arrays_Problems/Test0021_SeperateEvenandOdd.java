package org.Arrays_Problems;

import java.util.Arrays;

public class Test0021_SeperateEvenandOdd {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int evencount = 0;
        int oddCount = 0;


        for(int i = 0; i< arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }else {
                oddCount++;
            }
        }

        int [] even = new int[evencount];
        int [] odd = new int[oddCount];
        int evenIndex = 0;
        int oddIndex = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i]%2==0){
              even[evenIndex]= arr[i];
              evenIndex++;
            }else {
                odd[oddIndex]= arr[i];
                oddIndex++;
            }
        }


        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));


    }
}
