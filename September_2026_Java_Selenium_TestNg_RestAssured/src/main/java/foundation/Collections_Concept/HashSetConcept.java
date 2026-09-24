package foundation.Collections_Concept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetConcept {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        set.add("Sameer");
        set.add("Sameer");
        set.add("Apple");
        System.out.println(set); // Here Insertion Order is Not preserved

        ArrayList list = new ArrayList<>(set);
        System.out.println(list.get(0));

        HashSet linkedset = new LinkedHashSet();
        linkedset.add("Sameer");
        linkedset.add("Sameer");
        linkedset.add("Apple");
        System.out.println(linkedset); // Here Insertion Order is  preserved


        /*
        -HashSet - Nopreserved the insertion Order ,performance Fast
        -Linked HashSet -preserved the insertion Order ,performance Slow
         */


    }
}
