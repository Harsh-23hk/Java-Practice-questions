package CoreJavaBasic.oops.inheritance.hericary;

public class Vehicle {

    String engine;
    int topSpeed;

    public Vehicle(int topSpeed, String engine) {
        this.engine = engine;
        this.topSpeed = topSpeed;
    }

    public void start() {
        System.out.println("Vehicle Started");
    }

    public void stop() {
        System.out.println("Vehicle Stopped");
    }
}



