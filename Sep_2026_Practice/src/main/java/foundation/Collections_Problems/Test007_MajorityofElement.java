package foundation.Collections_Problems;

import java.util.HashMap;
/*
arr.length = 7
arr.length / 2 = 3

A majority element is an element in an array that appears
 more than n/2 times, where n is the total number of elements in the array.

 */
public class Test007_MajorityofElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 4, 1, 6};


        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int x : arr){
            if(hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);
            }else {
                hm.put(x,1);
            }
        }

        System.out.println(hm);

        for(int x : hm.keySet()){
            if(hm.get(x)> arr.length/2){
                System.out.println(x);
            }
        }


    }
}
