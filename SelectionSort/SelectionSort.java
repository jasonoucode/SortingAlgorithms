// Selection Sort Class
public class SelectionSort {

	// Selection Sort Implementation
	public static int[] selectionSort(int[] unsortedArray) {

		// Scan the array from left to right.
		// startIndex is the marker for the boundary between the sorted and unsorted side
		// 		of the array. Everything to the left of it is sorted, and everything at that
		// 		index to the right is unsorted.
		for (int startIndex = 0; startIndex < unsortedArray.length-1; ++startIndex) {
			// We initialize the minimum value as the starting index to use for comparision
			//		against all other values
			int minIndex = startIndex;

			// Scan through the rest of the array starting at after the start index
			//		to check if there is a value in the unsorted portion of the array
			//		that is the real min to be put into the sorted portion of the array
			for (int minFind = startIndex+1; minFind < unsortedArray.length; ++minFind) {
				// If that min is found, we record that index as the new min
				if (unsortedArray[minFind] < unsortedArray[minIndex])
					minIndex = minFind;
			}

			// Because we're using a swap dependent on not using extra space in memory,
			//		we must make sure we are not trying to swap the same index or else
			//		we get the value 0.
			if (startIndex != minIndex) {
				// We swap without using a temp variable to avoid allocating extra space.
				// Swap is implemented using addition and subtraction instead.
				// Assume a = 5, b = 10,
				// 		a = 5 + 10 (a = 15)
				// 		b = 15 - 10 (b = 5)
				// 		a = 15 - 5 (a = 10)
				// Results: a = 10, b = 5
				unsortedArray[minIndex] = unsortedArray[minIndex] + unsortedArray[startIndex];
				unsortedArray[startIndex] = unsortedArray[minIndex] - unsortedArray[startIndex];
				unsortedArray[minIndex] = unsortedArray[minIndex] - unsortedArray[startIndex];
			}
		}

		// Return the sorted array
		return unsortedArray;
	}


	// Main
	public static void main(String[] args) {}
}
