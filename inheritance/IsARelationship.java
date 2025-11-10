class Animal {
    void makeSound() { System.out.println("Some sound..."); }
}

class Dog extends Animal {
    @Override
    void makeSound() { System.out.println("Bark!"); }
}

public class IsARelationship {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Valid: Dog is an Animal
        animal.makeSound();
    }
}
