package in.leotech;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 6, 9, 3, 2, 5, 1, 7, 8, 4, 10, 0 };
		printArray(arr, "Before Sorting :");
		selectionSort(arr);
		printArray(arr, "After Sorting :");
	}

	static void printArray(int[] arr, String msg) {
		System.out.println(msg);
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}

	static void selectionSort(int[] arr) { // O(n^2) Time Complexity : but better than Bubble Sort as less swapping
		int minIndex = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
}