class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with a key");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with a kick");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Car();   
        Vehicle v2 = new Bike();  

        v1.start();  
        v2.start();  
    }
}
