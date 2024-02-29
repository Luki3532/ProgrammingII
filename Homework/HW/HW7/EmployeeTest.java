/**
 * Lucas Carpenter
 * 2/28/2024
 * C201
 * Assignment #7
 * GENNERAL DESCRIPTION: Employee Test serves to use methods from the Employee class.
 * This method 
 */
public class EmployeeTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("John","Ralph", -15.75);
        // first constructor ** USE NEGATIVE SALARY **

        Employee secondEmployee = new Employee("Jimmy", "Fallon");
        // second constructor

        // Print Both Objects
        System.out.println("\n"+firstEmployee+"\n"+ secondEmployee);

        // set first object salary to $1500
        System.out.println("\nChange employee 1's monthly salary to $1,500");
        firstEmployee.setMonthlySalary(1500);

        // Compute the yearly salary. DONT MAKE NEW METHODS
            // get monthly salary and multiply by 12
        System.out.println("\nYearly salary for employee 1("+firstEmployee.getFirstName()+" "+
                            firstEmployee.getLastName()+"): $"+ 
                            (firstEmployee.getMonthlySalary()*12.0));

        System.out.println("Yearly salary for employee 2("+secondEmployee.getFirstName()+" "+
                            secondEmployee.getLastName()+"): $"+ 
                            (secondEmployee.getMonthlySalary()*12.0));

                                                                    // Give employeese 1% 
        System.out.println("\nMonthly salary for employee 1("+      // raise(in monthly salary), 
                            firstEmployee.getFirstName()+" "+       // multiply 1.1 then use 
                            firstEmployee.getLastName()+") is: $"+  // mutator to set that value.
                            (firstEmployee.getMonthlySalary()));

        System.out.println("Monthly salary for employee 2("+
                            secondEmployee.getFirstName()+" "+
                            secondEmployee.getLastName()+") is: $"+ 
                            (secondEmployee.getMonthlySalary()));

        // give employee a raise, set monthly salary to 1.1 times what the current monthly salary is.
        firstEmployee.setMonthlySalary(firstEmployee.getMonthlySalary()*1.1);                                                   
        secondEmployee.setMonthlySalary(secondEmployee.getMonthlySalary()*1.1);
        
        System.out.printf
            ("\nMonthly Salary: employee 1 (%s %s) is now: $%.2f after a 10%% raise.%n", 
            firstEmployee.getFirstName(),                          // 1st (%s) first name
            firstEmployee.getLastName(),                           // 2nd (%s) second name
            firstEmployee.getMonthlySalary());                     // (%.2f)   monthly salary
                            
        System.out.printf
            ("Monthly Salary: employee 2 (%s %s) is now: $%.2f after a 10%% raise.%n", 
            secondEmployee.getFirstName(),                          // 1st (%s) first name
            secondEmployee.getLastName(),                           // 2nd (%s) second name
            secondEmployee.getMonthlySalary());                     // (%.2f)   monthly salary


        // Print Both Objects again.
        System.out.println("\n"+firstEmployee+"\n"+ secondEmployee);

    }
}
