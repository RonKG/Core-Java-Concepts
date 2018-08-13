package perScholasPackage;
import java.util.Arrays;
import java.util.Random;

/*
 Exercise Two: Write a java program to find second largest number in an integer array?
 */

public class SecondLargestInt 
{
	public static int getSecondLargest(int [] arr)
	{
		System.out.println(Arrays.toString(arr));
		// Keep track of values
		int largest = Integer.MIN_VALUE;
		int nextLargest = Integer.MIN_VALUE;
		// cycle through the array and get 2nd largest number
		for (int i=0; i<arr.length; i++)
		{
			// check if largest number
			if (arr[i] > largest)
			{
				nextLargest = largest;
				largest = arr[i];
			}
			else if (arr[i] > nextLargest)
			{
				nextLargest = arr[i];
			}		
		}		return nextLargest;
	}
	
	
	// method to create integer array with random integers
	public static int[] createArray(int size) 
	{
		// initiate the array
		int[] arr = new int[size];
		// populate the array with random numbers
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = generateRandom(1, 100);
		}
		// sort created array descending
		Arrays.sort(arr);
		//return sorted array
		return arr;
	}

	// generate random numbers between (x,y)
	public static int generateRandom(int min, int max) 
	{
		Random r = new Random();
		// max - min + 1 will create a number in the range of min and max, 
		// including max.
		return r.nextInt(max - min + 1) + min;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = createArray(50);
		System.out.println(getSecondLargest(arr));
	}
}
