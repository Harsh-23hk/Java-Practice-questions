package CoreJavaBasic.oops.inheritance.hericary;

public class Bike extends Vehicle {

    String name;
    int speed;

    public Bike(int topSpeed, String engine, String name, int speed) {
        super(topSpeed, engine);
        this.name = name;
        this.speed = speed;
        System.out.println("bike");
    }





}
