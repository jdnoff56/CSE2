//Joseph D'Onofrio
//CSE2
//lab03-BigMac

// Computes the cost of buying Big Macs using user
// input to obtain the neccessary data

// import scanner utility

import java.util.Scanner ;


// Create Class

public class BigMac {
    
    //Add Main Method
    
    public static void main (String [] args) {
        
        Scanner myScanner ; // declare scanner variable
        myScanner=new Scanner(System.in) ; // call the scanner constructor
        
        System.out.print("Enter the number of Big Macs(an integer > 0): "); // prompt the user for input
        int nBigMacs=myScanner.nextInt() ; // accept input and define variable as that input
        
        System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx): "); // prompt the user for input
        double $BigMacs=myScanner.nextDouble() ; // accept input and define variable as that input

        System.out.print("Enter the percent tax as a whole number (xx): ") ; // prompt the user for input
        double taxRate=myScanner.nextDouble() ; // accept input and define variable as that input
        taxRate/=100 ; // user enters percent, I want proportion
        
        double cost$ ;
        int dollars ; // stores dollar amount of cost
        int dimes ; // for storing numbers right of the decimal point
        int pennies ; // for storing numbers right of the decimal point
        
        cost$=nBigMacs*$BigMacs*(1+taxRate) ; // gets the whole amount, dropping decimal fraction
        dollars=(int)cost$ ; // convert double cost$ to an integer for use as the value of dollars
        dimes=(int)(cost$*10)%10 ; // calculates the value of dimes
        pennies=(int)(cost$*100)%10 ; // calculates the value of pennies
        
        
        // output the final statement to the user, displaying total cost of the Big Macs
        System.out.println("The total cost of "+nBigMacs+" Big Macs, at $"+$BigMacs+" with a sales tax of "+(int)(taxRate*100)+"%, is $"+dollars+'.'+dimes+pennies) ;
        
    }
}

