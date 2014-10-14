/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;

public class Enigma0{
    
  public static void main(String arg []){
      
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    
    if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
      
      int k=4,p=6,q=7,r=8;
      
      switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
    }
    else{
      System.out.println("You did not enter an int");
    }
  }
}

/*  Error report
    
    Error 1: variable n is not initialized on line 32
        Fix: Move the switch and all variable declarations into the if statement scope. This can be within the if statement
             because if the user does not enter an int the program shouldn't output anything (would be a logic error).
             also remove n; from the end of the variable declarations to avoid declaring it twice
             
        
    Error 2: logic error, if the input number is not an integer, it should not set n=4 and outprint "you entered n"
        Fix: remove int n=4; and change the output to "you did not input an int"
    
    
 */