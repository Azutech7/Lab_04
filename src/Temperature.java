import java.util.Scanner;

/**
* Program Description
* 1) Asks user for a number and a unit (C,c,F,f) i.e. 100 C
* 2) If an invalid unit is given, it asks again
* 3) Converts the temperature to the other unit and prints it out
* 4) Asks if the user wants to convert any more values
* 5) Repeats or ends depending on response (Yes,yes,Y,y,No,no,N,n) to question
*
* @author Mason Heuberger, mheuberger@student.sdccd.edu
* @version v1.0
* @since 2026-09-27
*/

public class Temperature{
    public static void main (String[] args){
        //vars section
        double inputTemp, output;
        char inputUnit;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Enter a whole number, a space, and C or F (ie 100 F converts to Cels): ");
            inputTemp = scanner.nextDouble();
            inputUnit = scanner.next().toUpperCase().charAt(0);

            while (inputUnit != 'C' && inputUnit != 'F') {
            	System.out.print("Enter C to convert to F or vice versa: ");
            	inputUnit = scanner.next().toUpperCase().charAt(0);
            }

            if (inputUnit == 'F') {
				output = (inputTemp - 32) * (5.0/9);
				System.out.printf("%sF converted is: %.1fC%n", inputTemp, output);
			} 
			else {
            	output = inputTemp * (9/5.0) + 32;
            	System.out.printf("%sC converted is: %.1fF%n", inputTemp, output);
			}
            
			System.out.print("Do you want to calculate another temp? If so, enter yes otherwise no: ");
        } while (scanner.next().toUpperCase().charAt(0) == 'Y');
        
    }
}
