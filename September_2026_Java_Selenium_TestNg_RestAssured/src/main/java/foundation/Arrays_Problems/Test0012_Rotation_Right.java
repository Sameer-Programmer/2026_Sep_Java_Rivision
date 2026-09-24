package foundation.Arrays_Problems;

import java.util.Arrays;

/*
Right
 {1,2,3,4,5,};
[4, 5, 1, 2, 3] //output
Step 1 -> Reverse Whole Array
Step 2 -> Reverse Up to K
Step 3 --> From K to End
 */

/*
For Left --> 231

 */

public class Test0012_Rotation_Right {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,};
        int k = 2;

        int left = 0;
        int right =  arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));

        left = 0;
        right = k%arr.length -1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
        //

        left = k;
        right = arr.length -1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));


    }
}
