package org.Warmup;

public class Test001 {
    public static void main(String[] args) {
        int []  arr1 = {1,2,3,4,5,6,7,8,9};
        int []  arr2 = {11,12,13,4,5,16,17,18,19};

        for(int i = 0; i<arr1.length;i++){
            for(int j =0; j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr2[j]);
                }
            }
        }
    }
}
