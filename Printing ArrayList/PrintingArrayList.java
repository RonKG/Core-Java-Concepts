/*
Printing an ArrayList
*/
import java.util.ArrayList;

public class PrintingArrayList {
	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<String>();
		myList.add("one");
		myList.add("two");
		myList.add("three");
		myList.add("four");
		myList.add("five");

		// iterate via "for loop"
		System.out.println("\n==> For Loop Example....");
		for (int i = 0; i < myList.size(); i++) {
			System.out.println("List Index: " + i + " list element:" + myList.get(i));
		}

		// different kind of loop
		System.out.println("\n==> Different Loop Example....");
		for (String temp : myList) {
			System.out.println("List Index: " + temp);
		}

		// while loop
		System.out.println("\n==> While Loop Example....");
		int i = 0;
		while (i < myList.size()) {
			System.out.println(myList.get(i));
			i++;
		}

		// collection stream(): Returns a sequential Stream
		System.out.println("\n==> collection stream() util....");
		myList.forEach((temp) -> {
			System.out.println(temp);
		});
	}
}
