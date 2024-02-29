/**
 * Lucas Carpenter
 * 2/28/2024
 * C201
 * Assignment #7
 * GENNERAL DESCRIPTION:
 */
import java.util.Scanner;

public class Employee {
    
    //Attributes
        /*
         * First, Last name strings
         * yearly Salary double
         */
    private String firstName;
    private String lastName;
    private double monthlySalary;
    private Scanner read = new Scanner(System.in);

    //Constructor
public Employee(String firstName, String lastName, double monthlySalary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.monthlySalary = (monthlySalary < 0) ? 0 : monthlySalary;
}
public Employee(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
    
    //Prompt user to enter a monthly salary, must be a positive number. if negative slary then pass 0 to class attribute 
    System.out.print("Please provide employee "+firstName+" "+lastName+" with monthly salary attribute--> ");
    monthlySalary = read.nextDouble();
    monthlySalary = (monthlySalary < 0) ? 0 : monthlySalary;

    read.nextLine();
}

    //Getter/Accessor
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }

    //Setter/mutator
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }
    public void setMonthlySalary(double newMonthlySalary) {
        monthlySalary = newMonthlySalary;
    }

    // to String mehtod
    public String toString() {
        return "Employee: "+ firstName +" "+ lastName+", has a monthly salary of: $"+ monthlySalary;
    }
}
