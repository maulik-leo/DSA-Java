package in.leotech;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 6, 9, 3, 2, 5, 1, 7, 8, 4, 10, 0 };
		printArray(arr, "Before Sorting :");
		bubbleSort(arr);
		printArray(arr, "After Sorting :");
	}

	static void printArray(int[] arr, String msg) {
		System.out.println(msg);
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}

	static void bubbleSort(int[] arr) { // O(n^2) Time Complexity
		boolean swapped;
		for (int i = 0; i < arr.length - 1; i++) { // Will give last element as LARGEST in iteration
			swapped = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) { // no swapping means got sorted array - nothing to do after that
				break;
			}
		}
	}
}