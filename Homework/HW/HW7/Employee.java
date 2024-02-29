/**
 * Lucas Carpenter
 * 2/28/2024
 * C201
 * Assignment #7
 * GENNERAL DESCRIPTION: This class follows a Employee with first, last names,
 * and monthly salary. This class hosts getters, setters, and a toString method.
 * this class has 2 constructors: the first sets all three attributes and the
 * other prompts. 
 */
import java.util.Scanner;

public class Employee {
    
    //Attributes:
    // First, Last name strings
    // yearly Salary double 
    private String firstName;    
    private String lastName;
    private double monthlySalary;
    private Scanner read = new Scanner(System.in);

//Constructors:
//  IF MONTHLY SALARY IS <0 THEN Monthly Salary is 0 because 
//  you do not pay your job to work for them.
public Employee(String firstName, String lastName, double monthlySalary) {
    // DESCRIPTION: This is constructor 1, it takes all 3 attributes from the actual 
    //  parameters and sets the class attrubutes
    this.firstName = firstName;
    this.lastName = lastName;
    this.monthlySalary = (monthlySalary < 0) ? 0 : monthlySalary;
}
public Employee(String firstName, String lastName){
    // DESCRIPTION: This is constructor 2, it takes 2 atrributes(first and last name) 
    //  and prompts the user for a salary attribute. This constructor does this with 
    //  good use of the Scanner object
    this.firstName = firstName;
    this.lastName = lastName;
    
    //Prompt user to enter a monthly salary, must be a positive number. 
    // if negative slary then pass 0 to class attribute 
    System.out.print("Please provide employee "+
                     firstName+" "+
                     lastName+
                     " with monthly salary attribute--> ");
    
    monthlySalary = read.nextDouble();                         // read next double from user
    
    monthlySalary = (monthlySalary < 0) ? 0 : monthlySalary;   // check to see if monthly 
                                                               // salary is less than 0, 
                                                               // if it is monthly salary = 0 
                                                               // otherwise it stays the same

    read.nextLine();                                           // leave the current line,
                                                               // prepare to read again.
}

    //Getter/Accessor: these methods get object attributes and return them 
    //  as either type String or double
    //  first name, last name, and monthly salary.
    public String getFirstName() {                        
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }

    //Setter/mutator: these methods set object attributes to the given parameters
    //  first name, last name, and monthly salary.
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }
    public void setMonthlySalary(double newMonthlySalary) {
        monthlySalary = newMonthlySalary;
    }

    // to String mehtod This method returns a String that formats this objects atrributes 
    // for a comprehensive review of the object to be read.
    public String toString() {
        return "Employee: "+                                     // Print employee name.
            firstName +" "+ 
            lastName+ ", has a monthly salary of: $"+ 
            monthlySalary;                                       // print monthly salary.
    }
}
