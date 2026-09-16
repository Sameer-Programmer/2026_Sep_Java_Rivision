package Foundation.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test003_RemoveDuplicates {
    public static void main(String[] args) {
        String s1 = "aabbcc";
        char [] arr = s1.toCharArray();
        HashSet<Character> set = new LinkedHashSet<>();
        for(char x : arr){
            set.add(x);
        }

        for(char ch :set){
            System.out.print(ch);
        }


    }
}
