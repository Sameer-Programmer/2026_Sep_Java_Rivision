package OopsConcepts_MethodOverLoading_Riding;

public class Vehicle {

    static void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {

    static void start() {
        System.out.println("Car is starting");
    }

    public static void main(String[] args) {

        // 1. Parent reference + Parent object
        Vehicle v = new Vehicle();
        v.start();

        // 2. Child reference + Child object
        Car c = new Car();
        c.start();

        // 3. Parent reference + Child object
        Vehicle v1 = new Car();
        v1.start(); //Vehicle is starting because of static method

        //Because start() is static.
        //
        //Static methods belong to the class,
        // so Java decides which method to call based on the reference type,
        // not the actual object.
    }
}
