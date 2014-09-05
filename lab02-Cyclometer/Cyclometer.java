// Joseph D'Onofrio
// 9/5/14
// CSE2
// Lab02 Cyclometer

// bicycle cyclometer, records time elapsed in seconds and number of rotations
// of the front wheel for two trips. Information returned is minutes per trip,
// rotation count per trip, distance of each trip in miles, and the distance of both trips combined

// Create Class

public class Cyclometer {
    
    // Add main method
    
    public static void main (String [] args) {
         
         int secsTrip1=480 ; // Number of seconds in trip 1
         int secsTrip2=3220 ; // Number of Seconsd in trip 2
         int countsTrip1=1561 ; // Front Wheel rotation count for trip 1
         int countsTrip2=9037 ; // Front Wheel rotation count for trip 2
         
         
         double wheelDiameter=27.0, 
         PI=3.14159, // define variable PI
         feetPerMile=5280, // Define feet per mile
         inchesPerFoot=12, // Define inches per feet
         secondsPerMinute=60; // Define inches per feet
         double distanceTrip1; double distanceTrip2; double totalDistance; 
         
         // Print Numbers
         
         System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts." );
         System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts." );
         
         // Run Calculations and Store Values
         
         distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; //Gives distance for trip 1
         distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //Gives distance for trip 2 
         totalDistance=distanceTrip1+distanceTrip2; //gives total distance
         
         //Print output data
         
         System.out.println("Trip 1 was "+distanceTrip1+" miles");
         System.out.println("Trip 2 was "+distanceTrip2+" miles");
         System.out.println("The total distance was "+totalDistance+" miles");
         
         
    }
}