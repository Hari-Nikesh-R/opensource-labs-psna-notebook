public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.engine.fuelType = FuelType.PETROL;
        bmw.tyre.brandName = "Goodyear";
        bmw.tyre.size = 15;
        bmw.tyre.pressureThreshold = 30;
        bmw.windShield.brandName = "Bosch";
        bmw.windShield.height = 10;
        bmw.windShield.width = 20;
    }
}

// 'is a' relationship
class Animal extends Dog {
    String name;
    String sound;
}

class Dog {
    String sound = "Bark";
}

class Cat {
    String sound = "Meow";
}

// 'has a' relationship
enum FuelType {
    PETROL, DIESEL, ELECTRIC, GAS
}

class Engine {
    FuelType fuelType;
}

class Tyre {
    String brandName;
    String mark;
    int size;
    int pressureThreshold;
}

class WindShield {
    String brandName;
    int height;
    int width;
}

// is a relationship
class BMW extends Car {

}

class Car {
    Engine engine;
    Tyre tyre;
    WindShield windShield;
}
