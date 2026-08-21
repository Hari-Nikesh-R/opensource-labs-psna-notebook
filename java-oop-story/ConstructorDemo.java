public class ConstructorDemo {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Tyre tyre = new Tyre();
        WindShield windShield = new WindShield();

        Car car = new Car(engine, tyre, windShield);
        car.engine.start();
    }
}

class Car {
    Car(Engine engine, Tyre tyre, WindShield windShield) {
        this.engine = engine;
        this.tyre = tyre;
        this.windShield = windShield;
    }

    Engine engine;
    Tyre tyre;
    WindShield windShield;
}

class Engine {
    // how many piston
    int piston;

    public void start() {
        System.out.println("makes sound");
    }
}

class Tyre {
    String brandName;
    int size;
    int pressureThreshold;
}

class WindShield {
    String brandName;
    int height;
    int width;
}
