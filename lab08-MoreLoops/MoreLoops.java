// Joseph D'Onofrio
// CSE2
// lab08-MoreLoops

import java.util.Scanner;

public class MoreLoops {
    
    public static void main(String[] arg){
        
    Scanner scan=new Scanner(System.in);
    
    // Start replacement loop//////////////////////////////////
    int n;
    
    System.out.print("Enter an int: ");
    
    if (scan.hasNextInt()) { // check for int
    }
    else { // if not an int run loop
        do {
            scan.next(); //get rid of the junk entered by user
        
            System.out.print("You did not enter an int; try again: ");
        }
        while (!scan.hasNextInt());
    }
    /*
    int n=0;

    System.out.print("Enter an int- ");
    
    while(!scan.hasNextInt()){
        
        scan.next(); //get rid of the junk entered by user
        
        System.out.print("You did not enter an int; try again- ");
    }
    */
    
    //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A
    //DO-WHILE LOOP
    
    // start replacement loop///////////////////////////////////
    n=scan.nextInt();
    
    int j = 0;
    
    int controlNum = 1; // variable that controls the upper limit of the inner loop, which decides how many stars will be on a line
        int loopLoop1 = 0; // variable for controlling the number of times the outer loop repeats
        while (loopLoop1 < n) {
                    
        int loopLoop0 = 0;
        while (loopLoop0 < controlNum) {
                        
            System.out.print("*");
            loopLoop0++; // adds 1 to lower limit of inner loop, controls how many times the inner loop will repeat
                        
            }
                    
            System.out.println(" "); // goes to the next line after number of stars is determined for the current line
            loopLoop1++; // adds 1 to lower limit of outer loop, controls how many times the outer loop will repeat
            controlNum++; // adds 1 to the upper limit of the inner loop, controls how many stars will print on a single line
                
            }
    
    /* 
    for(j=0;j<n && j<40;j++){
        
        for(int k=0;k<j+1;k++){
            
        System.out.print('*');
        
        }
        
        System.out.println();
    
    }
    */
    
    //COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH
    //WHILE STATEMENTS
    
    // start replacement loop //////////////////////////////
    int k=4;

    while (k<=4) {
        System.out.println("k="+k);
        k++;
    }
    
    /*
    int k=4;
    do{
        System.out.println("k="+k);
        k++;
    }
         while(k<4);
    */
    
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
    //WITH A WHILE LOOP
        
    for (int count =0; count <10; count++)  {
        if (n==1 || n==2) {
            
            for (int x=0; x >= 0; x++) {
            System.out.print("Case 2 ");
            }
        }
        else if (n==3) {
            break;
        }
        else if (n==4) {
            System.out.println("Case 4");
            System.out.println("Case 5");
        }
        else if (n==5) {
            System.out.println("Case 5");
        }
        else {
            System.out.println(n + " is > 5 or <1");
        }
    }
    
    
    
        /*
        int count=0;
        while(true){
        switch(n){
        default: System.out.println(n + " is > 5 or <1");
        break;
        case 1:
        case 2: System.out.print("Case 2 ");
        continue;
        case 3: break;
        case 4: System.out.println("Case 4");
        case 5: System.out.println("Case 5");
        break;
        }
        count++;
        if(count>10)
        break;
    }
        */
    
    //COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE USING
    // ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
    //RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G.,
    //   -5, 1, 20, 5, ETC.
    //IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY
    //SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
   
    }
}