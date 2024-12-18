package ie.atu.car_manager;

// Car.java
public class Car extends Vehicle {
    private String make;
    private int year;
    private String fuelType;
    private static boolean isAvailable; // boolean variable

    public Car(String model, String make, int year, String fuelType) {
        super(model); // Call to the parent constructor
        this.make = make;
        this.year = year;
        this.fuelType = fuelType;
        Car.isAvailable = true; // default to available
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to the parent method to display model
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Available" + (isAvailable ? " Yes " : " No "));
    }

    // method to check availability
    public static boolean isAvailable() {
        return isAvailable;
    }

    // method to toggle availability
    public void setAvailability(boolean availability) {
        Car.isAvailable = availability;
    }
}
