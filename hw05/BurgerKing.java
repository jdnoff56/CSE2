// Joseph D'Onofrio
// CSE2
// hw05-BurgerKing

// prompts the user for their choice of a burger, soda, or fries, and 
// then displays additional options for their selection. final output
// shows the user what they ordered, additional options included

// import scanner utility

import java.util.Scanner ;

// Create Class

public class BurgerKing {
    
    //Add Main Method
    
    public static void main (String [] args) {
        
        Scanner myScanner ; // declare scanner variable
        myScanner=new Scanner(System.in) ; // call the scanner constructor  
        
        // display messages telling the user what to input
        System.out.println("Enter a letter to indicate a choice of: ");
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)"); 
        System.out.println("Fries (F or f)"); 
        
        // prompt user for input
        System.out.print("Enter here: ");
        
        String foodSelect=myScanner.next(); // defines the input as the variable foodSelect
        int foodSelectLength=foodSelect.length(); // gets length of string
        System.out.println("    "); // adds a space between outputs to reduce clutter
        
        // checks the length of the string, if the length is 1, allow rest of program to run
        if (foodSelectLength==1){
            
        // if foodSelect is B/b/S/s/F/f, run the appropriate followup statements.
        switch (foodSelect){
            case "B":
            case "b":
                
            // display messages detailing the options for burger toppings
            System.out.println("What would you like on your burger?");
            System.out.println("A/a for all the fixings");
            System.out.println("C/c for cheese");
            System.out.println("N/n for nothing");
            System.out.print("Enter here: ");
            
            // defines input as the variable burgerTopping
            String burgerTopping=myScanner.next();
            
            System.out.println("    "); // adds a space between outputs to reduce clutter
            
            // display statements that correspond to the input letters. if the letter input is not acceptable, display a message saying so
            switch (burgerTopping){
                case "A":
                case "a":
                System.out.println("You ordered a burger with everything on it");
                break;
                case "C":
                case "c":
                System.out.println("You ordered a burger with cheese");
                break;
                case "N":
                case "n":
                System.out.println("You ordered a burger with nothing on it");
                break;
                default:
                System.out.println("You did not enter A/a/C/c/N/n");
            }
            break;
            case "S":
            case "s":
            // display messages detailing the options for sodas
            System.out.println("What would you like to drink?");
            System.out.println("P/p for Pepsi");
            System.out.println("C/c for Coke");
            System.out.println("S/s for Sprite");
            System.out.println("M/m for Mountain Dew");
            System.out.print("Enter here: ");
            // defines input as the variable sodaSelect
            String sodaSelect=myScanner.next();
            
            System.out.println("    "); // adds a space between questions to reduce clutter
            
            // display statements that correspond to the input letters. if the letter input is not acceptable, display a message saying so
            switch (sodaSelect){
                case "P":
                case "p":
                System.out.println("You ordered a Pepsi");
                break;
                case "C":
                case "c":
                System.out.println("You ordered a Coke");
                break;
                case "S":
                case "s":
                System.out.println("You ordered a Sprite");
                break;
                case "M":
                case "m":
                System.out.println("You ordered a Mountain Dew");
                break;
                default:
                System.out.println("You did not enter P/p/C/c/S/s/M/m");
            }
            break;
            case "F":
            case "f":
            // display messages detailing the options for fries size
            System.out.println("What size fries would you like?");
            System.out.println("L/l for large");
            System.out.println("S/s for small");
            System.out.print("Enter here: ");
            // defines input as the variable friesSelect
            String friesSelect=myScanner.next();
            
            System.out.println("    "); // adds a space between questions to reduce clutter
            
            // display statements that correspond to the input letters. if the letter input is not acceptable, display a message saying so
            switch (friesSelect){
                case "L":
                case "l":
                System.out.println("You ordered large fries");
                break;
                case "S":
                case "s":
                System.out.println("You ordered small fries");
                break;
                default:
                System.out.println("You did not enter L/l/S/s");
            }
            break;
            // if string foodSelect is not any of the acceptable letters, display a message saying so
            default:
            System.out.println("you did not enter B/b/S/s/F/f"); 
        }
        }
        // if the input string contains more than one character, display a message saying so
        else {
        System.out.println("A single character expected"); 
        }
        
        
    }    
}       