/*
3. Write a method that takes two arguments (String and a char) and returns 
the number of times the char occurs in the string.  If the char is not found , 
print a message “character not found”.
Write a program that will be validating if a String input is of valid password format. 
Here are some requirements outlined below to properly indicate a “valid password”.
 
Validation Rules
    • String should start with a “A-F” character
    • Total length of the String should be greater than 7 characters.
    • There should be presence of a special symbol of the following special symbol &,$
    • These 7 characters can include digits “0-9”
    • String should end with a ‘#’ character.
*/

package perScholasPackage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
	public static String getPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" new Passwords must contain \n"
				+ " start with A-F,\n 1-9,\n contain &$, \n length>7, \n end with #\n\n" + "Enter Password");
		String pass = sc.nextLine();
		sc.close();
		return pass;
	}

	public static void checkString(String pass) {
		String str = pass;

		Pattern letter = Pattern.compile("^[A-Fa-f]");
		Pattern digit = Pattern.compile("[0-9]");
		Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");

		Matcher hasLetter = letter.matcher(str);
		Matcher hasDigit = digit.matcher(str);
		Matcher hasSpecial = special.matcher(str);

		if ((str.length() >= 7) && hasLetter.find() && hasDigit.find() && hasSpecial.find()) {
			System.out.println("valid password");
		} else {
			System.out.println("invalid password, character not found");
		}
	}

//--------------------------------------------------------------------------------------------
	
	
	public static void main(String[] args) {
		checkString(getPassword());
	}
}
