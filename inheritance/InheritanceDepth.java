class LivingBeing {}
class Animal extends LivingBeing {}
class Mammal extends Animal {}
class Dog extends Mammal {}


class SimpleAnimal {
    void makeSound() { System.out.println("Animal sound"); }
}

class Cat extends SimpleAnimal {
    @Override
    void makeSound() { System.out.println("Meow"); }
}

public class InheritanceDepth {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}
