package org.Arrays_Problems;

public class Test0015_LastNonRepeted {
    public static void main(String[] args) {
        int [] arr = {1,1, 2,2, 3, 4, 5};

        for(int i = arr.length-1; i> 0;i--){
            int   count = 0;
            for(int j =arr.length-1; j>0;j--){
                if(arr[i]==arr[j]) {
                    count++;
                }
            }

            if(count==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
