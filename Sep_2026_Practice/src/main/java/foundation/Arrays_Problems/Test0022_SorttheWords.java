package foundation.Arrays_Problems;

import java.util.ArrayList;
import java.util.Collections;

//Sort the
//words of a
//sentence
//alphabetically

public class Test0022_SorttheWords {
    public static void main(String[] args) {
        String s = "sun rises in the east";
        String [] arr = s.split(" ");
        System.out.println(arr.length);
        ArrayList<String>list = new ArrayList<>();
        for(String word:arr){
            list.add(word);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
