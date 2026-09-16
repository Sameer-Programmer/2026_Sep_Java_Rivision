package Foundation.Oops_Class_Method_Obj;
/*
classification of Basic_Constructer

 */
public class Animal {
    Animal(){
        System.out.println("constructer");
    }
    Animal(String s){
        System.out.println("para constructer");
    }
    Animal(int  a){
        System.out.println("para constructer");
    }
    public static void main(String[] args) {
        Animal ts = new Animal("Sameer");
    }
}
/*
now two call 3 constructer we need to create 3 objects
Test002Cons ts1 = new Test002Cons();
        Test002Cons ts2 = new Test002Cons("Sameer");
        Test002Cons ts3 = new Test002Cons(25);
 */