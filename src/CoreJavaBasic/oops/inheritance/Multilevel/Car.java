package CoreJavaBasic.oops.inheritance.Multilevel;

public class Car extends Vehicle {
    String typeofvehicle;
    int speed;

    Car(int speed){
        super(speed);
        this.speed=speed;
    }

}

