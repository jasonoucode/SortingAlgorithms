public class InsertionSort {

	private static int[] swap(int[] array, int indexOne, int indexTwo) {
		array[indexOne] = array[indexOne] + array[indexTwo];
		array[indexTwo] = array[indexOne] - array[indexTwo];
		array[indexOne] = array[indexOne] - array[indexTwo];

		return array;
	}


	public static int[] insertionSort(int[] unsortedArray) {
		if (unsortedArray.length == 1 || unsortedArray.length == 0)
			return unsortedArray;

		for (int startIndex = 1; startIndex <= unsortedArray.length-1; ++startIndex) {
			for (int currIndex = startIndex; currIndex > 0; --currIndex) {
				if (unsortedArray[currIndex-1] > unsortedArray[currIndex])
					unsortedArray = swap(unsortedArray, currIndex, currIndex-1);
			}
		}

		return unsortedArray;
	}


	public static void main(String[] args) {}
}
