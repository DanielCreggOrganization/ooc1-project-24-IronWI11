[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17263098)
# OOC1 Project

**Title:** Car Application Manager  
**Name:** Ricardas Lingaitis 
**Student ID:** G00414808  

## Application Function

1. Add a Car
Functionality:### Overview
The Car Management System is designed to provide an intuitive interface for users to manage vehicles in a garage Allows users to add a new car to the garage.

Process. The application allows users to perform various operations, including adding cars, deleting them,:
The user is prompted to enter the car's make, model, year, and fuel type.
The system validates searching for specific cars, displaying all cars, and the inputs, ensuring that the year is a valid integer and the fuel type matches tracking the total number of cars in the garage.
Main Features
Add a Car:
Users one of the accepted options (Petrol, Diesel, Electric).
If the input is valid and there is space in can input details about a new car, including its make, model, the garage, a new year, and fuel type.
The system validates the input and adds the car to the garage if there is available space. Car object is created and added to the Garage.
A success message is displayed, confirming that the car - A confirmation message is displayed upon successful addition.
** has been added.
2. Delete a Car
-Delete a Car**:

Users can delete Functionality: Enables users to remove a car from the a car by specifying its index in the garage.
The system garage by specifying its index.
Process checks if the index is valid and removes:
The user is prompted to the car if found.
A confirmation message is shown, or enter the index of the car they wish to delete.
The system validates the index to ensure it an error message is displayed if the index is invalid.
Show Total Number of Cars: is within the valid range (0 to count-1).
If valid, the car at - Users can request the total number of cars currently stored in the garage the specified index is removed from the garage, and the remaining cars are shifted to.
The application calculates and displays the count of cars, helping users fill the gap.
A confirmation message is displayed upon keep track of garage capacity.
Search for a Car:
Users can search for a car by entering successful deletion. If the index is invalid, an error message is its model name.
The system scans through the stored vehicles shown.
3. Show Total Number of Cars
Functionality: Displays the total count of cars currently stored in and returns the matching car details if found.
If no match is the garage.
Process:
found, a message is displayed to inform the user.
The system calculates the number of Car instances in the5. Show All Vehicles:

Users garage by iterating through the vehicle array and counting instances of can view details of all vehicles in the garage, including each Car.
The total count is printed to the console.
car’s make, model, year, fuel type, and availability.
Search for a Car
Functionality: - If no cars are present in the garage, a message is displayed Allows users to find a car by its model.
Process: indicating that the garage is empty.
Exit:
Users - The user is prompted to enter the model of the car they wish to can exit the application gracefully, ensuring that any necessary cleanup (like closing the scanner) is performed.
User Interaction Workflow
**Start the Application search for.
The system searches through the garage for a vehicle that matches the specified model.
If found, the details of the car are displayed using the displayDetails() method. **:
When the application is launched, the main menu is displayed with options for the user to choose from.
2 - If no matching car is found, an appropriate message is displayed.

###. Select an Option:

Users enter their choice (1- 5. Show All Vehicles
Functionality: Lists all6) to perform the desired operation.
Input validation is implemented vehicles currently stored in the garage.
Process:
The to ensure the user selects a valid option.
Perform Operations:
Based on the user’s selection, the corresponding functionality is executed system checks if there are any vehicles in the garage.
If there are, it iterates through the vehicle array and calls the displayDetails() method:
For adding a car, the user is prompted for details. for each vehicle to print their details.
If the garage is empty - For deleting a car, the user is prompted for the index.
For searching, the user inputs the model name, a message indicating that no vehicles are present is displayed.
6. Exit
Functionality.
For displaying cars, all vehicle details are shown.
View Results: -: Closes the application.
Process:
The user selects the exit option from the menu. After each operation, results or confirmation messages are displayed to the user.
The system gracefully closes any open resources (e.g., the scanner - The menu is presented again for the user to select another action.
Exit the Application:
When the user) and displays a goodbye message before terminating the program.
User Interaction Flow selects
Menu Display: The main menu is displayed to the the exit option, the application terminates, and a goodbye message is displayed.

## Running the Application

Provide step by step instructions on how to run your applicaiton. Are there any prerequisite softwares required?

```list
List the instructions step by step
    1. Go to the Main class and press execute
    2. Do something else
            :
            :
```

## Minimum Project Requirements

Describe how you have met all minimum project requirements below:

* The repository contains, at minimum, two commits per week (Note: There should be many commits per day coding).
The comits where straight forward writing the code untill its functionall and commit the code explaining what i did. 
* The project, including code and documentation, is fully contained in the provided GitHub Classroom repository.
* Methods = Add Item, Remove Item, Update Item, Find total items, Search Items and Quit.
these methods where straight forward for the comands took a while to code them in correctly
* The code MUST compile.
code is compiling. 
* The application code must be formatted in a consistent and standard way.
code is formated
* The code must contain comments. One comment per class, method and variable at minimum.
the code contains comments explaining what each of the loop does. 
* The documentation and commentary must be free of a grammar and speling mistakes.

