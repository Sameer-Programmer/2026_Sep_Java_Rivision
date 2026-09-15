package org.Strings;

import java.util.ArrayList;
import java.util.Collections;

public class Test007_Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();

        ArrayList<Character>list1 = new ArrayList<>();
        for(char x : arr1){
            list1.add(x);
        }
        Collections.sort(list1);

        ArrayList<Character>list2 = new ArrayList<>();
        for(char x : arr2){
            list2.add(x);
        }
        Collections.sort(list2);

        System.out.println(list1);
        System.out.println(list2);

        if(list1.equals(list2)){
            System.out.println("Anagram");
        }


    }
}
