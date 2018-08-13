/*
 2. Write a program that uses for loop and prints out the following sequence

Seq1- 1 , 6, 36, 216, 1296, 7776
 */

package perScholasPackage;

public class Sequence1 {
	public static void main(String[] args) {
		int multiple = 1;
		for (int i = 0; i < 6; i++) {
			System.out.println("Number: " + multiple);
			multiple = multiple * 6;
		}
	}
}
