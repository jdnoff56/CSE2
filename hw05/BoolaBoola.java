// Joseph D'Onofrio
// CSE2
// hw05-BoolaBoola

// displays a random boolean expression with three random booleans and two random 
// operators and asks the user to evaluate the expression. the program then tells
// the user if their answer was correct or incorrect
//

// import scanner utility

import java.util.Scanner ;

// Create Class

public class BoolaBoola {
    
    //Add Main Method
    
    public static void main (String [] args) {
        
        Scanner myScanner ; // declare scanner variable
        myScanner=new Scanner(System.in) ; // call the scanner constructor  
        
        // sets booleans one,two, and three randomly to be either true or false
        boolean one=(Math.random() > 0.5);
        boolean two=(Math.random() > 0.5);
        boolean three=(Math.random() > 0.5);
        
        // returns either a 1 or 0 for use in switches to determine the random operators
        int random1=(int) Math.round(Math.random());
        int random2=(int) Math.round(Math.random());
        
        // declares the operators as strings so they can be displayed in the output
        String operator1;
        String operator2;
        
        // declares variables for use inside switch
        boolean result;
        String trueFalse;
        
        // switch that determines the first random operator, with other switches nested within to determine the second random operator
        // the whole program will run within this switch to avoid variables not being initialized
        switch (random1){
            
            case 0:
            operator1="||"; // if random1=0, the first operator will be ||
            
            switch (random2){
                
                case 0:
                operator2="||"; // if random2=0, the second operator will be ||
                
                result=(one || two || three); // performs the neccessary expression and stores the value for comparison
                
                System.out.println("Does "+one+" "+operator1+" "+two+" "+operator2+" "+three+" have the value true or false?"); // displays question
                System.out.print("Enter here (T/t or F/f): "); // asks for input
                trueFalse=myScanner.next(); // defines the input as the variable trueFalse
                
                
                
                // switch to check the users answer and output whether or not it was correct
                switch (trueFalse){
                    
                    case "T":
                    case "t":
                    //System.out.println(result);////////////////////////////////////////////// used to see if the output was correct
                    if (result==true){
                    System.out.println("Correct"); // if users input matches the actual result of the expression, display "correct"
                    }
                    else {
                    System.out.println("Incorrect"); // if users input does not match the result of the expression, display "incorrect"
                    }
                    break;
                    
                    case "F":
                    case "f":
                    //System.out.println(result);//////////////////////////////////////////////////// used to see if the output was correct
                    if (result==false){
                    System.out.println("Correct"); // if users input matches the actual result of the expression, display "correct"
                    }
                    else {
                    System.out.println("Incorrect"); // if users input does not match the result of the expression, display "incorrect"
                    }
                    break;
                    default:
                    System.out.println("You did not enter T/t/F/f"); // if the user did not enter the correct character, displays a message saying so
                    
                }
                break;
                
                case 1:
                operator2="&&"; // if random2=1, the second operator will be &&
                result=(one || two && three); // performs the neccessary expression and stores the value for comparison
                
                System.out.println("Does "+one+" "+operator1+" "+two+" "+operator2+" "+three+" have the value true or false?"); // displays question
                System.out.print("Enter here (T/t or F/f): "); // asks for input
                trueFalse=myScanner.next(); // defines the input as the variable trueFalse
            
                // switch to check the users answer and output whether or not it was correct
                switch (trueFalse){
                    
                    case "T":
                    case "t":
                    //System.out.println(result);////////////////////////////////////////////////// used to see if the output was correct
                    if (result==true){
                    System.out.println("Correct"); // if users input matches the actual result of the expression, display "correct"
                    }
                    else {
                    System.out.println("Incorrect"); // if users input does not match the result of the expression, display "incorrect"
                    }
                    break;
                    
                    case "F":
                    case "f":
                    //System.out.println(result);/////////////////////////////////////////////// used to see if the output was correct
                    if (result==false){
                    System.out.println("Correct"); // if users input matches the actual result of the expression, display "correct"
                    }
                    else {
                    System.out.println("Incorrect"); // if users input does not match the result of the expression, display "incorrect"
                    }
                    break;
                    default:
                    System.out.println("You did not enter T/t/F/f"); // if the user did not enter the correct character, displays a message saying so
                }
                break;
            }
            break;
            case 1:
            operator1="&&" ; // if random1=1, the first operator will be &&
            
            switch (random2){
                case 0:
                    
                operator2="||"; // if random2=0, the second operator will be ||
                
                result=(one && two || three); // performs the neccessary expression and stores the value for comparison
                
                System.out.println("Does "+one+" "+operator1+" "+two+" "+operator2+" "+three+" have the value true or false?"); // displays question
                System.out.print("Enter here (T/t or F/f): "); // asks for input
                trueFalse=myScanner.next(); // defines the input as the variable trueFalse
                
                
                
                // switch to check the users answer and output whether or not it was correct
                switch (trueFalse){
                    
                    case "T":
                    case "t":
                    //System.out.println(result);///////////////////////////// used to see if the output was correct
                    if (result==true){
                    System.out.println("Correct"); // if users input matches the actual result of the expression, display "correct"
                    }
                    else {
                    System.out.println("Incorrect"); // if users input does not match the result of the expression, display "incorrect"
                    } 
                    break;
                    
                    case "F":
                    case "f":
                    //System.out.println(result);//////////////////////////// used to see if the output was correct
                    if (result==false){
                    System.out.println("Correct"); // if users input matches the actual result of the expression, display "correct"
                    }
                    else {
                    System.out.println("Incorrect"); // if users input does not match the result of the expression, display "incorrect"
                    }
                    break;
                    default:
                    System.out.println("You did not enter T/t/F/f"); // if the user did not enter the correct character, displays a message saying so
                    
                }
                
                break;
                case 1:
                    
                operator2="&&"; // if random2=1, the second operator will be &&
                
                result=(one && two && three); // performs the neccessary expression and stores the value for comparison
                
                System.out.println("Does "+one+" "+operator1+" "+two+" "+operator2+" "+three+" have the value true or false?"); // displays question
                System.out.print("Enter here (T/t or F/f): "); // asks for input
                trueFalse=myScanner.next(); // defines the input as the variable trueFalse
                
                
                
                // switch to check the users answer and output whether or not it was correct
                switch (trueFalse){
                    
                    case "T":
                    case "t":
                    //System.out.println(result);////////////////////////////////////////////////// used to see if the output was correct
                    if (result==true){
                    System.out.println("Correct"); // if users input matches the actual result of the expression, display "correct"
                    }
                    else {
                    System.out.println("Incorrect"); // if users input does not match the result of the expression, display "incorrect"
                    }
                    break;
                    
                    case "F":
                    case "f":
                    //System.out.println(result);///////////////////////////////////////////////////// used to see if the output was correct
                    if (result==false){
                    System.out.println("Correct"); // if users input matches the actual result of the expression, display "correct"
                    }
                    else {
                    System.out.println("Incorrect"); // if users input does not match the result of the expression, display "incorrect"
                    }
                    break;
                    default:
                    System.out.println("You did not enter T/t/F/f");  // if the user did not enter the correct character, displays a message saying so
                    
                }
                
                break;
                
            }
        }
        
        
        
        
    }    
}