## Project Requirements above and beyond

Discuss any application features or design elements that show you went above and beyond basic requirements.

## Application Architecture

The Car Management System is structured in a modular way, with separate classes representing different components of the system. This approach adheres to the principles of object-oriented programming, making the codebase more organized, maintainable, and scalable.

Class Overview
Vehicle Class
Car Class
Garage Class
Main Class
1. Vehicle Class
Purpose
The Vehicle class serves as a base class representing a generic vehicle. It provides common properties and methods applicable to all types of vehicles.

Attributes
private String model: This attribute stores the model of the vehicle.
Methods
Constructor:


public Vehicle(String model)
Initializes the vehicle with a specified model.
getModel():


public String getModel()
Returns the model of the vehicle.
displayDetails():


public void displayDetails()
Displays the vehicle's model to the console.
2. Car Class
Purpose
The Car class extends the Vehicle class, adding specific properties and behaviors relevant to cars. This class encapsulates data and methods specific to car management.

Attributes
private String make: The make of the car (e.g., Toyota, Ford).
private int year: The year the car was manufactured.
private String fuelType: The type of fuel used by the car (e.g., Petrol, Diesel, Electric).
private boolean isAvailable: Indicates whether the car is currently available for use.
Methods
Constructor:


public Car(String model, String make, int year, String fuelType)
Initializes the car with its model, make, year, and fuel type.
isAvailable():


public boolean isAvailable()
Returns the availability status of the car.
setAvailability(boolean availability):


public void setAvailability(boolean availability)
Sets the availability status of the car.
displayDetails():


@Override
public void displayDetails()
Overrides the displayDetails() method from Vehicle to display additional information regarding the car, including make, year, fuel type, and availability.
3. Garage Class
Purpose
The Garage class manages a collection of Vehicle objects (specifically Car objects in this case). It provides methods to add, remove, search, and display vehicles stored in the garage.

Attributes
private Vehicle[] vehicles: An array that holds the vehicles currently stored in the garage.
private int count: The current number of vehicles in the garage.
Methods
Constructor:


public Garage(int size)
Initializes the garage with a specified size, creating an array to hold the vehicles.
addVehicle(Car newCar):


public void addVehicle(Car newCar)
Adds a new car to the garage if there is space available. If successful, it increments the count of vehicles.
deleteVehicle(int index):


public void deleteVehicle(int index)
Deletes a vehicle from the garage based on the specified index. It also shifts remaining vehicles to fill the gap.
findVehicleByModel(String model):


public Vehicle findVehicleByModel(String model)
Searches for a vehicle by its model name. Returns the found vehicle or null if not found.
displayAllVehicles():


public void displayAllVehicles()
Displays the details of all vehicles currently stored in the garage.
countCars():


public int countCars()
Returns the total number of Car instances in the garage.
4. Main Class
Purpose
The Main class serves as the entry point of the application. It contains the main method and handles user interactions through a console-based menu.

Methods
main(String[] args):

public static void main(String[] args)
The main method that starts the application. It provides a menu for the user to choose different operations (add, delete, search, etc.) and handles user input and program flow.
Summary
The Car Management System is structured around four main classes, each with its specific purpose:

Vehicle: Base class for all vehicles, providing common attributes and methods.
Car: Subclass of Vehicle, adding car-specific attributes and behaviors.
Garage: Manages a collection of vehicles, providing functionality for adding, deleting, and searching vehicles.
Main: The entry point of the application, managing user interactions and program flow.
This modular structure ensures clean separation of concerns, making the codebase easier to maintain and enhance, and promoting reusability of code. Each class encapsulates its related data and methods, adhering to the principles of object-oriented programming.

## Roadblocks and Unfinished Functionality

i didnt not finish/start couple of the methods on my list following car prices, engine size for the vechiles, slots where the cars are located. 

## Resources

Provide links to resources used:

