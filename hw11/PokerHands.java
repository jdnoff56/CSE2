// Joseph D'Onofrio
// CSE2
// hw11-PokerHands
// allows the user to hand select a hand of 5 cards
// and then outputs the hand and says what it is
// in poker rules

import java.util.Scanner; // import scanner

public class PokerHands{ // add class
    
  public static void main(String [] arg){ // add main method
    
    Scanner scan = new Scanner(System.in); // construct scanner method
    
    String answer; // declare variable
    
    int[][] deck = new int[4][13]; // declare 2d array
    int j; // declare variable
    int x=0;// declare variable
    for (int i = 0;i<4;i++){ // loop, controls suit
        for (j = 0;j<13;j++){ // loop, controls rank
            deck[i][j] = j+x; // card rank within a suit
        }
        x+=13;// next array will go to next suit
    }
    
    int[] hand = new int[5]; // array for the hand drawn
    
    int[] checkRepeats = new int[5]; // array to check for repeats
    
    int[] rankFreq = new int [13]; // array to count the frequency of each rank
    
    int[] suitFreq = new int [4]; // array to count the frequency of each suit
      
    
    
    System.out.print("Enter 'y' or 'Y' if you would like to enter a hand: "); // prompt user for input
    answer=scan.next(); // gets answer from user
    
    if (answer.equals("Y") || answer.equals("y")){
        do{ // loop runs once initially, and then again as long as the user enters "y" or "Y" at the end
            
            for (int p = 0;p<5;p++){
                checkRepeats[p] = 100; // set all checkrepeats value outside the range of card numbers
            }
            
            for (int i = 0;i<rankFreq.length;i++){
                rankFreq[i] = 0; // set all freq values to 0 so cards can be drawn a second time without issues
            }
            
            for (int k = 0;k<suitFreq.length;k++){
                suitFreq[k] = 0; // set all freq values to 0 so cards can be drawn a second time without issues
            }
            
            int i = 0; // declare variable
            j = 0; // declare variable
            
            // loop that allows the user to select a hand of any 5 cards they want
            for (int k = 0; k<5;k++){
                while(true){ // infinite loop to repeat until a valid hand is entered
                    
                    System.out.print("Enter the suit: 'c', 'd', 'h', or 's': "); // prompt for suit
                    answer=scan.next();
                    
                    // if else statemeants to assign suit values to entered strings
                    if (answer.equals("c")){
                        i = 0;
                    }
                    else if (answer.equals("d")){
                        i = 1;
                    }
                    else if (answer.equals("h")){
                        i = 2;
                    }
                    else if (answer.equals("s")){
                        i = 3;
                    }
                    else {
                        System.out.println("invalid response");
                        continue; // goes back to top of loop
                    }
                
                    System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2': "); // prompt for rank
                    answer=scan.next(); // take input
                    // if else statemeants to assign rank values to entered strings
                    if (answer.equals("a")){
                        j = 0;
                    }
                    else if (answer.equals("k")){
                        j = 1;
                    }
                    else if (answer.equals("q")){
                        j = 2;
                    }
                    else if (answer.equals("j")){
                        j = 3;
                    }
                    else if (answer.equals("10")){
                        j = 4;
                    }
                    else if (answer.equals("9")){
                        j = 5;
                    }
                    else if (answer.equals("8")){
                        j = 6;
                    }
                    else if (answer.equals("7")){
                        j = 7;
                    }
                    else if (answer.equals("6")){
                        j = 8;
                    }
                    else if (answer.equals("5")){
                        j = 9;
                    }
                    else if (answer.equals("4")){
                        j = 10;
                    }
                    else if (answer.equals("3")){
                        j = 11;
                    }
                    else if (answer.equals("2")){
                        j = 12;
                    }
                
                    // checks every number in the array checkRepeats for a repeated number
                        for (int c = 0;c<5;c++){
                            if (checkRepeats[c] == deck[i][j]){ // if the card has already been selected, loop will run again 
                                System.out.println("Already entered");
                                x=50; // will not break out of the infinite loop if x is not = 100
                                break; // break out of for loop 
                            }
                            else{
                                x=100; // allows x to break out of the infinite loop
                            } 
                        }
                    
                    if (x == 100){
                        suitFreq[i]++; // count suit
                        rankFreq[j]++; // count rank
                        hand[k] = deck[i][j]; // add card to hand
                        checkRepeats[k] = deck[i][j]; // add card to repeat check
                        x=0; // reset x
                        break; // break out of infinite loop
                    }
                    
                    
                }
                
            }
            
            showOneHand(hand); // method, shows a hand
            handRank(hand,rankFreq,suitFreq); // method, evaluates hand for its rank in poker
            
            
            
            System.out.print("Enter 'y' or 'Y' for another hand: "); // prompt user to run program again
          
            answer=scan.next(); // gets answer from user
          
        }while(answer.equals("Y") || answer.equals("y")); // whole thing runs again if "y" or "Y" is entered
    }
  }
  
