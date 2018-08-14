package perScholasPackage;

import java.util.Arrays;
import java.util.Random;

/*
1. Write a program to read an integer array and return the middle element in the array. 
Assume that the array will always be of odd length; also assume that the maximum number 
of elements in the array is 25 

Implement this program using two classes:
 Main class
 UserMainClass- This class should have a method getMidEle() which should accept  
  				one integer array as  parameter and return type should be integer
*/

public class MidPointChecker {
	// class variables
	private int size;
	private int[] arr;

	/**
	 * @param size
	 */
	// empty constructor
	public MidPointChecker() {
		super();
		this.size = 25;
		this.setArr(this.size);
	}
	
	// loaded constructor
	public MidPointChecker(int size) {
		super();
		this.size = size;
		this.setArr(size);
	}

	// getters and setters
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int size) {
		this.size = size;
		createArray(size);
	}

	// CLASS METHODS

	// generate random array of size < 26 and odd count
	private void createArray(int size) {
		this.size = size;
		if (size < 1 || size > 25 || size % 2 == 0) {			
			System.out.println("Wrong input. Run prog again.");
		} else {
			int[] arr = new int[size];
			Random r = new Random();
			for (int i = 0; i < size; i++) {
				arr[i] = r.nextInt(50) + 1;
			}
			this.arr = arr;
		}
	}

	// find the middle element
	public int getMiddle() {
		int mid = 0;
		int len = 0;
		len = this.arr.length;
		mid = (this.arr[(len / 2) ]);

		return (int) mid;
	}
	
	// print results
	@Override
	public String toString() {
		return "Size of array is: " + arr.length + "\n" 
				+ "Array elements: " + Arrays.toString(arr) + "\n"
				+ "Middle item is: " + this.getMiddle() + "";

	}

}
