import java.util.Arrays;

public class MergeSort {
	public static void mergeSortHelper(int[] array) {
		if (array.length > 1)
			mergeSortSplitRec(array, new int[array.length] ,0 , array.length-1);
	}


	public static void mergeSortSplitRec(int[] array, int[] temp,
											int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSortSplitRec(array, temp, left, mid);
			mergeSortSplitRec(array, temp, mid+1, right);
			mergeSortMerge(array, temp, left, mid, mid+1, right);
		}
	}


	public static void mergeSortMerge(int[] array, int[] temp,
										int left, int leftEnd, int right, int rightEnd) {
		int tempIndex = left;
		int size = rightEnd - left + 1;

		while(left <= leftEnd && right <= rightEnd) {
			if (array[left] <= array[right])
				temp[tempIndex++] = array[left++];
			else
				temp[tempIndex++] = array[right++];
		}

		while(left <= leftEnd)
			temp[tempIndex++] = array[left++];

		while(right <= rightEnd)
			temp[tempIndex++] = array[right++];

		for (int i = 0; i < size; ++i, --rightEnd)
			array[rightEnd] = temp[rightEnd];
	}


	public static void main(String[] args) {}
}
