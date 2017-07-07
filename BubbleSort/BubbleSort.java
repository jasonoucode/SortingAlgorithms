// Bubble Sort Class
public class BubbleSort {

	// Bubble Sort Implementation
	public static int[] bubbleSort(int[] unsortedArray) {
		// If number of elements in array is 1,
		// 		array is already sorted, so return the array
		if (unsortedArray.length == 1 || unsortedArray.length == 0)
			return unsortedArray;

		// Each time we loop through the entire array,
		// 		we know the last item in the array will be the biggest value.
		// 		That way we can reduce the end of the index by 1 for each loop
		for (int endIndex = unsortedArray.length-1; endIndex >= 0; --endIndex) {
			// Starting at index 1, we compare two values at a time.
			// From left to right, we increment one space at a time.
			// The biggest value is moved to the very end
			for (int startIndex = 1; startIndex <= endIndex; ++startIndex) {
				// If we find that there is a value in the front of the array
				// 		that is bigger than the one after it, then we swap it with
				// 		the smaller value after it.
				if (unsortedArray[startIndex-1] > unsortedArray[startIndex]) {
					// We swap without using a temp variable to avoid allocating extra space.
					// Swap is implemented using addition and subtraction instead.
					// Assume a = 5, b = 10,
					// 		a = 5 + 10 (a = 15)
					// 		b = 15 - 10 (b = 5)
					// 		a = 15 - 5 (a = 10)
					// Results: a = 10, b = 5
					unsortedArray[startIndex] = unsortedArray[startIndex] + unsortedArray[startIndex-1];
					unsortedArray[startIndex-1] = unsortedArray[startIndex] - unsortedArray[startIndex-1];
					unsortedArray[startIndex] = unsortedArray[startIndex] - unsortedArray[startIndex-1];
				}
			}
		}

		// Return the sorted array
		return unsortedArray;
	}


	// Main
	public static void main(String[] args) {}
}
