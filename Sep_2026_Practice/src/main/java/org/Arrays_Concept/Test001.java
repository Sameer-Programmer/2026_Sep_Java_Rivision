package org.Arrays_Concept;

import java.util.Arrays;

public class Test001 {
    public static void main(String[] args) {
        int [] arr  = {1,2,3,4,5,6,7,8,9,0};

        System.out.println(arr.length);
        System.out.println(arr[0]); //Read
        arr[0] =100;//update
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr)); // read all
        //now i want to delete the particular Elemnt means better to convert array to list and then remove
        //collections concept
        System.out.println(String.valueOf(arr));

        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("********************");
        for(int x :arr){
            System.out.println(x);
        }
    }
}
