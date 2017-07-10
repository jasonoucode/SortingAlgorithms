public class SelectionSort {

	private static int[] swap(int[] array, int indexOne, int indexTwo) {
		array[indexOne] = array[indexOne] + array[indexTwo];
		array[indexTwo] = array[indexOne] - array[indexTwo];
		array[indexOne] = array[indexOne] - array[indexTwo];

		return array;
	}


	public static int[] selectionSort(int[] unsortedArray) {

		for (int startIndex = 0; startIndex < unsortedArray.length-1; ++startIndex) {
			int minIndex = startIndex;

			for (int minFind = startIndex+1; minFind < unsortedArray.length; ++minFind) {
				if (unsortedArray[minFind] < unsortedArray[minIndex])
					minIndex = minFind;
			}

			if (startIndex != minIndex)
				unsortedArray = swap(unsortedArray, startIndex, minIndex);
		}

		return unsortedArray;
	}


	public static void main(String[] args) {}
}
