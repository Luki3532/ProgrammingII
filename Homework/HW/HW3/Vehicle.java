
/**
 * Lucas Carpenter 
 * C201
 * 2/21/2024
 * GENNERAL DESCRIPTION: this java file follows a Vehicle object and supports attributes type 
    // of vehicle, number of wheels, year, and color. This class has comparison methods that 
    // compares attributes of instances of this object. This class has methods that construct 
    // instances of this object. This class has input/output methods, the input methods 
    // facilitate in user input from the terminal that follows prompts for the user to 
    // follow. finally, the output method that prints the object vehicles contents to the 
    // terminal.
 */
import java.util.Scanner;

public class Vehicle {

    String typeVehicle;                                     //  type of vehicle(examples: 
                                                            // Ford, Jeep, Toyota)

    int numWheels;                                          //  number of wheels present 
                                                            // on vehicle

    int year;                                               //  year vehicle was made

    String color;                                           //  color of vehicle

    public static void main(String[] args) {
        Vehicle motercycle = new Vehicle();                 // Make empty Vehicle object

        Vehicle car = new Vehicle("Jeep", 2004, 4, "grey");
                                                            // Make populated Vehicle object

        System.out.println("Input Attributes for an instance of the class Vehicle:");
        motercycle.input();                                 // prompt user to fill attributes
                                                            // of empty instance of 
                                                            // Vehicle class

        System.out.println("\nPrint Contents of, Moterized-Unicycle (Vehicle)");
                                                            // Tell user what vehicle is 
                                                            //  being printed in the terminal

        motercycle.output();                                // print output of Vehicle var

        System.out.println("\nPrint Contents of, car (Vehicle)");
                                                            // Tell user what vehicle is 
                                                            //  being printed in the terminal

        car.output();                                       // print output of other 
                                                            // Vehicle var

        if (motercycle.isBigger(car)) {                     // Check if motercycle is 
                                                            //  bigger than car output
                                                            //  accordingly
            System.out.println("The first vehicle is bigger than the second vehicle");
        } else{         
            System.out.println("the first vehicle is smaller than the second vehicle");
        }
        System.out.println();                               // PRINT EMPTY LINE
        if (motercycle.isNewer(car)) {                      // Check if motercycle is newer
                                                            //  than car, output accordingly
            System.out.println("The first vehicle is newer than the second vehicle");
        } else{
            System.out.println("the first vehicle is older than the second vehicle");
        }
    }

    public Vehicle(String typeVehicle, int year, int numWheels, String color) {
        //  DESCRIPTION: from actual parameters that parralel the attributes of class Vehicle
        //  constructor Vehicle populates the attributes of new Vehicle object

        this.typeVehicle = typeVehicle;
        this.numWheels = numWheels;
        this.year = year;
        this.color = color;
    }

    public Vehicle() {
        //  DESCRIPTION: Constructor method, Populates int attributes with, 0. 
        //  and String attributes with "" (empty string). This method essentially
        //  creates an empty Vehicle object.

        typeVehicle = "";
        numWheels = 0;
        year = 0;
        color = "";
    }

    public void input() {
        //  DESCRIPTION: prompt user to input attributes for the Object Vehicle.
        //  write user input to the class attributes. this method creates a
        //  Scanner object and closes the object at the end of the method.
        //  after this method runs all of the attributes of Vehicle are
        //  populated.

        Scanner read = new Scanner(System.in);              // Create new Scanner Object

        System.out.print("type of vehicle.......: ");            // Prompt User for Input(type)
        typeVehicle = read.nextLine();                      // vehicleType = user input

        System.out.print("number of wheels......: ");           // Prompt User for Input(wheels)
        numWheels = read.nextInt();                         // #Wheels = user input

        System.out.print("year vehicle was made.: ");      // Prompt User for Input(year)
        year = read.nextInt();                              // year = user input
        read.nextLine();                                    // Prepare Scanner to read next line

        System.out.print("color.................: ");                      // Prompt User for Input(color)
        color = read.nextLine();                            // color = user input

        read.close();                                       // end scanner object
    }

    public void output() {
        // DESCRIPTION: printing the formatted attributes of Vehicle to the terminal,
        // this format identifies vehicle type and the first way to differenchiate
        // vehicles from one anotherm then # of wheels, year, and color are all secondary
        // attributes according to this format

        System.out.println("\tvehicle type........: " + typeVehicle + "\n\t" + // Print Vehicle Type
                "number of wheels....: " + numWheels + "\n\t" +          // Print # Wheels
                "year................:" + year + "\n\t" +                           // Print Year
                "color...............: " + color);                                  // Print Color
    }

    public boolean isBigger(Vehicle vehicleObject) {
        // DESCRIPTION: compares This object(the object this method belongs)
        // to another Vehicle object(vehicleObject) The wheels are being compared.
        // if this objects numWheels(int) is larger than the others return TRUE, 
        // else return FALSE

        if (this.numWheels > vehicleObject.numWheels) {      
                            /* 
                                if this objects(int)is 
                            larger than the numWheels(int) 
                            in vehicleObject(Vehicle) actual 
                            parameter THEN return True; else, false.
                            */
            return true;                                               // return TRUE
        }
        return false;                                                  // else return FALSE
    }

    public boolean isNewer(Vehicle vehicleObject) {
        // DESCRIPTION: compares This object(the object this method belongs)
        // to another Vehicle object(vehicleObject) The year attribute is being compared.
        // if this objects year(int) is larger than the others return TRUE, 
        // else return FALSE
        if (this.year > vehicleObject.year) {
            return true;
        }
        return false;
    }

    public String toString() {

        return "vehicle type: " + typeVehicle + "\n\t" +
                "number of wheels: " + numWheels + "\n\t" +
                "year: " + year + "\n\t" +
                "color: " + color;
    }
}