/*
 Write a program that accepts two integers and returns all the available 
 palindromes within that input number range. (The first input number would 
 be the lower limit and the second input number would be the upper limit)
 */

/*
 * range.forEach(lstitem->System.out.println(lstitem)); // lambda to print java
 * list System.out.println(Arrays.toString(range.toArray()));
 * System.out.println(range.get(0)); //get item at index
 * System.out.println(range.size()); //length
 * 
 * 
 * 
 * 		int n, m, a = 0, x;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number:");
		n = s.nextInt();
		m = n;
		while (n > 0) {
			x = n % 10;
			a = a * 10 + x;
			n = n / 10;
		}
		s.close();
		if (a == m) {
			System.out.println("Given number " + m + " is Palindrome");
		} else {
			System.out.println("Given number " + m + " is Not Palindrome");
		}
 */
package perScholasPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int first = sc.nextInt();
		System.out.println("Enter second integer thats higher than the first: ");
		int second = sc.nextInt();
		sc.close();

		// get all numbers between first and second and store into pDrome array
		List<Integer> range = IntStream
								.rangeClosed(first, second)
								.boxed()
								.collect(Collectors.toList());
		
		// show range between user inputs
		// System.out.println(Arrays.toString(range.toArray()));
		
		// loop to check palendrome for every number
		List<String> hasPalendrome = new ArrayList<String>();
		for (int i = 0; i < range.size(); i++) {
			if (checkPalindrome(Integer.toString(i)) 
				&& 
				Integer.toString(i).length() > 1) {
				hasPalendrome.add(Integer.toString(i));
			}
		}
		System.out.println("List of available palindrome in the range between\n" 
							+ first + " and " + second
							+ hasPalendrome.toString());
	}

	public static boolean checkPalindrome(String myString) {
		// reverse the given String
		String reverse = new StringBuffer(myString).reverse().toString();
		// check whether the string is palindrome or not
		if (myString.equals(reverse))
			return true;
		else
			return false;
	}
}
