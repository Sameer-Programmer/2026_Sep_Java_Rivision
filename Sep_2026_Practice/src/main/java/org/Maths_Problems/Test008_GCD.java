package org.Maths_Problems;

public class Test008_GCD {
    public static void main(String[] args) {
        int a =10;
        int b =20;

        // gcd =10
        //lcm =20

        int gcd = 0;

        for(int i = 1; i<=a; i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
        int lcm = (a*b)/gcd;
        System.out.println(lcm);
    }
}
