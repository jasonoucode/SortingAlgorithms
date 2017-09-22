// Package Imports
import java.util.Arrays;


// Quick Sort Test class
class QuickSortTest {
	// Keeps track of the number of tests and passed tests
	private static int numTests = 0;
	private static int passedTests = 0;


	// Tests for the case of empty array
	private static boolean testEmpty() {
		++ numTests;

		int[] unsorted = {};
		int[] sorted   = {};

		QuickSort qs = new QuickSort();
		qs.quickSort(unsorted, 0, unsorted.length-1);

		return Arrays.equals(unsorted, sorted);
	}


	// Tests for only 1 item in the array
	private static boolean testOne() {
		++ numTests;

		int[] unsorted = {1};
		int[] sorted   = {1};

		QuickSort qs = new QuickSort();
		qs.quickSort(unsorted, 0, unsorted.length-1);

		return Arrays.equals(unsorted, sorted);
	}


	// Tests for only 2 items in the array
	private static boolean testTwo() {
		++ numTests;

		int[] unsorted = {2, 1};
		int[] sorted   = {1, 2};

		QuickSort qs = new QuickSort();
		qs.quickSort(unsorted, 0, unsorted.length-1);

		return Arrays.equals(unsorted, sorted);
	}


	// Tests for only many items in the array
	private static boolean testMany() {
		++ numTests;

		int[] unsorted = {5, 4, 3, 2, 1};
		int[] sorted   = {1, 2, 3, 4, 5};

		QuickSort qs = new QuickSort();
		qs.quickSort(unsorted, 0, unsorted.length-1);

		return Arrays.equals(unsorted, sorted);
	}


	// Main, runs all of the tests and prints out the results
	public static void main(String args[]) {
		if (testEmpty())
			++passedTests;
		else
			System.out.println("Test Empty: Failed.");

		if (testOne())
			++passedTests;
		else
			System.out.println("Test One: Failed.");

		if (testTwo())
			++passedTests;
		else
			System.out.println("Test Two: Failed.");

		if (testMany())
			++passedTests;
		else
			System.out.println("Test Many: Failed.");

		System.out.println("Tests Passed: " + passedTests + " / " + numTests);
	}
}