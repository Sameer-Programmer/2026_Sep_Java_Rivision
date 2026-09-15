package org.Warmup;

public class Test11_sum_Target {
    public static void main(String[] args) {
        int arr [] = {1,2,1,1,2,3};
        int target = 5;


        for(int i = 0; i<arr.length; i++){
            int currentsum = 0;
            for(int j = i ; j< arr.length;j++){

                currentsum = currentsum +arr[j];
                if(currentsum == target){
                    System.out.println(i+":"+j);
                }
            }
        }

    }
}
