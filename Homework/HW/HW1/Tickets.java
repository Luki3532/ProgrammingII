
/**
 * Tickets
 */

import java.util.*;

public class Tickets {

    public static void main(String[] args) {
        int NumberOfTickets = 6;
        String[] TicketHolders = new String[NumberOfTickets];
        Scanner Read = new Scanner(System.in);
        int tempInt;
        String tempString;
        int i = 0;

        while (i <= NumberOfTickets - 1) {
            tempInt = 0;
            tempString = "";

            System.out.print("Welcome to Events Unlimited! ");

            switch (i) {
                case (5):
                    System.out.print("There is only 1 ticket available. Would you like to purchace it?[Y/N]");

                    tempString = Read.next();
                    Read.nextLine();
                    if ((tempString.equals("Y")) || (tempString.equals("y"))) {
                        tempInt++;
                    }
                    break;

                default:
                    System.out.print("You May purchase 1 or 2 tickets to the concert.\n\nHow many tickets would you like to purchace? (1 or 2) or enter 0 to exit.. ");
                    tempInt = Read.nextInt();
                    Read.nextLine();

                    break;      
            }

            if ((tempInt == 0) && (i != 5)) {
                break;
            } else if ( (tempString.equals("Y")) || (tempString.equals("y") || (tempInt != 0)   )  ) {
                System.out.print("Enter your name(last, first) ");

                tempString = Read.nextLine();
                System.out.println("\n__________________________________________________________________________________________");

                TicketHolders[i] = tempString;
                i += tempInt;
            }

        }



        System.out.println("Thank you for useing Events Unlimited!\nTicket Holders:");
        for (String string : TicketHolders) {
            if (string != null) {
                System.out.println(string);

            }

        }
        Read.close();
    }

}