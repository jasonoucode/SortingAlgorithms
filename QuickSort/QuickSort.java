// Quick Sort Class and implementation
class QuickSort {
	/**
	 * @desc takes the end index and finds the partition
	 *		 that separates the end index val with all
	 *		 other vals in the array where everything to
	 *		 the left of the index is smaller than the
	 *		 partition val and everything to the right is
	 *		 larger.
	 *
	 * @param int arr[] - the unsorted array we need to sort
	 * @param int start - starting index of where we are sorting
	 * @param int end   - ending index of where we are sorting
	 *
	 * @return int - index of the partition
	 */
	int partition(int arr[], int start, int end) {
		// Keep track of the pivot value used to determine
		//		the partition index
		int pivot = arr[end];
		// Keeps track of the partition index starting from the
		//		start index
		int pIndex = start;

		// Goes through the array from the start to end index-1
		//		and compares values to make sure that the
		// 		left side contains everything smaller than
		//		the pivot
		// This means everything to the right side will be
		//		larger than the pivot
		for (int i = start; i < end; ++i) {
			if (arr[i] <= pivot) {
				int temp = arr[pIndex];
				arr[pIndex++] = arr[i];
				arr[i] = temp;
			}
		}

		// Swaps the first value in the array that is larger than
		//		the pivot and moves the pivot to the partition
		//		index.
		int temp = arr[pIndex];
		arr[pIndex] = arr[end];
		arr[end] = temp;

		// Return the partition index
		return pIndex;
	}


	/**
	 * @desc Quicksort is a divide and conquer algorithm.
	 *       Quicksort first divides a large array into two
	 *		 smaller sub-arrays: the low elements and the high
	 *       elements. Quicksort can then recursively sort the
	 *       sub-arrays.
	 *
	 * @param int arr[] - the unsorted array we need to sort
	 * @param int start - starting index of where we are sorting
	 * @param int end   - ending index of where we are sorting
	 *
	 * @return void - because arrays are passed in by reference
	 *				  we do not need to return the array
	 */
	void quickSort(int arr[], int start, int end) {
		// As long as the end index is larger than the
		//		start index, there is more than 1 value
		//		that still needs to be sorted.
		if (start < end) {
			// Used to get the partition that divides the
			//		array into parts to be conquered
			int pIndex = partition(arr, start, end);

			// Sort everything to the left of the partition
			quickSort(arr, start, pIndex-1);
			// Sort everything to the right of the partition
			quickSort(arr, pIndex+1, end);
		}
	}


	/**
	 * @desc main function
	 */
    public static void main(String args[]) {}
}
