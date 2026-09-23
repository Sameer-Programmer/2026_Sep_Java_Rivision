package Workouts;

import java.util.HashMap;

public class Test004 {
    public static void main(String[] args) {
        String s = "Sameer Mohammed";
        HashMap<Character,Integer>hm = new HashMap<>();
        for(int  i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            ch = Character.toLowerCase(ch);
            if(Character.isWhitespace(ch)){
                continue;
            }
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else {
                hm.put(ch,1);
            }
        }
        System.out.println(hm);

        for(Character k : hm.keySet()){
            System.out.println(k+": "+hm.get(k));
        }

    }
}
