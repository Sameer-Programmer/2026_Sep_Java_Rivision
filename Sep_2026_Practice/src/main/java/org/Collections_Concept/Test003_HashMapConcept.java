package org.Collections_Concept;

import java.util.HashMap;

public class Test003_HashMapConcept {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 1);
        hm.put(2, 1);
        hm.put(3, 1);
        hm.put(4, 1);
        System.out.println(hm);
        System.out.println(hm.get(1)); // To read with help of Key
        hm.remove(1); // remove by key
        System.out.println(hm);
        System.out.println(hm.containsKey(1));
        System.out.println(hm.size());

        for(Integer x :hm.keySet()){
            System.out.println(x); // to print only Keys
        }

        for(Integer x :hm.keySet()){
            System.out.println(x+" : "+hm.get(x)); // to print  Key and Value
        }



        hm.clear();
        System.out.println(hm);

    }
}
