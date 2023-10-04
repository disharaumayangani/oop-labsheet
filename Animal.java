public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Animal makes a generic sound");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
class Mammal extends Animal {

    private String furColor;

    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }
    @Override
    public void makeSound() {
        System.out.println("Mammal makes a mammal-specific sound");
    }

    // Task 5: Override the toString() method
    @Override
    public String toString() {
        return super.toString() + ", Fur Color: " + furColor;
    }
}

class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }
    @Override
    public void makeSound() {
        System.out.println("Bird makes a bird-specific sound");
    }

    // Task 5: Override the toString() method
    @Override
    public String toString() {
        return super.toString() + ", Wing Span: " + wingSpan;
    }
}

class Dog extends Mammal {
    private String breed;

    public Dog(String name, int age, String furColor, String breed) {
        super(name, age, furColor);
        this.breed = breed;
    }
    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}
class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 5);
        Mammal mammal = new Mammal("Generic Mammal", 3, "Brown");
        Bird bird = new Bird("Generic Bird", 2, 1.5);
        Dog dog = new Dog("Generic Dog", 4, "Black", "Labrador");

        animal.makeSound(); // Output: Animal makes a sound
        mammal.makeSound(); // Output: Mammal makes a sound
        bird.makeSound(); // Output: Bird makes a sound
        dog.makeSound(); // Output: Mammal makes a sound

        System.out.println(animal.toString());
        System.out.println(mammal.toString());
        System.out.println(bird.toString());
        System.out.println(dog.toString());
    }
}

