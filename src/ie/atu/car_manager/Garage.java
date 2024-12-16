package ie.atu.car_manager;

// Garage.java - Manages a collection of vehicles
public class Garage {
    private Vehicle[] vehicles;
    private int count;

    public Garage(int size) {
        vehicles = new Vehicle[size];
        count = 0;
    }

    // Add a new vehicle to the garage
    public void addVehicle(Car newCar) {
        if (count < vehicles.length) {
            vehicles[count++] = newCar;
            System.out.println("Vehicle added!");
        } else {
            System.out.println("Garage is full!");
        }
    }

    // Delete a vehicle by index
    public void deleteVehicle(int index) {
        if (index >= 0 && index < count) {
            for (int i = index; i < count - 1; i++) {
                vehicles[i] = vehicles[i + 1];
            }
            vehicles[--count] = null;
            System.out.println("Vehicle deleted!");
        } else {
            System.out.println("Invalid index!");
        }
    }

    // Show total number of cars
    public int countCars() {
        int carCount = 0;
        for (int i = 0; i < count; i++) {
            if (vehicles[i] instanceof Car) {
                carCount++;
            }
        }
        return carCount;
    }

    // A method that finds a vehicle by its model
    public Vehicle findVehicleByModel(String model) {
        for (Vehicle v : vehicles) {
            if (v.getModel().equals(model)) {  // This will work if getModel() is implemented
                return v;
            }
        }
        return null;  // If no vehicle found with that model
    }

    // Display all vehicles in the garage
    public void displayAllVehicles() {
        if (count == 0) {
            System.out.println("No vehicles in the garage.");
            return;
        }
        for (int i = 0; i < count; i++) {
            vehicles[i].displayDetails();
            System.out.println();
        }
    }
}