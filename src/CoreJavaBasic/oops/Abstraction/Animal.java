package CoreJavaBasic.oops.Abstraction;

public abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }


    abstract void eat();
    abstract void sound();
    abstract void sleep();
}
