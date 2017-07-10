// Insertion Sort Class
public class InsertionSort {

	// Swaps two items in an array
	private static int[] swap(int[] array, int indexOne, int indexTwo) {
		// We swap without using a temp variable to avoid allocating extra space.
		// Swap is implemented using addition and subtraction instead.
		// Assume a = 5, b = 10,
		// 		a = 5 + 10 (a = 15)
		// 		b = 15 - 10 (b = 5)
		// 		a = 15 - 5 (a = 10)
		// Results: a = 10, b = 5
		array[indexOne] = array[indexOne] + array[indexTwo];
		array[indexTwo] = array[indexOne] - array[indexTwo];
		array[indexOne] = array[indexOne] - array[indexTwo];

		return array;
	}


	// Insertion Sort Implementation
	public static int[] insertionSort(int[] unsortedArray) {
		// If number of elements in array is 1,
		// 		array is already sorted, so return the array
		if (unsortedArray.length == 1 || unsortedArray.length == 0)
			return unsortedArray;

		// Scan the array from left to right.
		// startIndex is the marker for the boundary between the sorted and unsorted side
		// 		of the array. Everything to the left of it is sorted, and everything at that
		// 		index to the right is unsorted.
		for (int startIndex = 1; startIndex <= unsortedArray.length-1; ++startIndex) {
			// Check current element with all previous elements
			//		to see if there is a value in the sorted array that is should be swapped
			//		with the current value
			for (int currIndex = startIndex; currIndex > 0; --currIndex) {
				// If we find that there is a value in the front of the array
				// 		that is bigger than the one after it, then we swap it with
				// 		the smaller value after it.
				if (unsortedArray[currIndex-1] > unsortedArray[currIndex])
					unsortedArray = swap(unsortedArray, currIndex, currIndex-1);
			}
		}

		// Return the sorted array
		return unsortedArray;
	}


	// Main
	public static void main(String[] args) {}
}
