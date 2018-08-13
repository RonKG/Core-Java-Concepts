package perScholasPackage;
/*
 1. Write a program to sort an array in ascending order and print
 the smallest and the largest element of the array
 */

import java.util.Arrays;
import java.util.Random;

public class BubbleArraySort {

	public static void main(String[] args) {
		sortArray(createArray(20));
	}

	// sort array using recursively
	public static void sortArray(int[] arr) {
		System.out.println(Arrays.toString(arr));

		// declare variables.
		int i;
		int j = 0;
		int temp = 0;

		while (j < arr.length - 1) {
			// iterate the array
			for (i = 0; i < arr.length - 1; i++) {
				// compare values at i and i+1
				if (arr[i] > arr[i + 1]) {
					// if i+1 is larger, hold in temp
					temp = arr[i];
					// move i+1 to i
					arr[i] = arr[i + 1];
					// unload temp to i+1
					arr[i + 1] = temp;
				}
			}
			j++;
			// stem.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}

	// method to create integer array with random integers
	public static int[] createArray(int size) {
		// initiate the array
		int[] arr = new int[size];
		// populate the array with random numbers
		for (int i = 0; i < arr.length; i++) {
			arr[i] = generateRandom(1, 100);
		}
		return arr;
	}

	// generate random numbers between (x,y)
	public static int generateRandom(int min, int max) {
		Random r = new Random();
		// max - min + 1 will create a number in the range of min and max,
		// including max.
		return r.nextInt(max - min + 1) + min;

	}
}
