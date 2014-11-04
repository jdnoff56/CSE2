// Joseph D'Onofrio
// CSE2
// hw09-BlockedAgain

// Like hw07, this is a program that prompts the user to enter an int 1-9, and then outputs a
// stack of numbers that corresponds to the number entered. This time instead of doing three stacks
// with the three different types of loop, we are given a bare bones main method and must accomplish the
// stack by creating a series of methods that call eachother to solve various subproblems until the overall
// problem has been solved
//

import java.util.Scanner;

public class BlockedAgain{
    
    public static void main(String []s){
        
    int m; // declares variable
    
    //force user to enter int in range 1-9, inclusive.
    m = getInt(); // calls method getInt, which returns an int 1-9
    
    allBlocks(m); // calls method allBlocks, which creates the stack of numbers based on the users input
    
    }
    
    public static int getInt(){ // method that calls two other methods to perform various checks and returns the input number if it passes the checks
        
        int input; // declares variable input
    
        int intCheck = checkInt(); // calls the checkInt method, which prompts the user for input and checks if it is an int, then returns it into variable intCheck
        
        input = checkRange(intCheck); // if the input passes checkInt, it will then be input into the method checkRange, and then output from that method if it is in the range [1-9],
                                      // the number output from checkRange is then stored in the variable input
        return input; // return input to the main method for use in allBlocks method
    }
    
    public static int checkInt(){ // method that forces the user to enter an int
        
        Scanner myScanner ; // declare scanner variable
        myScanner = new Scanner(System.in) ; // call the scanner constructor
        
        int output; // declares variable
        
        System.out.print("Enter an int between 1-9: "); // prompts the user for an input
        
        
        while (true){ // infinite loop, will repeatedly prompt the user for input until an int is entered and the break statement is reached
            if (myScanner.hasNextInt()){ // if input number is an int...
                output = myScanner.nextInt(); // define output as that input number
                break; // leave infinite loop
            }
            else { // if input number is not an int...
                System.out.print("You did not enter an int, try again: "); // display message that int was not entered, and prompt user again
                myScanner.next(); // get rid of junk
            }
        } 
        
        return output; // once integer condition is met, return the input to the getInt method for use in checkRange
        
    }
    
    public static int checkRange(int input){ // method that checks if the input from checkInt is within the range [1-9], and returns that number if it is within range.
                                             // if it is not within range, the checkRange will prompt the user for another entry and check that it meets both conditions 
        Scanner myScanner ; // declare scanner variable
        myScanner = new Scanner(System.in) ; // call the scanner constructor
        
        int output; // declare variable
        
        while (true){ // infinite loop, to force the user to input something that meets the appropriate conditions
            
            if (input >=1 && input <= 9){ // if the users input is within the correct range...
                output = input; // define the output of the method as the input (nothing needs to change)
                break; // leave infinite loop when appropriate input number is within range 1-9
            }
            else { // if the users input is not within the appropriate range...
                
                System.out.print("Your int was not within the range [1,9], try again: "); // display a message saying so and prompt the user again
                
                while (true){ // infinite loop to make sure the users input meets the first condition of being an int
                    if (myScanner.hasNextInt()){  // if input number is an int...
                        input = myScanner.nextInt(); // define input as that number so that its range can be checked again
                        break; // leave infinite loop when input is an int
                    }
                    else { // if input number is not an int....
                        System.out.print("You did not enter an int, try again: "); //prompt user to enter another input
                        myScanner.next(); // get rid of junk
                    }
                }    
            }
        }   
        return output; // if the input is within range 1-9, return it for use in the allBlocks method
    }
    
    public static void allBlocks(int input){ // method that loops the blocks to create the stack of numbers
        
        int n = 1; // declare variable 
        int limit1 = 1;//declare variable
        int count1; // declare variable for controlling this loop
        for (count1 = 1; count1 <= input; count1++ ){  // outermost loop, loops the blocks of numbers/dashes
            block(n, limit1, input); // calls the block method to create each individual block (passes down n, limit1, and input for use inside the method)
            System.out.println(" "); // goes to the next line
            n++; // increases n by one for the next block of numbers
            limit1 += 2; // increases limit1 by two to create stacking effect
        }
    }
    
    public static void block(int n, int limit1, int input){ // method that creates each individual block of numbers/dashes
        
        int count3;// controls a loop
        int count6;// controls a loop
        int count4;// controls a loop
        for (count4 = 1; count4 <= n; count4++) { // repeats the string of numbers to create additional rows, if needed
            line(n, limit1, input); // calls the line method to create each individual line of numbers (passes down n, limit1, and input for use inside the method)
            System.out.println(""); // goes to the next line
        }
        for (count6 = 1; count6 <= input - n; count6++ ) { // adds needed amount of spaces before the dashes
            System.out.print(" ");  
        }
        for (count3 = 1; count3 <= limit1 ; count3++) { // creates a row of the needed amount of dashes
            System.out.print("-");
        }
    }
    
    public static void line(int n, int limit1, int input){ // method that creares each individual line of numbers
        
        int count2; // controls a loop
        int count5; // controls a loop
        
        for (count5 = 1; count5 <= input - n; count5++ ) { // adds needed amount of spaces before the numbers to create the stacking effect
            System.out.print(" ");  
        }
                
        for (count2 = 1; count2 <= limit1 ; count2++) { // creates one row of the needed amount of numbers
            System.out.print(n);
        }
        
    }
        
    
}