package CoreJavaBasic.oops.inheritance.Singlelevel;

public class Runner {

    public static void main(String[] args) {
        Dog dog = new Dog("Domestic", "Labrador");
        System.out.println(dog);
        dog.bark();
        dog.eat();

    }
}
