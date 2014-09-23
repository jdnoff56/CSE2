// Joseph D'Onofrio
// CSE2
// hw04-TimePadding

// the user inputs the number of seconds that have passed in the day
// and the program outputs the time in conventional form
//

// import scanner utility

import java.util.Scanner ;

// Create Class

public class TimePadding {
    
    //Add Main Method
    
    public static void main (String [] args) {
        
        Scanner myScanner ; // declare scanner variable
        myScanner=new Scanner(System.in) ; // call the scanner constructor  
        
        System.out.print("Enter the time in seconds: "); // prompt the user for input
        
        if (myScanner.hasNextInt()) { // checks if the input number is an integer
        int timeSecs=myScanner.nextInt(); // defines seconds as the input number if it is an integer
        
            // checks if the input number is positive
            if (timeSecs>0){
               
                // checks that the input number is not over the amount of seconds in a day
                if (timeSecs<86400){
            
                int timeMins=(timeSecs/60); // define minutes as seconds/60
                int timeHours=(timeMins/60); // define hours as mins/60
                
                int outputMins=timeMins-(timeHours*60); // calculate what the output should be in the minutes section of the output (XX:XX:XX)
                String outputMinsString=String.format("%02d",outputMins); // convert answer to a string and format to pad with 0s if needed
                
                int outputSecs=timeSecs-(timeMins*60); // calculate what the output should be in the seconds section of the output (XX:XX:XX)
                String outputSecsString=String.format("%02d",outputSecs); // convert answer to a string and format to pad with 0s if needed
               
                System.out.println("The time is: "+timeHours+":"+outputMinsString+":"+outputSecsString); // final output
                
                }
                // ends the program if the int entered is greater than the number of seconds in a day
                else{
                System.out.println("You entered more seconds than there are in a day");
                return;
                }
            }    
            // ends the program if the int entered is not greater than 0
            else{
            System.out.println("You did not enter an int > 0");
            return;
            }
        }
        // ends the program if an int is not entered
        else {
        System.out.println("You did not enter an int");
        return;
        }
    }    
}        