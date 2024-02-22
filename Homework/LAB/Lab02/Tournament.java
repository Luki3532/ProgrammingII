
/**
 * Tournament
 * Homework 3 & Lab1
 * Lucas Carpenter 
 * C201
 * 2/1/2024
 * This Program Follows a Array of teams that it imported from teams.txt.
 * Tournament can be instansiated with null or any positive real number to define tournament size.
 * methods include read, write, and output. 
 * These use File readers and writers to import and export information from/to files and to the terminal
 */
import java.util.*;
import java.io.*;

public class Tournament {
    static Random rand = new Random();

    FootballTeam[] teams;

    public Tournament() {
    // this constructor instansiates teams as null
        this.teams = null;
    }

    public Tournament(int numberTeams) {
    // this constructor instansiates teams as a real positive number

        this.teams = new FootballTeam[numberTeams];
        for (int i = 0; i < teams.length; i++) {
        // parse through teams length and fills the array with Football teams
            this.teams[i] = new FootballTeam();
        }
    }

    public void read(String fileName) {
    // this method reads from a file, fileName, with parser(Scanner).
    // objectivly importing the data from the file into the array for each individual object
        File file = new File(fileName);
        Scanner parser;
        try {
            parser = new Scanner(file);
            for (int i = 0; i < teams.length; i++) {
            // parse though teams array
                if (parser.hasNext()) {
                    this.teams[i].read(parser);
                // the team @ index i uses native .read class 
                // (with a file scanning object for "teams.txt")
                }
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void write(String fileName) {
    // this method exports the teams array into a new file(fileName) 
    // with native FootballTeam method .write
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < teams.length; i++) {
            // parse though teams array
                this.teams[i].write(writer);
                // with object teams @ i write attributes to "fileName"
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void output() {
    // similar to .toString this is the respective output of a instance of Tournament that prints 
    // Team#,TeamName,Location,and NumberWins to the Terminal
        for (int i = 0; i < teams.length; i++) {
            System.out.println("Team #" + (i + 1) + "\nTeam Name: " + teams[i].name + "\nLocation: " + teams[i].location + "\nNumber Wins: " + teams[i].numberWins + "\n\n");
        }
    }

    public void season(){
        // This method simulates a season passing, applying random wins to each team THEN sorts teams
        for (int i = 0; i < teams.length; i++) {
            // Generate a random number of wins between 1 and 10
            int randomWins = rand.nextInt(10) + 1;
            // Add the random number of wins to the current team
            teams[i].addWins(randomWins);
        }
        // Sort the teams based on their number of wins
        Arrays.sort(teams);
    }
    
}
