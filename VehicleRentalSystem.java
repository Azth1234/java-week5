// Base class: Vehicle
class Vehicle {
    String brand;
    int speed;

    // Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }

    // Method to indicate vehicle is starting
    public void start() {
        System.out.println(brand + " is starting...");
    }
}

// Subclass: Car
class Car extends Vehicle {
    int Doors;
    int seatingCapacity;

    // Constructor
    public Car(String brand, int speed, int Doors, int seatingCapacity) {
        super(brand, speed);
        this.Doors = Doors;
        this.seatingCapacity = seatingCapacity;
    }

    // Overriding displayDetails
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + Doors);
        System.out.println("Seating Capacity: " + seatingCapacity);
    }

}

// Subclass: Bike
class Bike extends Vehicle {
    boolean Gears;

    // Constructor
    public Bike(String brand, int speed, boolean hasGears) {
        super(brand, speed);
        this.Gears = Gears;
    }

    // Overriding displayDetails
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has Gears: " + (Gears ? "Yes" : "No"));
    }
}

// Subclass: Truck
class Truck extends Vehicle{
    int capacity;

    //constructor
    public Truck(String brand, int speed, int capacity){
        super(brand, speed);
        this.capacity = capacity;
    }

    public void truckdetails(){
        System.out.println("Capacity:"+capacity+" Tons");
    }

    // Overriding displayDetails
    @Override
    public void displayDetails() {
        super.displayDetails();
        truckdetails();
    }
}



// Main class to test
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 180, 4, 5);
        Bike bike1 = new Bike("Yamaha", 120, true);
        Truck truck1 = new Truck("Mahindra", 100 ,500);

        System.out.println("Car Details:");
        car1.displayDetails();
        car1.start();

        System.out.println("\nBike Details:");
        bike1.displayDetails();
        bike1.start();

        System.out.println("\nTruck Details:");
        truck1.displayDetails();
        truck1.start();
    }
}