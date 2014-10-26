// Joseph D'Onofrio
// CSE2
// lab09-Methods

// 
//

import java.util.Scanner;

public class Methods{
    
    public static void main(String [] arg){
      
    Scanner scan=new Scanner(System.in);
    
    int a,b,c;
    
    System.out.println("Enter three ints");
    a=getInt(scan);
    b=getInt(scan);
    c=getInt(scan);
    
    System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
    
    System.out.println("The larger of "+a+", "+b+", and "+c+
                       " is "+larger(a,larger(b,c)));
                       
    System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                       ", and "+c+" are in ascending order");
  }
  
  public static int getInt(Scanner scan){
        
        scan=new Scanner(System.in);
        
        System.out.print("Enter an int: ");
        
        while (!scan.hasNextInt()) {
                
                scan.next();    
            
                System.out.print("You did not enter an int, try again: ");
        }
        
        int enteredNum = (scan.nextInt());
            
        return enteredNum;
    }
 
  
  public static int larger(int a, int b){
      
      int output;
      
      if (a > b) {
          output = a;
      }
      else {
          output =  b;
      }
     return output; 
  }
  
  public static boolean ascending(int a, int b, int c){
    
    boolean result;  
    
    if (c>b && b>a){
        result = true;
    }
    else {
        result = false;
    }
    return result;
      
  }
  
  
}
