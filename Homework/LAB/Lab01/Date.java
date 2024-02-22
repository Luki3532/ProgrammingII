/*
 * Lucas Carpenter
 * 2/21/2024
 * Lab #1
 * This lab makes a class
 */
import java.util.*;

public class Date {
    int day;
    int month;
    int year;

    public static void main(String[] args) {
        Date date = new Date(21, 2, 2024);
        Date newDate = new Date();

        System.out.println("Output date: " + date);

        newDate.input();

        System.out.println("Output newDate: " + newDate);

        System.out.println("Compare date to newDate: " + date.before(newDate));

    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    public void input() {
        Scanner read = new Scanner(System.in);

        System.out.println("enter values for the three attributes(mm/dd/yyyy): ");
        this.month = read.nextInt();
        this.day = read.nextInt();
        this.year = read.nextInt();

        if (month > 12) {
            month = 12;
        } else if (month < 1) {
            month = 1;
        }

        if (day > 31) {
            day = 31;
        } else if (day < 1) {
            day = 1;
        }

        System.out.println(month + "/" + day + "/" + year);
        read.close();
    }

    public boolean before(Date dateObject) {
        if (this.year == dateObject.year) {
            if (this.month == dateObject.month) {
                if (this.day == dateObject.day) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return (month + "/" + day + "/" + year);
    }
}