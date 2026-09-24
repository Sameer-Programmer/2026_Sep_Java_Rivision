package oops.Concepts_Constructer;




public class Vehicle {
   String vehicleName;
   int model;

    Vehicle (){
        System.out.println("printvehicleDetails");
    }

    Vehicle (int model){
       this.model = model;
    }

    Vehicle (String vehicleName){
      this.  vehicleName = vehicleName;
    }

    public void printVehicleinfo(){
        System.out.println(vehicleName);
       // System.out.println(model);
    }

    public void printModelfo(){
        System.out.println(model);
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(); // default constructer
        Vehicle vehicle2 = new Vehicle("Hyndai_Exter");
        Vehicle vehicle3= new Vehicle(2024);
        vehicle2.printVehicleinfo();
        vehicle3.printModelfo(); //2024
    }

}
/*
this.model = model;
   ↑          ↑
   |          |
Instance     Local
variable    variable
 */