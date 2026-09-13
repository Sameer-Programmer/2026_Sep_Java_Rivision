package org.Maths_Problems;

public class Test003_PrimeNumberCheck {
    public static void main(String[] args) {
        int a =7;
        int count = 0;
        for(int i = 1; i<a; i++){
           if(a%i==0){
               count++;
           }

        }

        if(count ==1){
            System.out.println(a+" is Primenumber");
        }else {
            System.out.println(a+" is Not Primenumber");
        }



    }
}
