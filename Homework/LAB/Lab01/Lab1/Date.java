/*
 * Lucas Carpenter
 * 2/21/2024
 * Lab #1 
 * Class C201
 * GENNERAL DESCRIPTION: Date class holds date attributes that are manipulated, noteably 
 * this class has a method that compares itself to other Date objects.
 */
import java.util.Scanner;

public class Date {
// DESCRIPTION: this class has 6 methods including a main method and a toString method and 2 
//                  constructor methods. This class's purpose is to create a Date object 
//                  that contains the date, and methods to change this date and compare the 
//                  date. This class uses Scanner from java utilities.

    // make variables(int) for day/month/year
    int day;
    int month;
    int year;

    public static void main(String[] args) {
    // DESCRIPTION : main method, creates a date object(2/21/2024) and another empty date
    //                  object that is populated by the input method,  these objects are 
    //                  printed to the terminal and then compared.
        Date date = new Date(21, 2, 2024);   // make new Date object
    
        Date newDate = new Date();                          // make a second Date object

        System.out.println("Output date: " + date);         // output date

        newDate.input();                                    // populate second date

        System.out.println("Output newDate: " + newDate);   // output second date

        System.out.println("Compare date to newDate: " + date.before(newDate));
                                                            //Compare the 2 Date objects

    }

    public Date(int day, int month, int year) {
    // DESCRIPTION: this constructor sets the attributes of this class
    //                  class attribute dd/mm/yyyy = actual parameters (day, month, year)
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {
    // DESCRIPTION: this constructor sets the attributes of this class to 0
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    public void input() {
    // DESCRIPTION: designed to prompt the user with date input then set the day, month, 
    //                  and year attributes of the Date object based on the user’s input.

        Scanner read = new Scanner(System.in);  // New Scanner object

        System.out.println
        ("enter values for the three attributes(mm[ENTER]dd[ENTER]yyyy[ENTER]): ");
                                                //Prompt the user for input
                                                //  Tell them the format it may be accepted

        this.month = read.nextInt();            // class attribute(month)   =   system.in
        this.day = read.nextInt();              // class attribute(day)     =   system.in
        this.year = read.nextInt();             // class attribute(year)    =   system.in

        if (month > 12) {                       // month must be in range [1,12]
            month = 12;
        } else if (month < 1) {
            month = 1;
        }

        if (day > 31) {                         // day must be in range [1,31]
            day = 31;
        } else if (day < 1) {
            day = 1;
        }

        System.out.println(month + "/" + day + "/" + year);
                                                // print out the new information 
                                                //  attributed to the class from the user
        
        read.close();                       
    }

    public boolean before(Date dateObject) {
    // DESCRIPTION: this method of type boolean returns if this object has the same date
    //                 as the parameter dateObject of type Date.

        if (this.year == dateObject.year) {         // compare year
            if (this.month == dateObject.month) {   // compare month
                if (this.day == dateObject.day) {   // compare day
                    return true;                    // check IF they are all 
                                                    //  equal then return true
                }
            }
        }
        return false;                               // else return false
    }

    public String toString() {
    // DESCRIPTION: this method turns the object into a string, printing out 
    //                  the attributes of the class. seperated by--> /
        return (month + "/" + day + "/" + year);
    }
}