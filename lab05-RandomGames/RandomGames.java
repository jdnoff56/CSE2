// Joseph D'Onofrio
// CSE2
// lab05-RandomGames

// prompts the user to select one of three games involving random numbers 
// Roulette (R/r) shows the result of a roulette game, a random number 00 or 0-36
//

// import scanner utility

import java.util.Scanner ;

// Create Class

public class RandomGames {
    
    //Add Main Method
    
    public static void main (String [] args) {
        
        Scanner myScanner ; // declare scanner variable
        myScanner=new Scanner(System.in) ; // call the scanner constructor  
        
        System.out.print("Enter R/r for Roulette, C/c for craps, P/p for pick a card: "); // prompt the user for input
        
        String gameSelect=myScanner.next(); // 
        int foodSelectLength=gameSelect.length();
        
        if (foodSelectLength==1){
        
        switch (gameSelect){
            case "C":
            System.out.println(gameSelect);
            break;
            case "c":
            System.out.println(gameSelect);
            break;
            case "R":
                
            int numberRandom=(int)((Math.random()*28)+10);  
            
                switch (numberRandom) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    System.out.println("The number is: "+numberRandom);
                    break;
                    case 37:
                    System.out.println("The number is: 0");
                    break;
                    case 38:
                    System.out.println("The number is: 00");
                    break;
                    
                
            }
            
            break;
            case "r":
            
            int numberRandom1=(int)((Math.random()*28)+10);  
            
                switch (numberRandom1) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    System.out.println("The number is: "+numberRandom1);
                    break;
                    case 37:
                    System.out.println("The number is: 0");
                    break;
                    case 38:
                    System.out.println("The number is: 00");
                    break;
                }    
            break;
            case "P":
            System.out.println(gameSelect);
            break;
            case "p":
            System.out.println(gameSelect);
            break;
            default:
            System.out.println("you did not input C/c/R/r/P/p");
        }
        
        }
        else{
        System.out.println("A single character expected");
        }
    }        
}