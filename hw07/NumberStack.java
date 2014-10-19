// Joseph D'Onofrio
// CSE2
// hw07-NumberStack

// A program that prompts the user to enter an int 1-9, and then outputs three stacks
// of numbers that correspond to the number entered. The first stack is made using only
// for loops, the second stack made using only while loops, and the third stack made using 
// only do while loops.
//

// import scanner utility

import java.util.Scanner ;

// Create Class

public class NumberStack {
    
    //Add Main Method
    
    public static void main (String [] args) {
    
        Scanner myScanner ; // declare scanner variable
        myScanner = new Scanner(System.in) ; // call the scanner constructor
        
        System.out.print("Enter an int between 1-9: "); // prompts the user for an input
         
        if (myScanner.hasNextInt()) { // checks to make sure the input number is an int
            
        int input = (myScanner.nextInt()); // sets the variable input as the input number
        
        if (input >= 1 && input <= 9 ) { // checks to make sure the input is within the range 1-9
        
            System.out.println("Using for loops: "); // prompt user for input
            
            // declare variables to use in the various loops
            // counts 1-6 each control the number of times a single loop runs
            // n controls what number is printed out
            // limit1 controls the number of numbers printed on a single line, increases by two at the end of the outermost loop to create the stacking effect
            int n = 1;
            int limit1 = 1;
            int count1;
            int count2;
            int count3;
            int count4;
            int count5;
            int count6;
        
            for (count1 = 1; count1 <= input; count1++ ){  // outermost loop, loops the blocks of numbers/dashes
                
                for (count4 = 1; count4 <= n; count4++) { // repeats the string of numbers to create additional rows, if needed
                    
                    for (count5 = 1; count5 <= input - n; count5++ ) { // adds needed amount of spaces before the numbers to create the stacking effect
                        
                        System.out.print(" ");  
                        
                    }
                
                    for (count2 = 1; count2 <= limit1 ; count2++) { // creates one row of the needed amount of numbers
                            
                        System.out.print(n);
                            
                    }
                    
                    System.out.println(""); // goes to the next line
                }
                for (count6 = 1; count6 <= input - n; count6++ ) { // adds needed amount of spaces before the dashes
                        
                    System.out.print(" ");  
                        
                }
                for (count3 = 1; count3 <= limit1 ; count3++) { // creates a row of the needed amount of dashes
                    
                    System.out.print("-");
                }
                System.out.println(" "); // goes to the next line
                n++; // increases n by one for the next block of numbers
                limit1 += 2; // increases limit1 by two to create stacking effect
                
            }
        
            // begin run-through of same output with while loops
            System.out.println("Using while loops: ");
            
            // reset variables to their original value so they can be used again
            n = 1;
            limit1 = 1;
            count1 = 1;
            
            while (count1 <= input) { // outermost loop, loops the blocks of numbers/dashes
            
                count4 = 1;
                while (count4 <= n) {  // repeats the string of numbers to create additional rows, if needed
                    
                    count5 = 1;
                    while (count5 <= input - n) { // adds needed amount of spaces before the numbers to create the stacking effect
                        
                        System.out.print(" ");
                        
                    count5++;
                    }
                    
                    count2 = 1;
                    while (count2 <= limit1) { // creates one row of the needed amount of numbers
                        
                        System.out.print(n);
                        
                    count2++;
                    }
                    
                count4++;
                System.out.println(""); // goes to the next line
                }
                
                count6 = 1;
                while (count6 <= input - n) { // adds needed amount of spaces before the dashes
                    
                    System.out.print(" "); 
                    
                count6++;
                }
                
                count3 = 1;
                while (count3 <= limit1) { // creates a row of the needed amount of dashes
                    
                    System.out.print("-");
                
                count3++;
                }
                
            System.out.println(" "); // goes to the next line
            
            n++; // increases n by one for the next block of numbers
            limit1 += 2; // increases limit1 by two to create stacking effect
            count1++;
            }
            
            // being run-through of same output with do while loops
            System.out.println("Using do while loops: ");
            
            n = 1;
            limit1 = 1;
            count1 = 1;
            
            do { // outermost loop, loops the blocks of numbers/dashes
            
                count4 = 1;
                do {  // repeats the string of numbers to create additional rows, if needed
                     
                    count5 = 1;
                    if (count5 <= input - n) { // if statement to make sure spaces aren't added before the last block of numbers
                    do { // adds needed amount of spaces before the numbers to create the stacking effect
                        
                        System.out.print(" ");
                        
                    count5++;
                    } while (count5 <= input - n);
                    }
                    
                    count2 = 1;
                    do { // creates one row of the needed amount of numbers
                        
                        System.out.print(n);
                        
                    count2++;
                    } while (count2 <= limit1);
                  
                count4++;
                System.out.println(""); // goes to the next line
                } while (count4 <= n);
                
                count6 = 1;
                if (count6 <= input - n) { // if statement to make sure spaces arent added to last row of dashes
                do { // adds needed amount of spaces before the dashes
                    
                    System.out.print(" ");
                    
                count6++;
                } while (count6 <= input - n);
                } 
                
                count3 = 1;
                do { // creates a row of the needed amount of dashes
                    
                    System.out.print("-");
                    
                count3++;
                } while (count3 <= limit1);
                
            System.out.println(" "); // goes to the next line
            
            n++; // increases n by one for the next block of numbers
            limit1 += 2; // increases limit1 by two to create stacking effect
            count1++;
            } while (count1 <= input);
            
        }
        else { System.out.println("Your int was not within the range [1-9]"); } // displays message if int was outside range
        }
        else { System.out.println("You did not enter an int"); } // displays message if an int was not entered
    }    
}

