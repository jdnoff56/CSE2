// Joseph D'Onofrio
// CSE2
// hw10-FindDuplicates

// prompts the user to enter 10 integers which will be stored in an array
// this array is then evaluated with two methods to determine if it
// has any duplicates, and then if it has exactly one duplicate
// the results of these evaluations are output in sentence form
//

import java.util.Scanner; // import scanner utility

public class FindDuplicates{ // add class
    
  public static void main(String [] arg){ // add main method
      
    Scanner scan=new Scanner(System.in); // declare and initialize scanner utility
    
    int num[]=new int[10]; // declares and allocates array "num"
    
    String answer=""; // creates empty string, "answer" will store the users response to whether they want to repeat the program or not
    
    do{ // loop runs once initially, and then again as long as the user enters "y" or "Y" at the end
        
      System.out.print("Enter 10 ints- "); // prompt user for 10 ints
      
      for(int j=0;j<10;j++){ // loop that allows for 10 numbers to be entered
        num[j]=scan.nextInt(); // array, stores each entered number as a variable within the array
      }
      
      String out="The array "; // begins the string "out" which will be used to store words related to the outcomes of each method
                               // to create the final output sentences
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      
      if(hasDups(num)){ // if "hasDups" returns true (the 10 entered numbers had at least 1 duplicate)
        out+="has ";    // then add the word "has" to the string "out"
      }
      else{             // if "hasDups" returns false, adds the words "does not have" to the string "out"
        out+="does not have ";
      }
      
      out+="duplicates."; // adds "duplicates." to the string "out" (this will always be added regardless of method result)
      
      System.out.println(out); // output setence that says if the entered numbers had at least one duplicate
      
      out="The array "; // begins another sentence that will say whether the entered numbers had exactly one duplicate
      
      out+=listArray(num);  // displays all entered numbers in the form "{#,#,#}"
      
      if(exactlyOneDup(num)){ // if "exactlyOneDup" returns true (the 10 entered numbers had only 1 duplicate)
        out+="has ";          // then add the word "has" to the string "out"
      }
      else{                   // if "exactlyOneDup" returns false, adds the words "does not have" to the string "out"
        out+="does not have "; 
      }
      
      out+="exactly one duplicate."; // adds "exactly one duplicate." to the string "out" (this will always be added regardless of method result)
      
      System.out.println(out);  // output setence that says if the entered numbers had only one duplicate
      
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); // prompt user to run program again
      
      answer=scan.next(); // gets answer from user
      
    }while(answer.equals("Y") || answer.equals("y")); // whole thing runs again if "y" or "Y" is entered
  }

  public static String listArray(int num[]){  // method that lists the entered numbers in string form 
                                              // so that it can be place in the output sentence
    String out="{"; // beginning bracket, entered numbers will become strings and added to this bracket
    
    for(int j=0;j<num.length;j++){ // loop that goes through each number entered and converts it to a string by adding it to "out"
         
      if(j>0){  // no comma needed until after the first number
        out+=", "; // adds commas
      }
      out+=num[j]; // casts the currently accessed number of the array to a string and adds it to the output string
    }
    
    out+="} "; // closes the bracket
    return out; // returns whole array as a string in form "{#,#,#}"
  }
  
  public static boolean hasDups(int[] num){ // method that checks if the entered numbers have at least one duplicate
    
    boolean result = false; // default result, if the search cant find a duplicate, the result will be returned as false
    int i; // variable used to control loop and which spot in the array is being accessed
    int j; // variable used to control loop and which spot in the array is being accessed
    int x = 0; // used to make sure comparisons are not repeated and that num[i] isnt ever compared to itself
    
    for (i=0;i<(num.length-1);i++){      // these two loops compare every number in the array to every other number in 
                                         // the array exactly once. it doesnt repeat comparisons or compare the same location
      for (j=1;j<num.length-x;j++){     // in the array to itself. if it finds a duplicate, result = true.
        if(num[i]==num[j+x]){
          result = true;
        }
      
      }
      x++; // reduces number of comparisons the next round makes by 1 to prevent repeats

    }
    
    return result; // returns boolean result
    
  }
  
  public static boolean exactlyOneDup(int[] num){ // method that checks if the entered numbers have only one duplicate
    
    boolean result = false; // default result is false, if the search finds no duplicates or more than one, result will stay false
    int i;// variable used to control loop and which spot in the array is being accessed
    int j;// variable used to control loop and which spot in the array is being accessed
    int x = 0; // used to make sure comparisons are not repeated and that num[i] isnt ever compared to itself
    int count = 0; // counts number of duplicates in the array
    
    for (i=0;i<(num.length-1);i++){ // these two loops compare every number in the array to every other number in 
                                    // the array exactly once. it doesnt repeat comparisons or compare the same location
      for (j=1;j<num.length-x;j++){ // in the array to itself. if it finds a duplicate, count increases by 1.
        if(num[i]==num[j+x]){
          count++;
        }
      
      }
      x++; // reduces number of comparisons the next round makes by 1 to prevent repeats

    }
    
    if (count == 1){ 
      result = true;  // result only returns true if there was a single duplicate.
    }                 // will return false if 0 or more than 1 duplicate.
    
    return result; // return boolean result
  }
  
}

