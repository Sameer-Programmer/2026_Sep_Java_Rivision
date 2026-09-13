package org.Arrays_Problems;

public class Test007_FindMissingNumber {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,6,7};
        int n = 7;
        int sum =0;
        int result = n*(n+1)/2;
        System.out.println(result);
        for(int x :arr){
            sum = sum+x;
        }
        System.out.println(sum);
        System.out.println(result-sum);
    }
}
