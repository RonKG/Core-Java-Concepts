/*
 Exercise  one: 
 ---------------------------------------- 
 Given two sorted Arrays of the size N, create a program 
 that creates a third sorted Array of size N and populates the third array 
 whenever there is a value that exist in both of the giving Arrays, at the same index. 
 */

package perScholasPackage;

// import needed modules
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

// declare class
public class CommonArrayValues 
{
	// initialize random integer generator
	private static Random r = new Random();

	// method to create integer array with random integers
	public static int[] createArray(int size) 
	{
		// initiate the array
		int[] arr = new int[size];
		// populate the array with random numbers
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = generateRandom(1, 10);
		}
		// sort created array descending
		Arrays.sort(arr);
		//return sorted array
		return arr;
	}

	// generate random numbers between (x,y)
	public static int generateRandom(int min, int max) 
	{
		// max - min + 1 will create a number in the range of min and max, 
		// including max.
		return r.nextInt(max - min + 1) + min;
	}

	// get the Length of longer array of the two arrays
	public static int getlongerArrLen(int arr1[], int arr2[]) 
	{
		int len = 0;
		if (arr1.length < arr2.length) 
		{
			len = arr1.length;
		} else {
			len = arr2.length;
		}
		// return length of shorter array
		return len;
	}

	// method to compare arrays and return common items
	public static int[] getCommon(int arr1[], int arr2[]) 
	{
		int i = 0;
		int k = getlongerArrLen(arr1, arr2);
		int[] arr4 = new int[k];
		// appends values that exist in both arrays to new array
		for (int j = 0; j < k; j++) 
		{
			if (arr1[j] == arr2[j]) 
			{
				arr4[i] = arr1[j];
				i++;	
			}
		}
		// lambda function to clean up array
		int[] arr5 = IntStream.of(arr4).filter(m -> m != 0).toArray();
		// return new array with common integers at
		// common index #
		return arr5;
	}

	// clean main method
	public static void main(String[] args) 
	{
		int[] array1 = createArray(20);
		int[] array2 = createArray(30);
		int[] array3 = getCommon(array1, array2);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));

	}
}
