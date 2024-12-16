package ie.atu.car_manager;

// Car.java
public class Car extends Vehicle {
    private String make;

    // Constructor with parameters
    public Car(String model, String make, int year, boolean isElectric) {
        super(model); // Calling the constructor of Vehicle with the model
        this.make = make;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + getModel());
        System.out.println("Car Make: " + make);
    }
}
