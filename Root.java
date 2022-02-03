/*
Name: Jonathan Pestinger
Class Number: CIS221
Time: Tuesdays and Thursdays at 2:10pm
Period: Spring 2022
*/

public class Root { // Root Class

    public static void main(String[] args) { // Main method
        Main store = new Main(); // Create object of Main Class to call constructor
        System.out.println("Value of x: " + store.x); // Use the object to call "x" in the class constructor
        System.out.println("Value of y: " + store.y);
        System.out.println("The quotient of x and y: " + store.results);
    }

}