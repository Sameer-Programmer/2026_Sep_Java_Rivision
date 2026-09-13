package org.Arrays_Problems;

import java.util.Arrays;

public class Test003_BubbleSort {
    public static void main(String[] args) {
        int [] arr = {11,2,3,4,5,6,7,8,9,0,1};
        for(int i = 0; i<arr.length; i++){
           for(int j = 0; j<arr.length-1-i;j++) {
               if(arr[j]>arr[j+1]){
                   int c = arr[j+1];
                   arr[j+1] = arr[j];
                   arr[j] = c;
               }
           }

        }

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);
        System.out.println(arr[1]);


    }
}
