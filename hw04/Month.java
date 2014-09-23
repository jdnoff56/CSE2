// Joseph D'Onofrio
// CSE2
// hw04-Month

// prompts the user for the month as an integer (1-12) and returns the number
// of days in that month, if the month is February (2) the user is prompted for 
// the year and the amount of days in the month is based on that answer
//

// import scanner utility

import java.util.Scanner ;

// Create Class

public class Month {
    
    //Add Main Method
    
    public static void main (String [] args) {
        
        Scanner myScanner ; // declare scanner variable
        myScanner=new Scanner(System.in) ; // call the scanner constructor  
        
        System.out.print("Enter an int giving the number of the month (1-12): "); // prompt the user for input
        
        if (myScanner.hasNextInt()) { // checks if the input number is an integer
        int month=myScanner.nextInt(); // defines month as the input number if it is an integer
        
            if (month>=1){ // check that the number entered is greater than or equal to 1
                
                if(month<=12){ // check that the number entered is less than or equal to 12
                    
                    if(month==1){ // print the number of days in January
                    System.out.println("The month has 31 days");
                    }
                    
                    if(month==2){ // print the number of days in February, taking leap years into account
                        
                    System.out.print("enter an int giving the year: ");
                    if (myScanner.hasNextInt()) { // checks if the input number is an integer
                    int year=myScanner.nextInt(); // defines year as the input number if it is an integer
                    
                        if (year>0){ // check that the entered year is a positive int
                        
                            if ((year%4==0) && (year%100 !=0) || (year%400==0)){ // check that the three requirements for a leap year are met
                            System.out.println("The month has 29 days");
                            }
                            else{
                            System.out.println("The month has 28 days");
                            }
                            
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
                    
                    if (month==3){ // print the number of days in March
                    System.out.println("The month has 31 days");
                    }
                    
                    if (month==4){ // print the number of days in April
                    System.out.println("The month has 30 days");
                    }
                    
                    if (month==5){ // print the number of days in May
                    System.out.println("The month has 31 days");
                    }
                    
                    if (month==6){ // print the number of days in June
                    System.out.println("The month has 30 days");
                    }
                    
                    if (month==7){ // print the number of days in July
                    System.out.println("The month has 31 days");
                    }
                    
                    if (month==8){ // print the number of days in August
                    System.out.println("The month has 31 days");
                    }
                    
                    if (month==9){ // print the number of days in September
                    System.out.println("The month has 30 days");
                    }
                    
                    if (month==10){ // print the number of days in October
                    System.out.println("The month has 31 days");
                    }
                    
                    if (month==11){ // print the number of days in November
                    System.out.println("The month has 30 days");
                    }
                    
                    if (month==12){ // print the number of days in December
                    System.out.println("The month has 31 days");
                    }
                    
                }  // if the input number is an integer greater than 12, displays a message saying so and ends the program
                else{
                System.out.println("You did not enter an int 1-12");
                return;
                }
            
            } // if the input number is an integer less than 1, displays a message saying so and ends the program
            else{
            System.out.println("You did not enter an int 1-12");
            return;
            }
            
        } // if the input number is not an integer, displays a message saying so and ends the program
        else{
        System.out.println("You did not enter an int");
        return;
        }   
        
     
    }    
}