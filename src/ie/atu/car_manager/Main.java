package ie.atu.car_manager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // Creating a garage to store vehicles
        Garage myGarage = new Garage(10);  // Can hold up to 10 vehicles
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Display menu
            System.out.println("\nCar Management System");
            System.out.println("1. Add a Car");
            System.out.println("2. Delete a Car");
            System.out.println("3. Show Total Number of Cars");
            System.out.println("4. Search for a Car");
            System.out.println("5. Show All Vehicles");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = -1; // Initialize choice
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                scanner.nextLine(); // Clear the invalid input
                continue; // Skip the rest of the loop and prompt for input again
            }

            switch (choice) {
                case 1:  // Add a Car
                    System.out.print("Enter car make: ");
                    String make = scanner.nextLine();
                    System.out.print("Enter car model: ");
                    String model = scanner.nextLine();
                    
                    // Input for year
                    int year = -1; // Initialize year
                    while (true) {
                        System.out.print("Enter car year: ");
                        try {
                            year = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline
                            break; // Exit loop if input is valid
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid year.");
                            scanner.nextLine(); // Clear the invalid input
                        }
                    }

                    // Input for fuel type
                    String fuelType = "";
                    while (true) {
                        System.out.print("Enter fuel type (Petrol/Diesel/Electric): ");
                        fuelType = scanner.nextLine().trim(); // Get user input and trim whitespace
                        
                        if (fuelType.equalsIgnoreCase("Petrol") || fuelType.equalsIgnoreCase("Diesel") || fuelType.equalsIgnoreCase("Electric")) {
                            break; // Exit loop if valid fuel type is entered
                        } else {
                            System.out.println("Invalid fuel type. Please enter either 'Petrol', 'Diesel', or 'Electric'.");
                        }
                    }

                    // Create a new car instance with the fuel type
                    Car newCar = new Car(model, make, year, fuelType);
                    myGarage.addVehicle(newCar);
                    System.out.println("Car added successfully!");
                    break;

                case 2:  // Delete a Car
                    System.out.print("Enter the index of the car to delete: ");
                    int index = scanner.nextInt();
                    myGarage.deleteVehicle(index);
                    break;
                    
                case 3:  // Show Total Number of Cars
                    System.out.println("Total number of cars: " + myGarage.countCars());
                    break;
                    
                case 4:  // Search for a Car
                    System.out.print("Enter the car model to search: ");
                    String searchModel = scanner.nextLine();
                    Vehicle foundCar = myGarage.findVehicleByModel(searchModel);
                    if (foundCar != null) {
                        foundCar.displayDetails();
                    } else {
                        System.out.println("Car not found.");
                    }
                    break;
                    
                case 5:  // Show All Vehicles
                    myGarage.displayAllVehicles();
                    break;
                    
                case 6:  // Exit
                    running = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        
        // Display all vehicles in the garage
        System.out.println("Vehicles in garage:");
        myGarage.displayAllVehicles();

        // Searching for a car
        System.out.print("Enter the car model to search: ");
        String searchModel = scanner.nextLine();
        Vehicle foundCar = myGarage.findVehicleByModel(searchModel);
        if (foundCar != null) {
            System.out.println("Car found:");
            foundCar.displayDetails();
        } else {
            System.out.println("Car not found.");
        }

        scanner.close();
        System.out.println("Exiting system. Goodbye!");
    }
}




