
/**
 * Lucas Carpenter 
 * C201
 * 2/21/2024
 * GENNERAL DESCRIPTION:
 */
import java.util.Scanner;

public class Vehicle {
    //  DESCRIPTION: 


    String typeOfVehicle;

    int numberOfWheels;

    int year;

    String color;

    public Vehicle(String typeOfVehicle, int year, int numberOfWheels, String color) {
        //  DESCRIPTION: from actual parameters that parralel the attributes of class Vehicle
        //  constructor Vehicle populates the attributes of new Vehicle object

        this.typeOfVehicle = typeOfVehicle;
        this.numberOfWheels = numberOfWheels;
        this.year = year;
        this.color = color;
    }

    public Vehicle() {
        //  DESCRIPTION: 

        typeOfVehicle = "";
        numberOfWheels = 0;
        year = 0;
        color = "";
    }

    public void input() {
        //  DESCRIPTION: prompt user to input attributes for the Object Vehicle.
        //  

        Scanner read = new Scanner(System.in);

        System.out.print("type of vehicle: ");
        typeOfVehicle = read.nextLine();

        System.out.print("number of wheels: ");
        numberOfWheels = read.nextInt();

        System.out.print("year vehicle was made: ");
        year = read.nextInt();

        System.out.print("color: ");
        color = read.nextLine();

        read.close();
    }

    public void output() {
        // DESCRIPTION: printing the formatted attributes of Vehicle to the terminal,
        // this format identifies vehicle type and the first way to differenchiate
        // vehicles from one anotherm then # of wheels, year, and color are all secondary
        // attributes according to this format

        System.out.println("vehicle type: " + typeOfVehicle + "\n\t" + // Print Vehicle Type
                "number of wheels: " + numberOfWheels + "\n\t" +       // Print # Wheels
                "year: " + year + "\n\t" +                             // Print Year
                "color: " + color);                                    // Print Color
    }

    public boolean isBigger(Vehicle vehicleObject) {
        // DESCRIPTION: compares This object(the object this method belongs)
        // to another Vehicle object(vehicleObject) The wheels are being compared.
        // if this objects numberOfWheels(int) is larger than the others return TRUE, 
        // else return FALSE

        if (this.numberOfWheels > vehicleObject.numberOfWheels) {      
                            /* 
                                if this objects(int)is 
                            larger than thenumberOfWheels(int) 
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

        return "vehicle type: " + typeOfVehicle + "\n\t" +
                "number of wheels: " + numberOfWheels + "\n\t" +
                "year: " + year + "\n\t" +
                "color: " + color;
    }
}