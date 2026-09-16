package Oops.Concepts_MethodOverLoading_Riding;

public class A {

    public  void m1(int a){
        System.out.println(a);
    }
    public  void m1(String a){
        System.out.println(a);
    }

    public  void m1(String a,int b){
        System.out.println(a);
    }

    public  void m1(int b,String a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        A a = new A();
        a.m1(1);
        a.m1("sameer");
        a.m1(1,"2");
        a.m1("2",1);
    }
}
