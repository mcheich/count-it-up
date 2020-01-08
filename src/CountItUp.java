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
		
		int userInput = getInput();
		String count = countUp(userInput);
		System.out.println(count);
		
		/* I am tempted to put the above all on one line:
		 * 
		 * System.out.println(countUp(getInput()));
		 */
		
	}

	public static String countUp(int num) {
		
		int counter = 1;
		String output = "0";
		
		while(counter <= num) {
			output += " " + Integer.toString(counter);
			counter++;
		}
		System.out.println("I counted to " + num);
		return output;

	}

	public static Integer getInput() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive number.");
		int output = input.nextInt();
		input.close();
		
		return output; 

	}

}
