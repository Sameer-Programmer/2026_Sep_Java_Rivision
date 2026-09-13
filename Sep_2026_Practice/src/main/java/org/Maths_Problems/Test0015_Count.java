package org.Maths_Problems;

public class Test0015_Count {
    public static void main(String[] args) {
        int count = 0;
        for(int num =100; num>0; num =num/10){
            count++;
        }
        System.out.println(count);
    }
}
