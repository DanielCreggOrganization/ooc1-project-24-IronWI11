package ie.atu.car_manager;

public class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
    }
}
