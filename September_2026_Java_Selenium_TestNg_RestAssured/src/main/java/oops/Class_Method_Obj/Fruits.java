package oops.Class_Method_Obj;

/*
classification of class , Methods , Objects
 */

public class Fruits {

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
        Fruits fruits = new Fruits();
        fruits.m1(1,2);
        fruits.m2();
        System.out.println( fruits.m3());



    }
}
