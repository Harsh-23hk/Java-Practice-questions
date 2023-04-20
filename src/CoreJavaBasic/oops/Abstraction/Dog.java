package CoreJavaBasic.oops.Abstraction;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    void sound() {
        System.out.println("Dog is barking");
    }

    @Override
    void sleep() {
        System.out.println("Dog is sleeping");
    }

    public static void main(String[] args) {
        Dog d = new Dog("Tom");
        d.eat();
        d.sound();
        d.sleep();
    }
}
