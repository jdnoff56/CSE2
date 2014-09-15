// Joseph D'Onofrio
// CSE2
// hw03-Bicycle

// used data input by the user in order to calculate
// the distance traveled, time taken, and average mph
// for a bicycle ride

// import scanner utility

import java.util.Scanner ;


// Create Class

public class Bicycle {
    
    //Add Main Method
    
    public static void main (String [] args) {
        
        
        Scanner myScanner ; // declare scanner variable
        myScanner=new Scanner(System.in) ; // call the scanner constructor  
        
        System.out.print("Enter the number seconds: "); // prompt the user for input
        int nSeconds=myScanner.nextInt() ; // accept input and define variable as that input
        
        System.out.print("Enter the number of counts: "); // prompt the user for input
        int nCounts=myScanner.nextInt() ; // accept input and define variable as that input
        
        double wheelDiameter=27.0, // declares wheel diameter variable
        PI=3.14159, // declares variable PI
        feetPerMile=5280, // Declares feet per mile variable
        inchesPerFoot=12, // Declares inches per feet variable
        secondsPerMinute=60; // Declares inches per feet variable 
        
        // run calculations and store values 
        
        double tripDistance=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile ; // declares variable for Trip Distance and performs distance calculation
        double tripTimeMin=nSeconds/secondsPerMinute ; // declares variable for trip time in minutes and performs the calculation
        double tripTimeHour=tripTimeMin/60 ; // declares variable for trip time in hours and performs the calculation (this variable is for use in average mph calculation)
        double tripSpeed=tripDistance/tripTimeHour ; // declares variable for average miles per hour and performs the calculation
        
        // round necessary numbers to 2 decimal places
        
        double tripDistanceRound=Math.round(tripDistance * 100.0) / 100.0 ;
        double tripSpeedRound=Math.round(tripSpeed * 100.0) / 100.0 ;
        
        // output results
        
        System.out.println("The distance was "+tripDistanceRound+" and took "+tripTimeMin+" minutes") ;
        System.out.println("The average mph was "+tripSpeedRound) ;
        
        
    }
}