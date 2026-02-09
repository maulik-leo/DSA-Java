package in.leotech;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 9, 3, 2, 5, 1, 7, 8, 4, 10, 0, 6 };
		printArray(arr, "Before Sorting :");
		insertionSort(arr);
		printArray(arr, "After Sorting :");
	}

	static void printArray(int[] arr, String msg) {
		System.out.println(msg);
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}

	static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			// Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}