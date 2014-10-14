// Joseph D'Onofrio
// CSE2
// hw06-Roulette

// 
//

// import scanner utility

import java.util.Scanner ;

// Create Class

public class Root {
    
    //Add Main Method
    
    public static void main (String [] args) {
    
        Scanner myScanner ; // declare scanner variable
        myScanner = new Scanner(System.in) ; // call the scanner constructor
        
        System.out.print("Enter a double > 0: ");
        
        if (myScanner.hasNextDouble()) { // checks if the input number is a double
        double x = (myScanner.nextDouble()); // defines x as the input number
            
            if (x > 0) { // checks that the input number is greater than 0
            
            // declare and initialize variables for calculation
            double low = 0; 
            double high = 1 + x;
            
            double loopLoop = 0; // variable to control the loop
            
            // loop that calculates the square root of input number
            while (loopLoop < 1){ 
                
                double middle = ((low+high)/2);
                
                if (middle*middle > x) {
                    high = middle;
                }
                else {
                    low = middle;
                }
                if (high - low < 0.0000001){
                    System.out.println("the square root is: "+high);
                    break;
                }
            
            }
            }
            else{
            System.out.println("number entered was not > 0"); // if the input number was not > 0, display message saying so
            }
            
        }
        else{
        System.out.println("You did not enter a double"); // if the input number was not a double, display message saying so
        }
    }    
}