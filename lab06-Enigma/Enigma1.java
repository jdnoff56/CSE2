/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;

public class Enigma1{
    
  public static void main(String []arg){
      
    double percent;
    
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    
    Scanner myScanner = new Scanner(System.in);
    
    if (myScanner.hasNextDouble()) {
        
        double x=(myScanner.nextDouble());
        
        if (x > 0) {
    
            System.out.println("You entered "+x+"%");
        
            double proportion = 1-(x/100);
   
            System.out.println("The proportion remaining is: "+proportion);
        }
        else { System.out.println("number was not > 0"); }
    }
    else { System.out.println("unacceptable input"); }
   }
}

/* Error report
 
    Error 1: Runtime error if anything other than a double or int is entered
        Fix: Add if statement to check for double, and add a corresponding else statement to display a message 
             if the input is unacceptable
             
    Error 2: Logic Error. does not check that the entered number is > 0
        Fix: add an if statement to check that it is > 0 and an else statement to display a message if the input
             is negative
             
    Error 3: Logic Error. Program is supposed to output a proportion for any number input, right now only does it for a few,
             and some of the ones listed dont even work as intended
        Fix: completely throw out the else if structures and the one if statement above them. Replace with a simple
             calculation for the proportion and output results for all acceptable inputs
        
    
 */