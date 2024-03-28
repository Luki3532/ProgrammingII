/* LinkedList1Demo
 * Lucas Carpenter
 * Computer Programming II
 * 3/25/2024
 */


// IMPORT(s)
// Java's Scanner
import java.util.Scanner;

/* CLASS DESCRIPTION(LinkedList1Demo):
 *  LinkedList1Demo demonstrates a linked list. It offers options to add, remove, count, and print elements. 
 *  a user selects actions from a menu. When they choose to quit, the program says “Goodbye!”
 *  This class uses a switch and 
 * 
 *  This class uses LinkedList1 and java Scanner
 *  This class is not used by any other classes.
 */
public class LinkedList1Demo {
    public static void main(String[] args) {

        //VARIABLES
        LinkedList1 myList = new LinkedList1(); // LinkedList1 object
        Scanner read = new Scanner(System.in);  // Scanner object
        int userChoiceInt = -1;                 // user choice for operation command
        int tempUserChoiceInt;                  // int variable for case 1 in the switch
        String userChoiceString;                // also for case 1 in the switch 

        // USER INTERFACE
        // loop ends when user choice is 5, until then it loops forever
        while (userChoiceInt != 5) {

            // Give the user the operation command options, displayed in the terminal.
            System.out.print(
                "Enter 1 to add an element to the start of the list.\n" +
                "Enter 2 to remove the head of the list.\n" +
                "Enter 3 to print to the screen the number of items in the list.\n" +
                "Enter 4 to print all elements to the terminal screen.\n" +
                "Enter 5 to Quit the program.\n\n" +
                "Enter choice: "
            );

            // prompt user for a response.
            userChoiceInt = read.nextInt();

            // tell scanner to leave current line and prepare to read next line.
            read.nextLine();

            // this switch takes the response from the user and the numeric value they give is plugged into this switch.
            // Case 1, lets the user manually add an element to the start of the list.
            // Case 2, removes head of myList
            // Case 3, print # of items in linked list
            // Case 4, print all elements to terminal
            // There is a case 5 however, it only is used 1 time when the program is called to end.
            // by default the program will just prompt you again until valid switch case is relayed to the Scanner.
            switch (userChoiceInt) {
                case 1:                                           // BEGIN case 1
                    System.out.print("Enter item name: ");      // WRITE "enter item name"
                    userChoiceString = read.nextLine();           // READ response from user(String)
                    System.out.print("Enter quantity: ");       // WRITE "enter quantity"
                    tempUserChoiceInt = read.nextInt();           // READ response from user(int)
                    read.nextLine();                              // Tell scanner to go to next line and wait for input

                    // use LinkedList1 class method addToStart to generate a new head. use response's from user.
                    myList.addtoStart(userChoiceString, tempUserChoiceInt);
                    break;                                        // END    case 1

                case 2:                                           // BEGIN  case 2
                // REMOVE head node, if none exists give user error message
                if (myList.deleteHeadNode()) {                    // Check IF pointer exists
                    System.out.println("Task Completed");       // TRUE  WRITE "Task completed"  
                } else {                                          // FALSE WRITE "Task not completed"
                    System.out.println("Task incomplete, no items to delete");
                }
                    break;                                        // END    case 2

                case 3:                                           // BEGIN  case 3
                    System.out.println(myList.count());           // WRITE  count of myList items
                    break;                                        // END    case 3

                case 4:                                           // BEGIN  case 4
                    myList.printList();                           // WRITE  content of all nodes in myList
                    break;                                        // END    case 4

                case 5:                                           // BEGIN  case 5
                    System.out.println("Goodbye!");             // WRITE  "Goodbye!"
                    break;                                        // END    case 5

                default:                                          // BEGIN  default
                                                                  // DO     Nothing, no error message
                    break;                                        // END    default
            }
            System.out.println();                                 // WRITE  blank space
        }
        read.close();
    }
}
