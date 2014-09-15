// Joseph D'Onofrio
// CSE2
// hw03-Root

// takes a double input by the user, calculates and displays a crude estimate
// of the cube root of that number, then calculates and displays a crude
// estimate of the result cubed

// import scanner utility

import java.util.Scanner ;


// Create Class

public class Root {
    
    //Add Main Method
    
    public static void main (String [] args) {
        
        
        Scanner myScanner ; // declare scanner variable
        myScanner=new Scanner(System.in) ; // call the scanner constructor  
        
        System.out.print("Enter a double and I will print the cube root: "); // prompt the user for input
        double x=myScanner.nextDouble() ; // accept input and declares variable as that input
        
        
        // use a process of guesses to refine the value of the cube root of x
        double rootGuess1=x/3 ;
        double rootGuess2=(2*rootGuess1*rootGuess1*rootGuess1+x)/(3*rootGuess1*rootGuess1) ;
        double rootGuess3=(2*rootGuess2*rootGuess2*rootGuess2+x)/(3*rootGuess2*rootGuess2) ;
        double rootGuess4=(2*rootGuess3*rootGuess3*rootGuess3+x)/(3*rootGuess3*rootGuess3) ;
        double rootGuess5=(2*rootGuess4*rootGuess4*rootGuess4+x)/(3*rootGuess4*rootGuess4) ;
        double rootGuess6=(2*rootGuess5*rootGuess5*rootGuess5+x)/(3*rootGuess5*rootGuess5) ;
        
        
        // output results
        System.out.println("the cube root is: "+rootGuess6) ;
        System.out.println(rootGuess6+"*"+rootGuess6+"*"+rootGuess6+"="+(rootGuess6*rootGuess6*rootGuess6)) ;
    }        
}