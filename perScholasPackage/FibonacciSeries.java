/*
 Write a program that print Fibonacci series and 
 print the addition of the elements in Fibonacci series.
 
 The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...

 */

package perScholasPackage;

public class FibonacciSeries {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		int len = 10;
		
		System.out.println("   Fib Series\n"
							+ "----------------\n"
						    + "Index #    Fib #");
		
		for (int k = 0; k < len; ++k) {
			System.out.println("  " + k + "          " + i); // print i before + operation  (++)
			int sum = i + j;                                 // store i + j in sum			
			i = j;                                           // move the value of j to i
			j = sum;                                         // move the value of sum to j

	        }
		}
	}


