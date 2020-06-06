
/*
    Convert Gallons to Liters¶

	This program will convert however many gallons the user enters to liters.	

	Author: Jason Schneider
	Date: June 6, 2020
    Filename: GalToLit.java.
*/

import java.util.Scanner;

class GalToLit {
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        double gallons; // holds the number of gallons
        double liters; // holds conversion to liters
        
        System.out.println("How many gallons do you want to convert to liters? ");
        
        gallons = scan.nextInt();
        
        liters = gallons * 3.7854; // convert to liters
        
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}