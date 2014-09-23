// Joseph D'Onofrio
// CSE2
// hw04-CourseNumber

// the user inputs a 6 digit course number and the the output tells the user
// what semester and year that course was available in
//

// import scanner utility

import java.util.Scanner ;

// Create Class

public class CourseNumber {
    
    //Add Main Method
    
    public static void main (String [] args) {
        
        Scanner myScanner ; // declare scanner variable
        myScanner=new Scanner(System.in) ; // call the scanner constructor  
        
        System.out.print("Enter a six digit number giving the course semester: "); // prompt the user for input
        
        if (myScanner.hasNextInt()) { // checks if the input number is an integer
        int courseNumber=myScanner.nextInt(); // defines course number as the input number if it is an integer
        
        
            // checks that the number entered is in the proper range 
            if (courseNumber<= 201440){
                
                // checks that the number entered is in the proper range
                if (courseNumber>=186510){
                    
                    int courseYear=(courseNumber/100); // defines the course year by dividing by 100 to get rid of the last two digits
                    int courseSemester=courseNumber-(courseYear*100); // defines the numerical value of the semester by subtracting the overall 
                                                                      // course number by (courseyearx100) in order to get rid of the first 4 digits
                    // nested if else statements saying if the course semester is equal to 40,30,20, or 10
                    // to then define the course semester as a string Fall(40),Summer2(30),Summer1(20),or Spring(10)
                    // and then outputs the final statement
                    if (courseSemester==40){
                    String semester1="Fall";
                    System.out.println("The course was offered in the "+semester1+" semester of "+courseYear);
                    }
                    else{
                        if (courseSemester==30){
                        String semester2="Summer 2";
                        System.out.println("The course was offered in the "+semester2+" semester of "+courseYear);
                        }
                        else{
                            if(courseSemester==20){
                            String semester3="Summer 1";
                            System.out.println("The course was offered in the "+semester3+" semester of "+courseYear);    
                            }
                            else{
                                if (courseSemester==10){
                                String semester4="Spring";
                                System.out.println("The course was offered in the "+semester4+" semester of "+courseYear);   
                                }
                                // ends the program if the course semester is not one of the 4 acceptable numbers
                                else{
                                System.out.println(courseSemester+" is not a legitimate semester");
                                return;
                                }
                            }
                        }
                    }
                }            
                // ends the program if the number is outside the acceptable range
                else{
                System.out.println("The number was outside the range [186510,201440]");
                return;
                }
            }
            // ends the program if the number is outside the acceptable range
            else {
            System.out.println("The number was outside the range [186510,201440]");
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