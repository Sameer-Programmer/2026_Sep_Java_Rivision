package Oops.Concepts_Constructor;

public class Animal {
int x;
    Animal (){
        x = 5;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.x);
    }

}
