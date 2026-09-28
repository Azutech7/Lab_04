import java.util.Scanner;

/**
 * Program Description
 * 1) Takes in a user input of several words, with the line ending with quit
 * 2) Tests for each word: if you move the first letter to the end and spell result backwards, is it the origonal
 * 3) Prints result of does/does not work
 * 4) Asks user if they want to try another line of words
 * 
 * @author Mason Heuberger, mheuberger@student.sdccd.edu
 * @version v1.0
 * @since 2026-09-27
 */

public class ReverseWord{
    public static void main (String[] args){
      	//vars section
        String word, remaining, combined, flipped;
        char firstLetter;

		Scanner scanner = new Scanner(System.in);

      
		do{
			System.out.print("Enter words separated by a space ending with the word quit: ");
			
			while (scanner.hasNext()) {
				word = scanner.next().toLowerCase();
				

				if (word.equals("quit")) {
					break;
				}

				combined = "";
				flipped = "";
				
				firstLetter = word.charAt(0);
				remaining = word.substring(1);
				combined = remaining+firstLetter;

				for (int i = combined.length()-1; i >= 0; i--) {
					flipped += combined.charAt(i);
				}

				if (word.equals(flipped)) {
					System.out.println(word+" works");
				}
				else {
					System.out.println(word+" does not work");
				}
            }

        	System.out.print("\nEnter yes to process another line? ");
		} while (scanner.next().toUpperCase().charAt(0) == 'Y'); // == 'Y' allows more "yes" indicators like Y,y,Yea,Yeah to continue
		
    }
}
