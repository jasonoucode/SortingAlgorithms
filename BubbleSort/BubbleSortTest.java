import java.util.Arrays;

public class BubbleSortTest {

	// Keeps track of the number of tests and passed tests.
	public static int numTests = 0;
	public static int passedTests = 0;

	// Tests for the case of only 1 item in the array.
	public static boolean testOneItem() {
		int[] unsorted = new int[]{5};
		int[] sorted = new int[]{5};
		++numTests;

		BubbleSort bs = new BubbleSort();

		return Arrays.equals(bs.bubbleSort(unsorted), sorted);
	}

	// Tests for the case of 2 items in the array.
	public static boolean testTwoItems() {
		int[] unsorted = new int[]{5, 2};
		int[] sorted = new int[]{2, 5};
		++numTests;

		BubbleSort bs = new BubbleSort();

		return Arrays.equals(bs.bubbleSort(unsorted), sorted);
	}

	// Tests for the case of no items in the array.
	public static boolean testNoItems() {
		int[] unsorted = new int[0];
		int[] sorted = new int[0];
		++numTests;

		BubbleSort bs = new BubbleSort();

		return Arrays.equals(bs.bubbleSort(unsorted), sorted);
	}

	// Tests for the case with many items in the array.
	public static boolean testManyItems() {
		int[] unsorted = new int[]{124, 5, 2, 10, 123,};
		int[] sorted = new int[]{2, 5, 10, 123, 124};
		++numTests;

		BubbleSort bs = new BubbleSort();

		return Arrays.equals(bs.bubbleSort(unsorted), sorted);
	}

	// Main, runs all of the tests and prints out the results.
	public static void main(String[] args) {

		if(testOneItem()) ++passedTests;
		if(testTwoItems()) ++passedTests;
		if(testNoItems()) ++passedTests;
		if(testManyItems()) ++passedTests;

		System.out.println("Tests Passed: " + passedTests + " / " + numTests);
	}

}