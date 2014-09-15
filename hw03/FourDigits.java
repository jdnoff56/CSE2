// Joseph D'Onofrio
// CSE2
// hw03-FourDigits

// Takes a double input by the user and 
// outputs the first four digits right of the decimal point


// import scanner utility

import java.util.Scanner ;

// Create Class

public class FourDigits {
    
    //Add Main Method
    
    public static void main (String [] args) {
     
    Scanner myScanner ; // declare scanner variable
    myScanner=new Scanner(System.in) ; // call the scanner constructor  
        
    System.out.print("Enter a double and I will display the four digits to the right of the decimal point: "); // prompt the user for input
    double inputX=myScanner.nextDouble() ; // accept input and declares variable as that input

    
    
    // perform a series of calculations to extract the 4 digits to the right of the decimal
    int inputXX=(int)inputX ;
    int inputXX2=inputXX*10000 ;
    
    double inputX2=inputX*10000 ;
    int inputX3=(int)inputX2 ;
    
    int inputX4=inputX3-inputXX2 ;
    
    String vfinal=String.format("%04d",inputX4) ;
    
    
    
    // output result
    System.out.println("The four digits are: "+vfinal) ;

     
        
    }       
}
