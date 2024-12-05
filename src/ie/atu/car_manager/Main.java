package ie.atu.car_manager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Car CarObject1 = new Car(2, "BMW", 20000, false);
        //System.out.println(CarObject1.getVinNumber());
        //System.out.println(CarObject1.getModel());
        //System.out.println(CarObject1.getPriceEur());
        //System.out.println(CarObject1.getIsSold());


        //Menue of the App


        //
        Scanner userInput = new Scanner(System.in);
        int userSelection = 0; // Used to store value


        while (true) {

            //Display menu to console

            System.out.println(""                               );
            System.out.println("###############################");
            System.out.println("#### Car Application v0.01 ####");
            System.out.println("(1)  Add a car"                 );
            System.out.println("(2)  Delete a car"              );
            System.out.println("(3)  Show total numbers of cars");
            System.out.println("(4)  Search for a car"          );
            System.out.println("(5)  Quit"                      );
            System.out.println("Select 1 to 5 and press enter"  );
            System.out.println("###############################");
            System.out.println(""                               );



            //Store user menu option selection 

            userSelection = userInput.nextInt();

            if(userSelection == 5){ // Quit
               System.out.println("Car Application closing GoodBye!");
               //close the user input
               userInput.close();

                break; //break out of the loop.
            }


            // Main Class to test the project
class InventoryManagement {
    private static Product[] productArray = new Product[10]; // Array to store products
    private static int productCount = 0; // Count of products added



            
        }
    }



    }
}
