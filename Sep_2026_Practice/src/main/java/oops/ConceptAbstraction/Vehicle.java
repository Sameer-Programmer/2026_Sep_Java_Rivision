package oops.ConceptAbstraction;

abstract class Vehicle {
    abstract void  m1();

    Vehicle(){
        System.out.println("cons");
    }

    public void m2(){
        System.out.println("Abs_Method");
    }
}
class Car extends Vehicle{

    @Override
    void m1() {
        System.out.println("Implementing in child class");
    }

    public static void main(String[] args) {
        Car  car = new Car();
        car.m2();
        car.m1();

    }
}
