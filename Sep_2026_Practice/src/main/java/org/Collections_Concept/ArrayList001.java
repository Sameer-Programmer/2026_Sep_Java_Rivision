package org.Collections_Concept;

import java.util.ArrayList;

public class ArrayList001 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(4);
        list.add(5); // Create
        list.add(0,1); //Update
        list.add("sameer");


        System.out.println(list.size());//Length
        System.out.println(list); //read
        list.remove(0);
        System.out.println(list); //read
        System.out.println(list.get(0)); // read exactly at Index

        System.out.println(list.indexOf(1));
        list.set(0,12); //replacement Directly at the index
        System.out.println(list);
       // Collections.sort(list);
        System.out.println(list);
        list.clear();
        System.out.println(list);
        System.out.println("Dome");


    }
}
