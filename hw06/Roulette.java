// Joseph D'Onofrio
// CSE2
// hw06-Roulette

// tests a roulette strategy based on placing $1 bets on the same number for 100 rolls. This program runs the 
// 100 roll trial 1000 times, and outputs total complete losses (100 rolls without the number being hit), the number 
// of times a profit was made on a 100 roll trial, and the total profit/loss on all 1000 trials
//


// Create Class

public class Roulette {
    
    //Add Main Method
    
    public static void main (String [] args) {
    
        
        int totalLosses = 0; // variable for counting total money lost
        int totalWinnings = 0; // variable for counting total money won
        int numWins = 0; // variable for number of times a profit is made
        int numLosses = 0; // variable for number of complete losses
        
        
        // loop that repeats the 100 spin trial a thousand times
        int loopOne = 0;
        while (loopOne <= 1000){
        
            int hitCounter = 0; // variable for number of times the random number is equal to the number bet on
        
            // loop to repeat a roulette spin 100 times
            int loopTwo = 0;
            while (loopTwo <= 100){
            
                int randomNum = (int) ((Math.random()*38)+1); //Selects random number between 1-38, acts as roulette roll
            
                if (randomNum == 15) {
                    hitCounter++; // counts number of times random number is equal to the number bet on
                    totalWinnings += 36; // adds 36 dollars to the total winnings for everytime the bet succeeds
                }
                else {
                   totalLosses += 1; // adds 1 dollar to the total amount lost for everytime the bet does not succeed
                }
                loopTwo++;
            }
            // if the number bet on was hit 0 times, counts up total losses
            if (hitCounter == 0){
                numLosses++;
            }
            // if the number bet on was hit 3 or more times, a profit was made and this instance is counted up
            if (hitCounter >= 3){
                numWins++;
            }
            loopOne++; 
        }
        // prints out result
        System.out.println("Number of complete losses: "+numLosses);
        System.out.println("Number of times a profit was made: "+numWins);
        System.out.println("Total profit made: $"+(totalWinnings-totalLosses));
    }    
}        