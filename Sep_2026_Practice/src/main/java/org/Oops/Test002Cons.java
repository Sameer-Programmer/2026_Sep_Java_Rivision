package org.Oops;

public class Test002Cons {
    Test002Cons (){
        System.out.println("constructer");
    }
    Test002Cons (String s){
        System.out.println("para constructer");
    }
    Test002Cons (int  a){
        System.out.println("para constructer");
    }
    public static void main(String[] args) {
        Test002Cons ts = new Test002Cons("Sameer");
    }
}
/*
now two call 3 constructer we need to create 3 objects
Test002Cons ts1 = new Test002Cons();
        Test002Cons ts2 = new Test002Cons("Sameer");
        Test002Cons ts3 = new Test002Cons(25);
 */