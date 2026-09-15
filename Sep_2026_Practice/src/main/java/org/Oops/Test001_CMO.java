package org.Oops;

public class Test001_CMO {

    int a =10; // instance variables
    int b = 20;

    static int  d =20;

    public void m1(int c , int d){
        System.out.println(c+d+"  ParamtertizedMethod");
    }
    public void m2(){
        System.out.println("void method");
    }

    public int m3(){
        int age = 30; //local variables
        System.out.println("return method");
        return age;
    }


    public static void main(String[] args) {
        System.out.println(d);
        Test001_CMO test001Cmo = new Test001_CMO();
        test001Cmo.m1(1,2);
        test001Cmo.m2();
        System.out.println( test001Cmo.m3());



    }
}
