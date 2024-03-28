


/* LinkedList1Demo
 * Lucas Carpenter
 * Computer Programming II
 * 3/25/2024
 * GENERAL DESCRIPTION: 
 */


// IMPORT(s)
// Java's Scanner
import java.util.Scanner;

/* CLASS DESCRIPTION(LinkedList1Demo):
 * 
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
            // There is no case 5 however, when the program ends a message "Goodbye!" is displayed
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
                    myList.deleteHeadNode();                      // REMOVE head node(LinkedList1)
                    break;                                        // END    case 2

                case 3:                                           // BEGIN  case 3
                    System.out.println(myList.count());           // WRITE  count of myList items
                    break;                                        // END    case 3

                case 4:                                           // BEGIN  case 4
                    myList.printList();                           // WRITE  content of all nodes in myList
                    break;                                        // END    case 4

                default:                                          // BEGIN  default
                                                                  // DO     Nothing, no error message
                    break;                                        // END    default
            }
            System.out.println();                                 // WRITE  blank space
        }
        System.out.println("Goodbye!");                         // When 5 is given from user, print goodbye.
        read.close();
    }
}
