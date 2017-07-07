public class InsertionSort {

	public static int[] insertionSort(int[] unsortedArray) {
		if (unsortedArray.length == 1 || unsortedArray.length == 0)
			return unsortedArray;

		for (int startIndex = 1; startIndex <= unsortedArray.length-1; ++startIndex) {
			for (int currIndex = startIndex; currIndex > 0; --currIndex) {
				if (unsortedArray[currIndex-1] > unsortedArray[currIndex]) {
					unsortedArray[currIndex] = unsortedArray[currIndex] + unsortedArray[currIndex-1];
					unsortedArray[currIndex-1] = unsortedArray[currIndex] - unsortedArray[currIndex-1];
					unsortedArray[currIndex] = unsortedArray[currIndex] - unsortedArray[currIndex-1];
				}
			}
		}

		return unsortedArray;
	}


	public static void main(String[] args) {}
}
