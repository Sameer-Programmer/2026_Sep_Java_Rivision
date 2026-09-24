package foundation.Collections_Problems;

import java.util.HashMap;

public class Test0010_FrequencyofElements {
    public static void main(String[] args) {
        String s = "Shaik Mohammed Sameer Xx";
        char [] arr = s.toCharArray();

        HashMap<Character,Integer>hm = new HashMap<>();
        for(Character x: arr){
            x = Character.toLowerCase(x);

            if(Character.isWhitespace(x)){
                continue;
            }
            if(hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);
            }else {
                hm.put(x,1);
            }
        }

       // System.out.println(hm);

        for(Object x : hm.keySet()){
            System.out.println(x+":"+hm.get(x));
        }
    }
}
