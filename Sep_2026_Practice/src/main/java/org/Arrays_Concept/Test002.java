package org.Arrays_Concept;

public class Test002 {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2},
                {1,3},
                {1,4}

        };

        System.out.println(arr.length+"   Rows");
        System.out.println(arr[0].length+"   columns");

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[0].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
