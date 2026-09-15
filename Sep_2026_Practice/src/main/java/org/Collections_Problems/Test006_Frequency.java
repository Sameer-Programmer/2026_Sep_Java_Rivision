package org.Collections_Problems;

import java.util.HashMap;

public class Test006_Frequency {
    public static void main(String[] args) {

        int [] arr = {1,2,3,1,4,5,6};

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int x : arr){
            if(hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);
            }else {
                hm.put(x,1);
            }
        }
        System.out.println(hm);



    }
}
