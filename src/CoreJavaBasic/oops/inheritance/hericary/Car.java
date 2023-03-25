package CoreJavaBasic.oops.inheritance.hericary;

public class Car extends Vehicle {
    String name;
    int speed;

    public Car(int topSpeed, String engine, String name, int speed) {
        super(topSpeed, engine);
        this.name = name;
        this.speed = speed;
        System.out.println("car");
    }

}
