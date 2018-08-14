/*
1. Write a program that uses while loop and print out the following sequence
Seq2- 5, 45, 405, 3645
 */

package perScholasPackage;

public class Sequence2 {
	public static void main(String[] args) {
		int multiple = 5;
		for (int i = 0; i < 4; i++) {
			System.out.println("Number: " + multiple);
			multiple = multiple * 9;
		}
	}
}
