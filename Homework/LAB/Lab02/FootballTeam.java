
/**
 * FootballTeam
 * Homework 3 & Lab1
 * Lucas Carpenter 
 * C201
 * 2/1/2024
 * This Program Mimics a Footballs teams Characteristics, used in both Lab#1 and Homework #3. 
 * This program Has Setters and Getters including comparators. 
 * File Readers and Writers aid in attribute exporting and importing
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FootballTeam implements Comparable<FootballTeam> {
    // This Class Manipulated and Attributes a Football team The main
    // characteristics being: name,location and number of wins
    String name, location;
    int numberWins = 0;

    public FootballTeam() {
        // prime constructor for Football Team
        name = "";
        location = "";
    }

    public FootballTeam(String teamName, String location, int numberWins) {
        // this method is a overloaded constructor that sets (team name, location,
        // numberWins)
        this.name = teamName;
        this.location = location;
        this.numberWins = numberWins;
    }

    @Override
    public int compareTo(FootballTeam other) {
        // this method uses The comparable implementation to compare football teams by
        // the number of wins
        // + number then this class has more wins than oter class
        // - number then this class has less wins than other class
        // 0 classes have equal number of wins
        return (numberWins - other.numberWins);
    }

    public void addWins(int numberWins) {
        // this method adds given int values to the numberWins member of this class
        this.numberWins = this.numberWins + numberWins;
    }

    public void read(String fileName) {
        File file = new File(fileName);
        try (Scanner scan = new Scanner(file)) {
            name = scan.nextLine();
            location = scan.nextLine();
            numberWins = scan.nextInt(); // Add this line to read number of wins
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void read(Scanner scanner) {
        //this method uses scanner(Scanner) for premade objects to import data from txt files
        this.name = scanner.nextLine();
        this.location = scanner.nextLine();
        this.numberWins = Integer.parseInt(scanner.nextLine());
    }

    public void write(String fileName) {
        // this method writes the name, location, and number of wins on seperate lines
        // of a given file
        try (FileWriter file = new FileWriter(fileName)) {
            file.write(name + "\n" + location + "\n" + numberWins);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void write(FileWriter fileWriter) {
        // instead a making a new file writer this method uses a given fileWriter to
        // write this classes members on the txt file
        try {
            fileWriter.write(name + "\n" + location + "\n" + numberWins);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        // print out the team name, location, and number of wins when a instance of a
        // class is printed
        return ("Team Name: " + this.name + "\nTeam Location: " + this.location + "\nNumber Wins: " + numberWins);
    }
}