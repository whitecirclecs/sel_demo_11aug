package collectionsFramework;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<String>();

		// object.method() being used to store items in the arraylist
		cities.add("London");
		cities.add("Paris");
		cities.add("New York");
		cities.add("Tokyo");
		cities.add("Los Angeles");
		cities.add("Birmingham");

		// retrieve the items
		for (String t : cities) { // for-each loop
			System.out.println(t);
		}

		System.out.println();
		// accessing the items using index
		System.out.println("Item stored at index 2 = " + cities.get(2));

		// index of new york
		System.out.println("Index of New york = " + cities.indexOf("New York"));

		// Total number of items stored in the arraylist
		System.out.println("Total number of items stored = " + cities.size());

	}

}
