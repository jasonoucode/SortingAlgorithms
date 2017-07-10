// Bubble Sort Class
public class BubbleSort {

	private static int[] swap(int[] array, int indexOne, int indexTwo) {
		array[indexOne] = array[indexOne] + array[indexTwo];
		array[indexTwo] = array[indexOne] - array[indexTwo];
		array[indexOne] = array[indexOne] - array[indexTwo];

		return array;
	}


	public static int[] bubbleSort(int[] unsortedArray) {
		if (unsortedArray.length == 1 || unsortedArray.length == 0)
			return unsortedArray;

		for (int endIndex = unsortedArray.length-1; endIndex >= 0; --endIndex) {
			for (int startIndex = 1; startIndex <= endIndex; ++startIndex) {
				if (unsortedArray[startIndex-1] > unsortedArray[startIndex])
					unsortedArray = swap(unsortedArray, startIndex, startIndex-1);
			}
		}

		return unsortedArray;
	}


	public static void main(String[] args) {}
}