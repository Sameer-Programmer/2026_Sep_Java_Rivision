package org.Strings;

import java.util.Arrays;

public class Test0011_ProblemSwap {
    public static void main(String[] args) {

        String s = "ab12cd"; ///dc12ba
        char arr [] = s.toCharArray();
       int left = 0;
       int right = arr.length-1;
       while(left<right){
           boolean l = Character.isLetter(arr[left]);
           boolean r = Character.isLetter(arr[right]);
           if(!l){
               left++;
           }else if(!r){
               right--;
           }else {
               char temp = arr[left];
               arr[left] = arr[right];
               arr[right] = temp;
               left++;
               right--;
           }


       }

        System.out.println(Arrays.toString(arr));


    }
}
