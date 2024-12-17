package ie.atu.car_manager;

// Car.java
public class Car extends Vehicle {
    private String make;
    private int year;
    private String fuelType;

    public Car(String model, String make, int year, String fuelType) {
        super(model); // Call to the parent constructor
        this.make = make;
        this.year = year;
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to the parent method to display model
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}


