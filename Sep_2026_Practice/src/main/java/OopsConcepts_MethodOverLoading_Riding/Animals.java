package OopsConcepts_MethodOverLoading_Riding;

import org.Oops_Class_Method_Obj.Animal;

public class Animals {

    public  void sound(){
        System.out.println("Making sound");
    }
}

class Dog extends Animals{
    public  void sound(){
        System.out.println("wovv wovv");
    }

    public static void main(String[] args) {
        Animals d = new Animals();
        d.sound(); //Making sound

        Dog d1 = new Dog();
        d1.sound(); // OverRided //wovv wovv

        Animals a1 = new Dog();
        a1.sound(); ////wovv wovv  // Here its wovv because is non sttaic
        // if it is static then it is Making sound

    }
}
