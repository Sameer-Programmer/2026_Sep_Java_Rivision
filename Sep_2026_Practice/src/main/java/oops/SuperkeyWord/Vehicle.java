package oops.SuperkeyWord;

public class Vehicle {
    String vehicleColour ;

    Vehicle (){
        System.out.println("Vehicle Details"); // default
    }

    Vehicle (String varient){
        System.out.println("Base Varient"); // default
    }

    void start(){
        System.out.println("vehicle started parent");
    }


}

class HyndaiCar extends Vehicle {
    double price ;

    {
        System.out.println(super.vehicleColour);// ✅ Instance block
        System.out.println("instance block ");
    }

    public void carinfo(){
        super.start();
        System.out.println(super.vehicleColour);

    }
    HyndaiCar (){
        super("BaseVarient");
        System.out.println(super.vehicleColour+"   From child class constructer");
        System.out.println("No power Windows");
    }


    public static void main(String[] args) {
        HyndaiCar hyndaiCar = new HyndaiCar();
        hyndaiCar.carinfo();
    }
}

