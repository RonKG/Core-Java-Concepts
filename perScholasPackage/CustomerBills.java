/*
Write a program that takes in String inputs into an array; 
each String corresponds to a person’s name and three of their bills 
e.g. “name-electricity-water-phone” > [mike-80-90-40]. 
These String inputs will follow the aforementioned format. 
With this array of Strings, calculate which person has the 
highest bill and return the name of said person; this highest bill 
is determined by individually (per person/String) summing 
each bill together to get their respective totals. 
In the class UserMainCode, complete the static method “highestbill”; 
this method has a String array as it’s parameter. 
The return type (String) should return the name of the person with 
the highest total bill. Also assume that the bill will have only one person name, 
in the event of two persons having the same highest total score).
*/


// package name
package perScholasPackage;


// imports
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


// class name
public class CustomerBills {

	private String name;
	private double billOne;
	private double billTwo;
	private double billThree;

	// constructors
	/**
	 * @param name
	 * @param billOne
	 * @param billTwo
	 * @param billThree
	 */
	public CustomerBills(String name, String billOne, String billTwo, String billThree) {
		super();
		this.name = name;
		this.billOne = Double.parseDouble(billOne);
		this.billTwo = Double.parseDouble(billTwo);
		this.billThree = Double.parseDouble(billThree);
	}

	public CustomerBills() {
		this("Jane Doe", "0.0", "0.0", "0.0");
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBillOne() {
		return billOne;
	}

	public void setBillOne(String billOne) {
		this.billOne = Double.parseDouble(billOne);
	}

	public double getBillTwo() {
		return billTwo;
	}

	public void setBillTwo(String billTwo) {
		this.billTwo = Double.parseDouble(billTwo);
	}

	public double getBillThree() {
		return billThree;
	}

	public void setBillThree(String billThree) {
		this.billThree = Double.parseDouble(billThree);
	}

	// class methods
	// prints customer object after user entry
	public void showCustomerBills() {
		System.out.println("Customer Name : " + name);
		System.out.println("   Bill 1:         " + billOne);
		System.out.println("   Bill 2:         " + billTwo);
		System.out.println("   Bill 3:         " + billThree + "\n");
	}

	// calculates total bills
	public static double getTotal(CustomerBills cb) {
		return cb.billOne + cb.billTwo + cb.billThree;
	}

	
	public static Map<String, Double> sortByValue(Map<String, Double> unsortMap) {
		// 1. Convert Map to List of Map
		List<Map.Entry<String, Double>> list = new LinkedList<Map.Entry<String, Double>>(unsortMap.entrySet());

		// 2. Sort list with Collections.sort(), provide a custom Comparator
		// Try switch the o1 o2 position for a different order
		Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
			public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// 3. Loop the sorted list and put it into a new insertion order Map
		// LinkedHashMap
		Map<String, Double> sortedMap = new LinkedHashMap<String, Double>();
		for (Map.Entry<String, Double> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		/*
		 * //classic iterator example for (Iterator<Map.Entry<String, Double>> it =
		 * list.iterator(); it.hasNext(); ) { Map.Entry<String, Double> entry =
		 * it.next(); sortedMap.put(entry.getKey(), entry.getValue()); }
		 */
		return sortedMap;
	}

	// prints map
	public static <K, V> void printMap(Map<K, V> map) {
		for (Map.Entry<K, V> entry : map.entrySet()) {
			System.out.println("" + entry.getKey() + "    " + entry.getValue());
		}
	}

	// sorts map an prints result
	public static void sortList(CustomerBills[] cb) {
		Map<String, Double> map = new HashMap<String, Double>();
		System.out.println(" \n   UNSORTED LIST  ");
		System.out.println(" \n____KEY___________VALUE____\n");
		for (int i = 0; i < cb.length; i++) {
			map.put(cb[i].getName(), getTotal(cb[i]));
		}
		printMap(map);

		System.out.println(" \n   SORTED LIST  ");
		System.out.println(" \n____KEY___________VALUE____\n");
		Map<String, Double> sortedMap = sortByValue(map);
		printMap(sortedMap);
	}

	// _______________________________________________________________________

	
	// main method
	public static void main(String[] args) {

		CustomerBills cb =  new CustomerBills("Angela Mitchel", "1000", "2000", "3000");
		CustomerBills cb2 = new CustomerBills("George Jones M", "100", "200", "300");
		CustomerBills cb3 = new CustomerBills("Mariah Manson", "10000", "2", "3");

		CustomerBills[] customers = new CustomerBills[3];
		customers[0] = cb;
		customers[1] = cb2;
		customers[2] = cb3;

		sortList(customers);

	}
}
