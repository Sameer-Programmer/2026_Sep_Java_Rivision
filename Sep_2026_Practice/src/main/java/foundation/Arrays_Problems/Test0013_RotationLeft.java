package foundation.Arrays_Problems;

/*
Right
Step 1 -> Reverse Whole Array
Step 2 -> Reverse Up to K
Step 3 --> From K to End
 */

/*
For Left --> 231

 */


import java.util.Arrays;

public class Test0013_RotationLeft {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int left = 0;
        int right = k% arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp ;
            left++;
            right--;

        }
        System.out.println(Arrays.toString(arr));

         left = 2;
        right = arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp ;
            left++;
            right--;

        }
        System.out.println(Arrays.toString(arr));

        left = 0;
        right = arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp ;
            left++;
            right--;

        }
        System.out.println(Arrays.toString(arr));

    }
}
