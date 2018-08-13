package perScholasPackage;

import java.util.Scanner;

public class GetWeekday {

	public static int getInput() {
		Scanner myScanner = new Scanner(System.in);
		int input = 0;
		try {

			System.out.println("Enter number between 1 and 7 (-1 to quit): ");
			input = myScanner.nextInt();

		} catch (Exception e) {
			System.out.println("Numbers MUST be between 1 & 7\n" + ".......Exiting program");
			System.err.println();

			myScanner.close();
		}
		return input;

	}

	public static String checkInput(int input) {
		String result;
		switch (input) {
		case 1:
			result = "The number " + input + " is Monday";
			break;
		case 2:
			result = "The number " + input + " is Tuesday";
			break;
		case 3:
			result = "The number " + input + " is Wednesday";
			break;
		case 4:
			result = "The number " + input + " is Thursday";
			break;
		case 5:
			result = "The number " + input + " is Friday";
			break;
		case 6:
			result = "The number " + input + " is Saturday";
			break;
		case 7:
			result = "The number " + input + " is Sunday";
			break;
		default:
			result = "Invalid Entry :(";
		}
		return result;
	}

	public static void main(String[] args) {
		int input;
		do {
			input = getInput();
			System.out.println(checkInput(input));
			} 
		while (input != -1);
	}
}
