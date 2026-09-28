import java.util.Scanner;

/**
 * Program Description
 * 1) Asks a user for a target width (and adjusts it to make it odd, if needed)
 * 2) Draws a diamond-shaped star based on the target width
 * 
 * @author Mason Heuberger, mheuberger@student.sdccd.edu
 * @version v1.0
 * @since 2026-09-27
 */

public class Stars{
    public static void main (String args[]){
        //vars section
        int width, line, spaces, stars;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter max width for stars: ");
        width = scanner.nextInt();
        System.out.println(); // just to make it look a little nicer, adding in a gap

        if (width % 2 == 0)
        	width++;
        
        // top half
        for (line=1, spaces=width/2; line<=width/2+1; line++, spaces--) {
            for (int i=1; i<=spaces; i++) {  //this is for spaces
                System.out.print(" ");
            }
            for (stars=1; stars<=line*2-1; stars++) {  //this is for stars
                System.out.print("*");
            }
            System.out.println();  //this gets to next line
        }

        // bottom half
        for (line=width/2, spaces=1; line>0; line--, spaces++) {  //lines start one less than largest line in top half, go down, based on width
            for (int i=1; i<=spaces; i++) {  //this is for spaces
                System.out.print(" ");
            }
            for (stars=1; stars<=line*2-1; stars++) {  //this is for stars
                System.out.print("*");
            }
            System.out.println();  //this gets to next line
        }
    }
}
