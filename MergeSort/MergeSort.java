import java.util.Arrays;

// Merge Sort Class
public class MergeSort {

	// Helper function used to determine if we need to sort the array (if array.length > 1).
	// Used to call the recursive function which takes in:
	//		- array (array we want to store)
	//		- new int[array.length] (temp array for storing our sorted array)
	//		- 0 (starting point)
	//		- array.length-1 (ending point)
	public static void mergeSortHelper(int[] array) {
		if (array.length > 1)
			mergeSortSplitRec(array, new int[array.length] ,0 , array.length-1);
	}


	// Recursive function which takes in:
	//		- array (array we want to store)
	//		- new int[array.length] (temp array for storing our sorted array)
	//		- 0 (starting point)
	//		- array.length-1 (ending point)
	// This function keeps splitting the array into left and right halves
	//		until there is nothing left to spit.
	// For example [5, 4, 3, 2] --> [5, 4] + [3, 2] --> [5] + [4] + [3] + [2]
	// From there, it calls the merge function which sorts the halves
	// The merge function takes in:
	//		- array ()
	//		- temp ()
	//		- left ()
	//		- leftEnd ()
	//		- right ()
	//		- rightEnd ()
	public static void mergeSortSplitRec(int[] array, int[] temp,
											int left, int right) {
		// As long as the left index is < right index,
		//		that means there are more than 1 item between the
		//		indexes which means we can keep splitting.
		if (left < right) {
			// We calculate the midpoint
			int mid = (left + right) / 2;
			// Split the array, left half
			mergeSortSplitRec(array, temp, left, mid);
			// Split the array, right half
			mergeSortSplitRec(array, temp, mid+1, right);
			// Merge the halves together while sorting it.
			mergeSortMerge(array, temp, left, mid, mid+1, right);
		}
	}


	// The merge function takes in:
	//		- array (array we want to sort as reference)
	//		- temp (temp array used for sorting manipulation)
	//		- left (start of left side of array to be sorted)
	//		- leftEnd (end of left side of array to be sorted)
	//		- right (start of right side of array to be sorted)
	//		- rightEnd (end of right side of array to be sorted)
	public static void mergeSortMerge(int[] array, int[] temp,
										int left, int leftEnd, int right, int rightEnd) {
		// We use the left most index as our base reference
		int tempIndex = left;
		// Calculate number of elements being merged.
		int size = rightEnd - left + 1;

		// Compare the left and right right side elements of the array.
		// The smallest value will then be placed into the sorted array.
		// This continues until either the left or the right index
		//		has nothing else.
		while(left <= leftEnd && right <= rightEnd) {
			// Checks if the left side has the smaller value.
			//		If left is smaller, put it into temp as sorted
			//		then increment left.
			if (array[left] <= array[right])
				temp[tempIndex++] = array[left++];
			else
				// Else we put right element in sorted
				//		then increment right.
				temp[tempIndex++] = array[right++];
		}

		// Put the rest of the left elements into the sorted array
		while(left <= leftEnd)
			temp[tempIndex++] = array[left++];

		// Put the rest of the right elements into the sorted array
		while(right <= rightEnd)
			temp[tempIndex++] = array[right++];

		// Copy the elements that are sorted into the correct indexes of the original array
		for (int i = 0; i < size; ++i, --rightEnd)
			array[rightEnd] = temp[rightEnd];
	}


	// Main
	public static void main(String[] args) {}
}
