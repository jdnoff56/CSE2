// Joseph D'Onofrio
// CSE2
// hw10-PokerOdds
// 

import java.util.Random; // import random
import java.util.Scanner; // import scanner

public class PokerOdds{ // add class
    
  public static void main(String [] arg){ // add main method
      
    showHands(); // call method
    simulateOdds(); // call method
    
  }
  
  public static void showHands(){ // method that will generate a hand of 5 cards and repeat as long as the user wants it to

      Random rnd = new Random(); // construct random method
      Scanner scan = new Scanner(System.in); // construct scanner method
      String[] pokerDeck = new String [52]; // array that will contain "a deck of cards"
      
      int i = 0; // declare variable for use in loop
      int suits; // declare variable to control loop
      for (suits=0;suits<4;suits++){// loops the card ranks to account for different suits
          
          // assigns the card rank within each suit
          pokerDeck[i]= "A";
          pokerDeck[i+1]= "K";
          pokerDeck[i+2]= "Q";
          pokerDeck[i+3]= "J";
          pokerDeck[i+4]= "10";
          pokerDeck[i+5]= "9";
          pokerDeck[i+6]= "8";
          pokerDeck[i+7]= "7";
          pokerDeck[i+8]= "6";
          pokerDeck[i+9]= "5";
          pokerDeck[i+10]= "4";
          pokerDeck[i+11]= "3";
          pokerDeck[i+12]= "2";
          i+=13; // adds 13 to i to account for the next suit
          
      }
      
      String [] hand = new String [5]; // array that contains one hand of cards
      
      int pokerHand; // declare variable 
      int random = 0;// declare variable, holds random number
     
      String answer; // for the prompt at the end
      int[] checkRepeats = new int [5]; // array that holds the int value of every card selected for comparison to prevent repeats
      
      
      do { // do while loop, should run at least once
      int j = 0; // int used in the checking of repeats
      
      // Strings for displaying the hand, will be added to to display hand
      String clubs = "Clubs: ";
      String diamonds = "Diamonds: ";
      String hearts = "Hearts: ";
      String spades = "Spades: " ;
      
      // sets checkrepeats to a value outside the range 0-51 
      for (int k = 0;k<5;k++){
        checkRepeats[k]=100;
      }
      
        
        for (pokerHand = 0; pokerHand < 5; pokerHand++){
        
          
          random = rnd.nextInt(52); // generate random number between 0-51
          
          // checks every number in the array checkRepeats for a repeated number
          // if a repeat is found, generates a new random until it is not a repeat
          if (j>0){
            for (int c = 0;c<5;c++){
              while (true){
                if (checkRepeats[c] == random){
                    random = rnd.nextInt(52);
                    //System.out.println("rerolled random: "+random);
                }
                else{break;} // break infinite loop when number is not a repeat
              }
            }
          }
          
          hand[pokerHand]=pokerDeck[random]; // sets the current index of hand as the card corresponding to the randomly generated number
          
          if (random <= 12){
            clubs+=hand[pokerHand]; // sets the card as a club if its in 0-12
            clubs+=" "; // adds a space
          }
          if (random > 12 && random <= 25){
            diamonds+=hand[pokerHand]; // sets the card as a diamond if its in 13-25
            diamonds+=" "; // adds a space
          }
          if (random > 25 && random <= 38){
            hearts+=hand[pokerHand]; // sets the card as a heart if its in 26-38
            hearts+=" "; // adds a space
          }
          if (random > 38 && random <= 51){
            spades+=hand[pokerHand]; // sets the card as a spade if its in 39-51
            spades+=" "; // adds a space
          }
          
          checkRepeats[j]=random; // adds the number to the check repeat array
          
          j++; // adds 1 to j
          
        }
          // output: displays the hand of cards
          System.out.println(clubs);
          System.out.println(diamonds);
          System.out.println(hearts);
          System.out.println(spades);
      
          System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); // prompt user to run program again
      
          answer=scan.next(); // gets answer from user
      
    }while (answer.equals("Y") || answer.equals("y")); // whole thing runs again if "y" or "Y" is entered)  
  }
  
  public static void simulateOdds(){ // method that will simulate the odds of getting exactly one pair of a card for 10000 hands
      
      Random rnd = new Random(); // construct random
      
      
      int i = 0; //declare variable
      int pokerHand; //declare variable
      int random = 0; //declare variable, stores random number

      int[] checkRepeats = new int [5]; // checks for repeats
      
      int [] pairs = new int [13]; // stores number of pairs for each rank
        
      int nonPairs = 0; // counter for non pairs
      
      int [] handRanks = new int [5]; // array to hold the ranks of the 5 cards in the hand
      
      
      int alot;
      for (alot=0;alot<10000;alot++){ // simulates 10000 hands
        
      int j = 0; // declare variable
      
      for (int k = 0;k<5;k++){
        checkRepeats[k]=100; // sets all values of array to number outside the range 0-51
      }
      for (int k = 0;k<5;k++){
        handRanks[k]=100; // sets all values of array to number outside the range 0-51
      }
      
        // loop that generates a hand of cards, accounting for repeats
        for (pokerHand = 0; pokerHand < 5; pokerHand++){
          
          random = rnd.nextInt(52); // generate random number between 0-51;
          
          // checks for repeats
          if (j>0){
            for (int c = 0;c<5;c++){
              while (true){
                if (checkRepeats[c] == random){
                    random = rnd.nextInt(52);

                }
                else{break;}
              }
            }
          }
          
          checkRepeats[j]=random; // stores each drawn card for comparison to avoid repeats
          handRanks[j]=random%13; // gets the rank of each drawn card
          j++;
          
        }
         
        int x = 0; // declare variabke
        
        if(FindDuplicates.exactlyOneDup(handRanks)){ // if there is only one duplicate, finds out what rank the duplicate was
            
            for (i=0;i<(handRanks.length-1);i++){ // these two loops compare every number in the array to every other number in 
                                                  // the array exactly once. it doesnt repeat comparisons or compare the same location
              for (j=1;j<handRanks.length-x;j++){ // in the array to itself. if it finds a duplicate, count increases by 1.
                if(handRanks[i]==handRanks[j+x]){
                  pairs[handRanks[i]]+=1;
                }
                
      
              }
              x++; // reduces number of comparisons the next round makes by 1 to prevent repeats

            }
            
          
        }
        else {nonPairs++;} // increases nonpairs counter if not exactly one pair
        
        
        
      }
    
    // output
    System.out.println("rank     freq of exactly one pair");  
    System.out.println(" A          "+pairs[0]);  
    System.out.println(" K          "+pairs[1]);  
    System.out.println(" Q          "+pairs[2]);  
    System.out.println(" J          "+pairs[3]);  
    System.out.println(" 10         "+pairs[4]);  
    System.out.println(" 9          "+pairs[5]);  
    System.out.println(" 8          "+pairs[6]);  
    System.out.println(" 7          "+pairs[7]);  
    System.out.println(" 6          "+pairs[8]);  
    System.out.println(" 5          "+pairs[9]);  
    System.out.println(" 4          "+pairs[10]);  
    System.out.println(" 3          "+pairs[11]);  
    System.out.println(" 2          "+pairs[12]);  
    System.out.println("--------------------------");  
    System.out.println("total not exactly one pair: "+nonPairs);  
      
      
      
      
  }
  
}