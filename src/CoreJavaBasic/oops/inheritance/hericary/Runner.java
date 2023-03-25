package CoreJavaBasic.oops.inheritance.hericary;

public class Runner {

    public static void main(String[] args) {

        Car car = new Car(100, "Petrol", "Honda", 120);
        car.start();
        car.stop();
        System.out.println();

        Bike bike = new Bike(100, "Petrol", "Honda", 120);
        bike.start();
        bike.stop();
    }
}
