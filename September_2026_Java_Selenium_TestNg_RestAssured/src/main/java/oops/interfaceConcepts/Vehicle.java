package oops.interfaceConcepts;

public interface Vehicle {
    public void vehiclestart();
    public void vehiclestops();
}

 interface Technology{
     public void AndroidAutoplay();
}
class Car implements Vehicle,Technology {

    @Override
    public void vehiclestart() {
        System.out.println("vehicleStarts");

    }

    @Override
    public void vehiclestops() {
        System.out.println("vehicleStops");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.vehiclestart();
        car.vehiclestops();
        car.AndroidAutoplay();
    }

    @Override
    public void AndroidAutoplay() {
        System.out.println("Android Autoplay Is installed with parking sensors");
    }
}