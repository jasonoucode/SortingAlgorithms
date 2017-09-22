class QuickSort {
	int partition(int arr[], int start, int end) {
		int pivot = arr[end];
		int pIndex = start;

		for (int i = start; i < end; ++i) {
			if (arr[i] <= pivot) {
				int temp = arr[pIndex];
				arr[pIndex++] = arr[i];
				arr[i] = temp;
			}
		}

		int temp = arr[pIndex];
		arr[pIndex] = arr[end];
		arr[end] = temp;

		return pIndex;
	}


	void quickSort(int arr[], int start, int end) {
		if (start < end) {
			int pIndex = partition(arr, start, end);

			quickSort(arr, start, pIndex-1);
			quickSort(arr, pIndex+1, end);
		}
	}


    public static void main(String args[]) {}
}
