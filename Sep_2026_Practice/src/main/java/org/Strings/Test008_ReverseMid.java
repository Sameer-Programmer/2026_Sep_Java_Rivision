package org.Strings;

public class Test008_ReverseMid {
    public static void main(String[] args) {
        String s1 = "I love India"; //let result = i evol India
        String [] arr = s1.split(" ");

        for(int i = 0; i< arr.length; i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            if(sb.toString().equals("love")){
                System.out.println(sb.reverse());
            }else {
                System.out.println(sb);
            }

        }

        }
    }

