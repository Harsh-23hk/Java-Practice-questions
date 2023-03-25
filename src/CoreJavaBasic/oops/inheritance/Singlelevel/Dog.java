package CoreJavaBasic.oops.inheritance.Singlelevel;

public class Dog extends Animal {

    String breed;

    public Dog(String category, String breed) {
        super(category);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", Category='" + Category + '\'' +
                '}';
    }
}
