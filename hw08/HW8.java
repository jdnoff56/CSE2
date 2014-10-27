// Joseph D'Onofrio
// CSE2
// hw07-DriverProgram

// This programs primary purpose is to show a demo of how methods can be overloaded
// in a way that the method name can be used for different input types. The main method 
// doesnt do anything other than restate what the user entered and prompt for the 
// next input, this is because it is a Driver Program to test that the other methods
// are returning the correct outputs
//

// import scanner utility
import java.util.Scanner;

// create class
public class HW8 {

	// add main method
	public static void main(String[] arg) {

		char input; // declare input

		Scanner scan = new Scanner(System.in); // declare scanner

		System.out.print("Enter 'C' or 'c' to continue: "); // prompt user for input
		input = getInput(scan, "Cc"); //call the first getInput method that deals with (scanner, string)

		System.out.println("You entered '" + input + "'"); // output what the user entered

		System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); // prompt the user
		input = getInput(scan, "yYnN", 5); // call the second getInput method that deals with (scanner, string, int), fails after 5 tries for the user
										   // to input the correct character
		if (input != ' ') { // does not except ' ' as an input

			System.out.println("You entered '" + input + "'"); // ouputs what the user entered

		}

		input = getInput(scan, "Choose a digit.", "0123456789"); // calls the third getInput method that deals with (scanner, string, string)
		System.out.println("You entered '" + input + "'"); // outputs what the user entered

	}

	public static char getInput(Scanner scan, String c) { // method that checks to make sure C or c is entered, forces the user to enter numbers until
														  // the correct entry is made
		String letterOne; // declare variable for the first entered letter
		int letterOneLength; // declare variable to check for length

		int loop = 1; // controls loop
		
		do { // do-while loop because you want this to run at least once no matter what
		
			letterOne = scan.next(); // prompts the user to enter something and defines letterOne as that entry
			letterOneLength = letterOne.length(); // gets the length of the entered string

			if (letterOneLength == 1) { // checks that one character was entered

				switch (letterOne) { // checks for C/c
					case "C":
					case "c":
						loop += 10; // exits loop once necessary conditions are met
						break;
					default:
						System.out.print("You did not enter C/c, try again: "); // forces user to repeat entry if incorrect character is entered
				}

			}
			else {
				System.out.print("You should enter one character, try again: "); // forces user to repeat entry if more than one character is entered
			}
		
		} while (loop < 5) ; // conditional statement for the loop
		
		char resultOne = letterOne.charAt(0); // convery entry to a char so it can be returned to the main method
		return resultOne; // return output
	}

	public static char getInput(Scanner scan, String c, int x) { // method that checks that Y/y/N/n is entered, and forces the user to repeat
																 // entry if incorrect, up to a max 5 times
		String letterTwo; // declares variable
		int letterTwoLength; // declares variable

		int loop = 0; // controls loop
		
		do { // do-while loop because you want this to run at least once no matter what
		
			letterTwo = scan.next(); // prompts the user to enter something and defines letterTwo as that entry
			letterTwoLength = letterTwo.length(); // gets the length of the entered string
			
			if (loop < 5){ // prevents the loop from running an unlimited amount of times, fails after 5 errors

			if (letterTwoLength == 1) { // checks length of string

				switch (letterTwo) { // checks for Y/y/N/n
					case "Y":
					case "y":
					case "N":
					case "n":
						loop += 20; // exits the loop if Y/y/N/n is entered
						break;
					default:
						if (loop < 4){ // makes sure this isnt printed again after 5 failures have already happened
						System.out.print("You did not enter Y/y/N/n, try again: "); // forces user to repeat if not Y/y/N/n
						}
						loop++;// adds 1 to control variable so it will fail after 5 errors
						
				}

			}
			else {
				if (loop < 4) { // makes sure this isnt printed again after 5 failures have already happened
				System.out.print("You should enter one character, try again: "); // forces user to repeat if too many characters
				}
				loop++; // adds 1 to control variable so it will fail after 5 errors
			}
		}
		} while (loop < 5) ; // conditional statement for loop
		
		char resultTwo; // declare variable
		
		if (loop >= 20){ // initializes the result as the entered character, if Y/y/N/n was entered
			resultTwo = letterTwo.charAt(0);
		}
		else { // informs the user that they failed to enter the correct character 5 times
			System.out.println("You failed after 5 tries");
			resultTwo = " ".charAt(0); // method must return something, so after 5 failures it returns a blank char
		}
		
		return resultTwo; // return output
		
	}


	public static char getInput(Scanner scan, String c, String d) { // method that checks that a character 0-9 is entered
																	// forces user to repeat until 0-9 entered
		String letterThree;// declare variable
		int letterThreeLength; // declare variable
		
		System.out.println("Choose a digit.");
		System.out.print("Enter one of:'0','1','2','3','4','5','6','7','8','9': "); // prompt user for input

		int loop = 0; // controls loop
		
		do { // do-while loop because you want this to run at least once no matter what
		
			letterThree = scan.next(); // prompts the user to enter something and defines letterThree as that entry
			letterThreeLength = letterThree.length(); // gets the length of the entered string

			if (letterThreeLength == 1) { // checks that the input is only one character long

				switch (letterThree) { // checks for 0-9
					case "0":
					case "1":
					case "2":
					case "3":
					case "4":
					case "5":
					case "6":
					case "7":
					case "8":
					case "9":
						loop += 20; // exits loop if 0-9 is entered
						break;
					default:
						System.out.println("You did not enter an acceptable character");
						System.out.println("Choose a digit.");
						System.out.print("Enter one of:'0','1','2','3','4','5','6','7','8','9': "); // forces user to repeat if bad input
				}

			}
			else {
				System.out.println("You should enter one character, try again. ");
				System.out.println("Choose a digit.");
				System.out.print("Enter one of:'0','1','2','3','4','5','6','7','8','9': "); // forces user to repeat if bad input
			}
		
		} while (loop < 5) ; // conditional for loop
		
		char resultThree; // declare result
		
			resultThree = letterThree.charAt(0); // define the result as a char so it can be output to main method
		
		return resultThree; // return output
		

	}


}
