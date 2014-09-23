// Joseph D'Onofrio
// CSE2
// hw04-IncomeTax

// prompts the user to enter an income in thousands of dollars,
// then outputs the tax rate for that income and the tax amount in dollars
//

// import scanner utility

import java.util.Scanner ;

// Create Class

public class IncomeTax {
    
    //Add Main Method
    
    public static void main (String [] args) {
        
        Scanner myScanner ; // declare scanner variable
        myScanner=new Scanner(System.in) ; // call the scanner constructor  
        
        System.out.print("Enter the income as an int representing the number of thousands: "); // prompt the user for input
        
        if (myScanner.hasNextInt()) { // checks if the input number is an integer
            int income=myScanner.nextInt(); // defines income as the input number if it is an integer
            
            if (income>0){ // checks if the input number is greater than 0
            
                if (income>=78){
                double taxRate1=14.0; // declare tax rate
                double taxAmount1=((income*(taxRate1/100))*1000); // calculate tax amount
                double taxRound1=Math.round(taxAmount1 * 100.0) / 100.0 ; // round result
                System.out.println("The tax rate on $"+income+",000 is "+taxRate1+"%, and the tax is $"+taxRound1); 
                }
                else{
                    if (income>=40){
                    double taxRate2=12.0;// declare tax rate
                    double taxAmount2=((income*(taxRate2/100))*1000); // calculate tax amount
                    double taxRound2=Math.round(taxAmount2 * 100.0) / 100.0 ; // round result
                    System.out.println("The tax rate on $"+income+",000 is "+taxRate2+"%, and the tax is $"+taxRound2); 
                    }
                    else{
                        if (income>=20){
                        double taxRate3=7.0;// declare tax rate
                        double taxAmount3=((income*(taxRate3/100))*1000); // calculate tax amount
                        double taxRound3=Math.round(taxAmount3 * 100.0) / 100.0 ; // round result
                        System.out.println("The tax rate on $"+income+",000 is "+taxRate3+"%, and the tax is $"+taxRound3);
                        }
                        else{
                            if (income<20){
                            double taxRate4=5.0;// declare tax rate
                            double taxAmount4=((income*(taxRate4/100))*1000); // calculate tax amount
                            double taxRound4=Math.round(taxAmount4 * 100.0) / 100.0 ; // round result
                            System.out.println("The tax rate on $"+income+",000 is "+taxRate4+"%, and the tax is $"+taxRound4);
                            }
                        }
                    }
                }
         
            // if the input number is an integer less than 0, displays a message saying so and ends the program
            }
            else{
                System.out.println("You did not enter an int > 0");
            return;
            }
            
            
        } // if the input number is not an integer, displays a message saying so and ends the program
        else{
            System.out.println("You did not enter an int");
        return;
        }   
            
        
    }        
}