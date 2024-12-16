package ie.atu.car_manager;

public class Vehicle {

    // Vehicle.java (Abstract Class)
public abstract class Vechiles {
    // This is an abstract method that must be implemented by subclasses
    public abstract String getModel();  // No implementation here
}

    public Vehicle(String make) {
        //TODO Auto-generated constructor stub
    }

    public String getModel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getModel'");
    }

    public void displayDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayDetails'");
    }

}
