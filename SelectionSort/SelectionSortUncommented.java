public class SelectionSort {

	public static int[] selectionSort(int[] unsortedArray) {

		for (int startIndex = 0; startIndex < unsortedArray.length-1; ++startIndex) {
			int minIndex = startIndex;

			for (int minFind = startIndex+1; minFind < unsortedArray.length; ++minFind) {
				if (unsortedArray[minFind] < unsortedArray[minIndex])
					minIndex = minFind;
			}
			if (startIndex != minIndex) {
				unsortedArray[minIndex] = unsortedArray[minIndex] + unsortedArray[startIndex];
				unsortedArray[startIndex] = unsortedArray[minIndex] - unsortedArray[startIndex];
				unsortedArray[minIndex] = unsortedArray[minIndex] - unsortedArray[startIndex];
			}
		}

		return unsortedArray;
	}


	public static void main(String[] args) {}
}
