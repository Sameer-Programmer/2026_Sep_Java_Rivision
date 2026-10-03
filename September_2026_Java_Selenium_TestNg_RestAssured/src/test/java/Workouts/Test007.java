package Workouts;

import java.util.Arrays;

public class Test007 {
    public static void main(String[] args) {
      String s = "Sameer1234";
      char  [] arr = s.toCharArray();
      int left = 0;
      int right = s.length()-1;
      while(left<right){
         boolean b1= Character.isDigit(s.charAt(left));
         boolean b2= Character.isDigit(s.charAt(right));

         if(b1){
             left++;
         } else if (b2) {
             right--;
         }else {
             char ch1 = arr[left];
             arr[left]=arr[right] ; // Direct updation
             arr[right] = ch1;

             left++;
             right--;
         }
      }
        System.out.println(Arrays.toString(arr));



    }
}
