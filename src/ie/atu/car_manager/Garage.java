package ie.atu.car_manager;

public class Garage {
    private Vehicle[] vehicles; // Array to store vehicles
    private int count; // Number of vehicles currently in the garage

    // Constructor to initialize the garage with a given size
    public Garage(int size) {
        vehicles = new Vehicle[size]; // Initialize the array
        count = 0; // Set initial count to 0
    }

    // Method to add a vehicle to the garage
    public void addVehicle(Vehicle newVehicle) {
        if (count < vehicles.length) { // Check if there's space in the garage
            vehicles[count++] = newVehicle; // Add the new vehicle and increment count
            System.out.println("Vehicle added!");
        } else {
            System.out.println("Garage is full!"); // Print message if garage is full
        }
    }

    // Method to delete a vehicle by index
    public void deleteVehicle(int index) {
        if (index >= 0 && index < count) { // Check if the index is valid
            vehicles[index] = null; // Nullify the vehicle at the index (optional)
            // Shift the remaining vehicles to fill the gap
            for (int i = index; i < count - 1; i++) {
                vehicles[i] = vehicles[i + 1]; // Move the next vehicle up
            }
            vehicles[--count] = null; // Nullify the last vehicle position and decrement count
            System.out.println("Vehicle deleted!");
        } else {
            System.out.println("Invalid index!"); // Print message if index is invalid
        }
    }

    // Method to find a vehicle by its model
    public Vehicle findVehicleByModel(String model) {
        for (Vehicle v : vehicles) {
            if (v != null && v.getModel().equals(model)) {  // Check if v is not null and model matches
                return v; // Return the found vehicle
            }
        }
        return null;  // Return null if no vehicle is found with the given model
    }

    // Method to display all vehicles in the garage
    public void displayAllVehicles() {
        if (count == 0) {
            System.out.println("No vehicles in the garage."); // Print message if empty
            return;
        }
        for (int i = 0; i < count; i++) {
            vehicles[i].displayDetails(); // Call displayDetails method for each vehicle
            System.out.println(); // Print a newline for better readability
        }
    }

    // Method to show the total number of cars
    public int countCars() {
        int carCount = 0; // Initialize carCount
        for (int i = 0; i < count; i++) {
            if (vehicles[i] instanceof Car) { // Check if the vehicle is an instance of Car
                carCount++; // Increment carCount
            }
        }
        return carCount; // Return the total count of cars
    }
}


