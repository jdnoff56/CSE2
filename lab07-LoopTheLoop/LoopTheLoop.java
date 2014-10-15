// Joseph D'Onofrio
// CSE2
// lab07-LoopTheLoop

// Uses a series of nested loops to print out a certain number of lines with stars. The user inputs an
// int and the first line of output is the number of stars equal to their input. The following lines
// start at one star and increase one star per line until the number of stars is once again equal
// to the users input. The program then asks if they want to run it again, if an acceptable answer
// is given, the whole program loops again.
//

// import scanner utility

import java.util.Scanner ;

// Create Class

public class LoopTheLoop {
    
    //Add Main Method
    
    public static void main (String [] args) {
    
        Scanner myScanner ; // declare scanner variable
        myScanner = new Scanner(System.in) ; // call the scanner constructor
        
        while (true) { // begins infinite loop
        
            System.out.print("Enter an int between 1-15: "); // prompts the user for a number that influences how many stars are output
            
            if (myScanner.hasNextInt()) { // checks to make sure the input number is an int
            
            int input = (myScanner.nextInt()); // sets the variable input as the input number
            
            if (input >= 1 && input <= 15 ) { // checks to make sure the input is within the range 1-15
                
                // this loop prints out the correct number of stars for the first line of the output
                int loopFirst = 0; // variable to control how many times the loop repeats
                while (loopFirst < input) {
                    
                    System.out.print("*");
                    loopFirst++; // increases lower limit by 1, controls how many times loop will repeat
                    
                }
                
                System.out.println(" "); // goes to the next line after the correct number of stars have been printed on the first line
                
                // A loop nested within a loop. The inner loop controls how many stars will be on a single line, and the 
                // outer loop controls how many lines of stars there will be. The number of stars starts
                // at 1 (after the first line controlled by the loop above) and increases by one with each new line until
                // the number of lines is no longer less than the value of the input number
                
                int controlNum = 1; // variable that controls the upper limit of the inner loop, which decides how many stars will be on a line
                int loopLoop1 = 0; // variable for controlling the number of times the outer loop repeats
                while (loopLoop1 < input) {
                    
                    int loopLoop0 = 0;
                    while (loopLoop0 < controlNum) {
                        
                        System.out.print("*");
                        loopLoop0++; // adds 1 to lower limit of inner loop, controls how many times the inner loop will repeat
                        
                    }
                    
                    System.out.println(" "); // goes to the next line after number of stars is determined for the current line
                    loopLoop1++; // adds 1 to lower limit of outer loop, controls how many times the outer loop will repeat
                    controlNum++; // adds 1 to the upper limit of the inner loop, controls how many stars will print on a single line
                
                }
            
            }  
            else { System.out.println("Your int was not in the range [1-15]"); break;} // if the int entered was not in the correct range, the program ends
            }
            else { System.out.println("You did not enter an int"); break; } // if the input was not an int, the program ends
        
        System.out.print("Enter y or Y to go again: "); // prompt the user if they want to repeat the entire program
        String optionSelect=myScanner.next(); // sets optionSelect as the users answer
        
        if (optionSelect.equals ("y") ){ // if the user answered y, do nothing (this will repeat because of the infinite loop)
        }
        else if (optionSelect.equals ("Y") ){ // if the user answered Y, do nothing (this will repeat because of the infinite loop)
        }
        else { break; } // if the user did not answer y/Y, end the program
        }   
    }    
}