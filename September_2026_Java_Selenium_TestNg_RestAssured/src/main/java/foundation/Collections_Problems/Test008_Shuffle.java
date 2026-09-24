package foundation.Collections_Problems;

import java.util.ArrayList;
import java.util.Collections;

public class Test008_Shuffle {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        ArrayList <Integer>list = new ArrayList<>();
        for(int x:arr){
            list.add(x);
        }
        Collections.shuffle(list);
        System.out.println(list);
    }
}
