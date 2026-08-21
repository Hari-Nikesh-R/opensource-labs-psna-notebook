public class Polymorphism {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        // animal.makeSound();

        Dog animal = new Dog();
        // Method overiding
        animal.makeSound();

        // Cat cat = new Cat();
        // cat.makeSound();

        // Lion lion = new Lion();
        // lion.makeSound();
    }
}

class Animal {
    void makeSound(String name) {
        System.out.println("Animal sound " + name);
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }

    void makeSound(String name) {
        System.out.println(name + "Bark");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

class Lion extends Animal {
    void makeSound() {
        System.out.println("Roar");
    }
}