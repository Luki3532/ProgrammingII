/*
 * Lucas Carpenter
 * C201
 * 01/17/2024
 * Genneral Description: This program uses a 2d array that the user must fill. 
 *  Then the program will add together the rows individually, 
 *  then the columns and display them accordingly.
 */
import java.util.*;

class twoDArrays {
    //DESCRIPTION: This class has 2 methods that manipulate the 2D Array after the User fills it. 
    //                 The main method itterates through a 2D array and displays information and prompts to the user

    // TEMP VARIABLES FOR PRIVATE METHODS
    private static int Temp = 0;                    // temporary variable for sum of array method -initiated
    private static int[] TempArray = new int[4];    // temporary array for column array gennerator method -initiated

    public static void main(String[] args) {
        int[][] Array = new int[4][3];              // 2D Array -initiated
                                                    // Row(4) X Column(3)

        Scanner Read = new Scanner(System.in);      // Instance of Scanner class for Array population by user -initiated


        // Itterate through Array while prompting user to fill each element of the 2d array
        for (int i = 0; i < 4; i++) {               //itterate through all 4 rows
            for (int j = 0; j < 3; j++) {           //itterate through each element
                
                System.out.print("Enter a value for row " + (1+i) + " column " + (j+1) + " "); 
                                                    //Prompt user for input and specify the row and column

                Array[i][j] = Read.nextInt();       //Scan for input in terminal
            }

        }

        System.out.println();                       //Add empty line

        //PRINT 2D ARRAY (3x4)
        for (int[] row : Array) {
            for (int value : row) {
                System.out.printf("%4d", value);
                                                    //Print appropriate element to satisfy the 3x4 display of element
            }
            System.out.println();                   //Add empty line
        }

        //PRINT SUMMATION OF ROWS & COLUMNS
        System.out.println("\nThe sum of Row 1 is: " +  twoDArrays.sumOfElements(Array[0]));
        System.out.println("The sum of Row 2 is: " +    twoDArrays.sumOfElements(Array[1]));
        System.out.println("The sum of Row 3 is: " +    twoDArrays.sumOfElements(Array[2]));
        System.out.println("The sum of Row 4 is: " +    twoDArrays.sumOfElements(Array[3]));
                                                    //Use TwoDArray class --> SumOfElements Method
                                                    //  for the respective print statements.(sum of row 1, 2, 3, 4)

        System.out.println("\nThe sum of elements in col 1 is: "+twoDArrays.sumOfElements(getColumnArray(Array, 1)) );
        System.out.println("The sum of elements in col 2 is: "+  twoDArrays.sumOfElements(getColumnArray(Array, 2)) );
        System.out.println("The sum of elements in col 3 is: "+  twoDArrays.sumOfElements(getColumnArray(Array, 3)) );
                                                    //From TwoDArray class use --> GetColumArray to build a new 1D array 
                                                    //  to find the sum of elements(TwoDArray Private Method) 
                                                    //  for the respective columns.(1,2,3)
    }

    private static int sumOfElements(int[] Array) {
        //DESCRIPTION: add up all elements from actual array parameter 'int[] Array' then returns result.
        Temp = 0;                                   //static variable is set to 0

        for (int i = 0; i < Array.length; i++) {    //Parse through all elements of 1D Array
            Temp += Array[i];                       //Element in array is added to Result
        }
        return Temp;                                //Result is Returned
    }
    private static int[] getColumnArray(int[][] Array, int ColumnRequested){
        //DESCRIPTION: From 2D Array GET the Requested Column and return 1D Array of column
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == ColumnRequested-1) {       //If the itterated column matches the Actual parameter 'ColumnRequested' 
                                                    
                    TempArray[i] = Array[i][j];     //  then Append 'TempArray' with the Respective Element 
                                                    //      -from the Actual 2D int parameter'Array'.    
                }
            }
        }
        return TempArray;                           // Return New                      


    }
}