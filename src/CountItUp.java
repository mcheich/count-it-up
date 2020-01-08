import java.util.Scanner;

public class CountItUp {

	public static void main(String[] args) {
		
		/*  Count it up
		   	Ask the user for a number. 
			Display a count from 0 up to the number in your output.

			Examples
			Enter a number:
			8

			0 1 2 3 4 5 6 7 8
			I just counted to 8!
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive number.");
		
		
	}

	public static String countUp(int num) {
		
		int counter = 1;
		String output = "0";
		
		while(counter <= num) {
			output += " " + Integer.toString(counter);
			counter++;
		}
		return output;

	}

}
