package ie.atu.car_manager;

import java.util.Scanner;

public class Main {
    private static int vehicles;
    
        public static void main(String[] args) {
            // Creating a garage to store vehicles
            Garage myGarage = new Garage(5);  // Can hold up to 5 vehicles
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
                
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
                
                switch (choice) {
                    case 1:  // Add a Car
                        System.out.print("Enter car make: ");
                        String make = scanner.nextLine();
                        System.out.print("Enter car model: ");
                        String model = scanner.nextLine();
                        System.out.print("Enter car year: ");
                        int year = scanner.nextInt();
                        System.out.print("Is the car electric? (true/false): ");
                        boolean isElectric = scanner.nextBoolean();
                        
                        Car newCar = new Car(make, model, year, isElectric);
                        myGarage.addVehicle(newCar);
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
    
            Garage garage = new Garage(vehicles);
        Vehicle foundVehicle = garage.findVehicleByModel("Toyota Corolla");
        
        if (foundVehicle != null) {
            System.out.println("Found vehicle: " + foundVehicle.getModel());
        } else {
            System.out.println("Vehicle not found.");
        }
        
        scanner.close();
        System.out.println("Exiting system. Goodbye!");
    }
}