* [Tutorialspoint](https://www.tutorialspoint.com/java/) - Java Tutorials site I found helpful


## documenteation of the project

Certainly! Here’s a comprehensive documentation outline for your car management project. The documentation will include an overview of the project, usage instructions, class descriptions, method details, and any other relevant information.

# Car Management System Documentation

## Project Overview

The Car Management System is a Java application designed to manage a collection of vehicles within a garage. Users can add, delete, search for vehicles, and display information about the vehicles stored in the garage. The system supports operations specific to `Car` objects, allowing users to manage their properties such as make, model, year, fuel type, and availability.

## Table of Contents

1. [Requirements](#requirements)
2. [Installation](#installation)
3. [Usage](#usage)
4. [Class Descriptions](#class-descriptions)
   - [1. Vehicle Class](#vehicle-class)
   - [2. Car Class](#car-class)
   - [3. Garage Class](#garage-class)
   - [4. Main Class](#main-class)
5. [Method Details](#method-details)
   - [1. Vehicle Class Methods](#vehicle-class-methods)
   - [2. Car Class Methods](#car-class-methods)
   - [3. Garage Class Methods](#garage-class-methods)
   - [4. Main Class Methods](#main-class-methods)
6. [Contributing](#contributing)
7. [License](#license)

## Requirements

- Java Development Kit (JDK) 8 or higher
- An Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or any text editor of your choice

## Installation

1. Clone the repository or download the project files.
2. Open the project in your preferred IDE.
3. Ensure that the JDK is correctly set up in your IDE.
4. Compile and run the `Main` class to start the application.

## Usage

1. When the application starts, a menu will be displayed with options to manage cars in the garage.
2. You can choose from the following options:
   - **1. Add a Car**: Input details to create a new car.
   - **2. Delete a Car**: Provide the index of the car to remove it from the garage.
   - **3. Show Total Number of Cars**: Display the count of cars in the garage.
   - **4. Search for a Car**: Find a car by its model.
   - **5. Show All Vehicles**: Display details of all vehicles in the garage.
   - **6. Exit**: Close the application.

## Class Descriptions

### Vehicle Class
- **Description**: Represents a generic vehicle with basic properties.
- **Fields**:
  - `String model`: The model of the vehicle.
  
### Car Class
- **Description**: Extends the `Vehicle` class, adding specific properties for cars.
- **Fields**:
  - `String make`: The make of the car.
  - `int year`: The year of manufacture.
  - `String fuelType`: The type of fuel used (e.g., Petrol, Diesel, Electric).
  - `boolean isAvailable`: Indicates if the car is available for use.

### Garage Class
- **Description**: Manages a collection of vehicles in an array.
- **Fields**:
  - `Vehicle[] vehicles`: An array to store vehicle objects.
  - `int count`: The current number of vehicles in the garage.

### Main Class
- **Description**: The entry point of the application. Provides the user interface for interacting with the garage.
- **Methods**:
  - `public static void main(String[] args)`: Starts the application and manages user input.

## Method Details

### Vehicle Class Methods
- **Constructor**: `public Vehicle(String model)`
  - Initializes the vehicle with a model.

- **getModel()**: `public String getModel()`
  - Returns the model of the vehicle.

- **displayDetails()**: `public void displayDetails()`
  - Displays the model of the vehicle.

### Car Class Methods
- **Constructor**: `public Car(String model, String make, int year, String fuelType)`
  - Initializes the car with model, make, year, and fuel type.

- **isAvailable()**: `public boolean isAvailable()`
  - Returns the availability status of the car.

- **setAvailability(boolean availability)**: `public void setAvailability(boolean availability)`
  - Sets the availability status of the car.

- **displayDetails()**: `public void displayDetails()`
  - Displays the details of the car including make, model, year, fuel type, and availability.

### Garage Class Methods
- **Constructor**: `public Garage(int size)`
  - Initializes the garage with a specific size.

- **addVehicle(Car newCar)**: `public void addVehicle(Car newCar)`
  - Adds a new car to the garage.

- **deleteVehicle(int index)**: `public void deleteVehicle(int index)`
  - Deletes a vehicle from the garage by index.

- **findVehicleByModel(String model)**: `public Vehicle findVehicleByModel(String model)`
  - Searches for a vehicle by its model and returns it.

- **displayAllVehicles()**: `public void displayAllVehicles()`
  - Displays details of all vehicles in the garage.

- **countCars()**: `public int countCars()`
  - Returns the total number of cars in the garage.

### Main Class Methods
- **main(String[] args)**: `public static void main(String[] args)`
  - The main method that starts the application and handles user interactions.

## Contributing

Contributions are welcome! If you would like to contribute to this project, please fork the repository and create a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.

---


This documentation should provide a clear understanding of your Car Management System project, including its structure and usage. You can expand or modify sections as needed to fit your project’s requirements or add more detailed examples for specific methods.

  #### Sample Textbox Input
  <pre>
  <b>Screencast Link:</b>https://atlantictu-my.sharepoint.com/personal/g00414808_atu_ie/_layouts/15/stream.aspx?id=%2Fpersonal%2Fg00414808_atu_ie%2FDocuments%2FRecording-20241218_192918%2Ewebm&nav=%7B"defaultNavPanel"%3A%7B"pluginName"%3A"MediaSettingsLayer"%7D%7D&referrer=StreamWebApp%2EWeb&referrerScenario=AddressBarCopied%2Eview%2Ed5e01f90-5790-4659-afc8-4c8dcdebbec6
  <b>GitHub Link:</b> https://expert-barnacle-6qqr9vj5xxvcx5x5.github.dev  
  </pre>