    public static void showOneHand(int hand[]){ // shows a hand
        System.out.println("");
        // string arrays to display the hand
    	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
    	String face[]={
           "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
      	"4 ","3 ","2 "};
    	String out="";
    	for(int s=0;s<4;s++){ // loops that establish the rank and suit of the hand and 
      	out+=suit[s];         // corresponds them to the correct string for that card
      	for(int rank=0;rank<13;rank++)
        	for(int card=0;card<5;card++)
         	if(hand[card]/13==s && hand[card]%13==rank)
          	out+=face[rank];
      	out+='\n';
    	}
    	System.out.println(out); // prints out the hand
  }
  
  public static void handRank(int[] hand, int[] rankFreq, int[] suitFreq){ // ranks the hand
      
    String out = "This is a "; // begins output, will be added to
    int x = 0;// variable to help break out of loops

    for (int i = 0;i<rankFreq.length;i++){ // if 4 of any rank, will always be a four of a kind, add to output string
        if (rankFreq[i]==4){
            out+= "Four of a Kind";
            break;
        }
        if (rankFreq[i]==3){ // if 3 of one kind...
            for (int k = 0;k<rankFreq.length;k++){
                if (rankFreq[k]==2){ // check for a pair (full house)
                    out+= "Full House"; // add to output string
                    x = 100; // helps break out of a later loop
                    break;
                }
                else {
                    x = 50; // will allow it to be recognized as a three of a kind and not a full house
                }
            }
            if (x==100){
                break;
            }
            if (x==50){ // x=50 only when theres a 3 of a kind and nothing else 
                out+="Three of a Kind"; // add to output string
                break;
            }
            
        }
        if (rankFreq[i]==2){ // if two of a rank...
            for (int k = 0;k<rankFreq.length;k++){
                if (k==i){
                    continue;
                }
                if (rankFreq[k]==2){ // check for two pair
                    out+= "Two Pair";// add to output string
                    x = 100;
                    break;
                }
                else if (rankFreq[k]==3){ // check for full house
                    out+= "Full House"; // add to output string
                    x = 100;
                    break;
                }
                else {
                    x = 50;
                }
            }
            if (x==100){ // breaks out of loop if answer has already been reached
                break;
            }
            if (x==50){ // if only one pair add to output string
                out+="One Pair";
                break;
            }
        }
        
    }
    
    int[] straightCheck = new int [5]; // array for checking for straights
    
    for (int i = 0;i<straightCheck.length;i++){
        straightCheck[i] = hand[i]%13;
    }
    
    sort(straightCheck); // sorts the hand so the ranks are always in ascending order
    // checks that each card is adjacent to each other
    if (straightCheck [0] == straightCheck [1]-1){
        if (straightCheck [1] == straightCheck [2]-1){
            if (straightCheck [2] == straightCheck [3]-1){
                if (straightCheck [3] == straightCheck [4]-1){
                    
                    out+= "Straight "; // is a straight
                }
            }
        }
    }
    
    // checks for a flush and a royal flus
    for (int i = 0; i<suitFreq.length; i++){
        if (suitFreq[i]==5){ // if 5 of one suit, flush will be added to the output
            if (straightCheck [0]%13 == 0){
                if (straightCheck [0] == straightCheck [1]-1){
                    if (straightCheck [1] == straightCheck [2]-1){
                        if (straightCheck [2] == straightCheck [3]-1){
                            if (straightCheck [3] == straightCheck [4]-1){
                                out = "This is a Royal "; // if also a straight, will be a royal flush
                                
                            }
                        }
                    }
                }
            }
            out+= "Flush";
        }
    }

    if (out.equals("This is a ")){ // if there is nothing, is a high card
        out+= "High Card";
    }
    
      
    System.out.println(out); // output
      
  }
  
  public static int[] sort(int[] straightCheck){ // sorts an array into ascending order
      
      int temp = 0; // temp variable for holding a value
      
      for (int i = 0; i < straightCheck.length;i++){
          if (i>0){
              if (straightCheck[i-1]>straightCheck[i]){ // if a value is smaller than the previous one, swap the values and restart from the beginning
                  
                temp = straightCheck[i-1];
                straightCheck[i-1] = straightCheck[i];
                straightCheck[i] = temp;
                i=0;// restart loop after every swap
              }
          }
      }
      
      return straightCheck;
      
  }
}