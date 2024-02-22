
/**
 * Main 
 * Homework 3 & Lab1
 * Lucas Carpenter 
 * C201
 * 2/1/2024
 * This Program Uses Methods From FootballTeam and Tournament, This program is essentially a demo for these classes,
 * creating FootballTeam objects and importing and exporting data to the respective objects
 * then for Homework 3 Creating a Tournament object and importing data from "teams.txt"
 * and using the output method to print all of teams in the tournament class.
 */

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        FootballTeam team0, team1;
        team0 = new FootballTeam("IUSB Titans", "South Bend", 5);
        // instansiate football team with information
        
        team1 = new FootballTeam();
        // instansiate empty footballTeam
        
        team0.write("team0.txt");
        //Write/export attributes from team0 to team0.txt file

        team1.read("team1.txt");
        //Read/import attributes from pre-made file team1.txt for team1

        System.out.println(team0+"\n\n"+team1+"\n\n");
        //I made a toString class and using it for debugging here

        //For HomeWork
        Tournament tournament = new Tournament(10);
        //make new tournament

        tournament.read("teams.txt");
        //read and apply attributes from teams.txt

        tournament.output();
        //print out tournament teams and respective attributes

        tournament.season();
        //simulate season 

        tournament.write("newTeams.txt");
        //write new attributes after season to newTeams.txt
    }
}


