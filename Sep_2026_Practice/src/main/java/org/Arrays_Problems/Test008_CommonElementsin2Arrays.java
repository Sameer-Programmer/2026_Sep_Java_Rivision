package org.Arrays_Problems;

public class Test008_CommonElementsin2Arrays {
    public static void main(String[] args) {
        int [] arr1 = {1,3,4,5,6,7};
        int [] arr2 = {11,13,4,5,16,17};


        for(int i= 0; i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
