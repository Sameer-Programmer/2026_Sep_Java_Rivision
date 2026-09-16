package Oops.Concepts_Inheritance;

public class A {
    int a =10;
    int b=10;

    public void m1(){
        int total = a+b;
        System.out.println(total);
    }
}
class B extends A {
    public static void main(String[] args) {
        B b  = new B();
        b.m1();
    }


}
