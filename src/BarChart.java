import java.util.Random;

/**
 * Program Description
 * 1) Generates 3 random numbers 0-999 (and prints them on screen)
 * 2) Prints a title for the bar graph
 * 3) Generates a bar graph with 1 asterisk per 100
 * 4) If a number is less than 100 (therefore no asterisk), then it prints less than 100 no stars on that line
 *
 * @author Mason Heuberger, mheuberger@student.sdccd.edu
 * @version v1.0
 * @since 2026-09-27
 */
public class BarChart{
    public static void main (String[] args) {
        //vars section
        int first, second, third;
        Random rand = new Random();

        first = rand.nextInt(1000);
        second = rand.nextInt(1000);
        third = rand.nextInt(1000);
        
        //Print out numbers
        System.out.println("Number 1 is: "+first);
        System.out.println("Number 2 is: "+second);
        System.out.println("Number 3 is: "+third);
        
        System.out.println("\nNUMBER BAR CHART");

		// Bar Chart
		System.out.print("Number 1: ");
		printStars(first);

		System.out.print("Number 2: ");
		printStars(second);

		System.out.print("Number 3: ");
		printStars(third);
        
    }

    /**
     * Accepts int input and prints stars
     * @param input - number of stars to print out
     */
    public static void printStars(int input){
        if (input<100)
            System.out.println("<100 no stars");
        else {
        	for (int i = input/100; i > 0; i--) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
    }
    
}
