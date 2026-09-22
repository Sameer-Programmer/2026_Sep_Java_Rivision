package foundation.Strings;

import java.util.ArrayList;
import java.util.Collections;

public class Test0018_SortChar {
    public static void main(String[] args) {
        String s = "sameer";
        ArrayList <Character> list = new ArrayList<>();
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            list.add(ch);
        }

        Collections.sort(list);
        System.out.println(list);
        System.out.println( list.toString());

    }
}
