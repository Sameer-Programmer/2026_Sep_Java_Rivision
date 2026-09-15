package org.Strings;

public class Test009_CapitalizeFirstcharInaWord {
    public static void main(String[] args) {
        String s = "hello world";
        String [] arr = s.split(" ");
        System.out.println(arr.length);

        for(String s1 :arr){
          char up =  Character.toUpperCase(s1.charAt(0));
            System.out.println(up+s1.substring(1));
        }
    }
}
