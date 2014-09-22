// Joseph D'Onofrio
// CSE2
// hw04-BigMacAgain

// prompts the user to enter how many Big Macs they are getting and if they
// want fries or not, then outputs the total cost of the order
//

// import scanner utility

import java.util.Scanner ;

// Create Class

public class BigMacAgain {
    
    //Add Main Method
    
    public static void main (String [] args) {
        
        Scanner myScanner ; // declare scanner variable
        myScanner=new Scanner(System.in) ; // call the scanner constructor  
        
        // declare variables for the prices of fries and big macs
        double costBigMac=2.22 ;
        double costFries=2.15 ;
        
        
        System.out.print("Enter the number of Big Macs(integer > 0): "); // prompt the user for input
        
        
        if (myScanner.hasNextInt()) { // checks if the input number is an integer
            int nBigMacs=myScanner.nextInt(); // defines nBigMacs as the input number if it is an integer
            
            double totCostBigMacs=nBigMacs*costBigMac ; // defines the total cost of all big macs purchased
            double totCostBigMacsRound=Math.round(totCostBigMacs * 100.0) / 100.0 ; // round result
            
            
            if (nBigMacs>0){ // checks if the input number is greater than 0
            
            // if the number is an integer greater than 0, this message is displayed
            System.out.println("You ordered "+nBigMacs+" Big Macs for a cost of: "+nBigMacs+" x $"+costBigMac+" = $"+totCostBigMacsRound);
            
            // ask if the user would like some fries with their Big Macs
            System.out.print("Do you want an order of fries (Y/y/N/n)?: ");
            String answer=myScanner.next();
            
            // nested if-else statements to establish Y/y/N/n as the 4 acceptable answers for the previous prompt
                if (answer.equals("Y")){
                System.out.println("You ordered fries at a cost of $2.15");
                System.out.println("The total cost of the meal is: $"+(totCostBigMacsRound+costFries));
                }
                else
                    if (answer.equals("y")){
                    System.out.println("You ordered fries at a cost of $2.15");
                    System.out.println("The total cost of the meal is: $"+(totCostBigMacsRound+costFries));
                    }
                
                    else
                        if (answer.equals("N")){
                        System.out.println("You did not order fries");
                        System.out.println("The total cost of the meal is: $"+(totCostBigMacsRound));
                        }
                    
                        else
                            if (answer.equals("n")){
                            System.out.println("You did not order fries");
                            System.out.println("The total cost of the meal is: $"+(totCostBigMacsRound));
                            }
                            
                            // if the user gives an answer other than Y/y/N/n, this statement is shown and the program ends
                            else{
                            System.out.println("You did not enter Y/y/N/n");
                            return;
                            }
                            
               
            // if the input number is an integer less than 0, displays a message saying so and ends the program
            }
            else{
                System.out.println("You did not enter an int > 0");
            return;
            }
            
        }
        
        // if the input number is not an integer, displays a message saying so and ends the program
        else{
            System.out.println("You did not enter an int");
        return;
        }    
        
        
       
        
        
        
        
        
        
    }    
}