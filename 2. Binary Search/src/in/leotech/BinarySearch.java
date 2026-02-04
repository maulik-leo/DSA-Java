package in.leotech;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = { 2, 5, 6, 8, 12, 23, 34, 56, 69, 89, 94 }; // must be sorted
		int target = 69;
		int result_index = binarySearch(nums, target);
		System.out.println(result_index != -1 ? "Element is present on index " + result_index : "Element not present !");
	}

	private static int binarySearch(int[] nums, int target) { // O(log n) Time Complexity
		int low = 0, high = nums.length - 1, mid, steps = 0;

		while (low <= high) {
			steps++;
			mid = (low + high) / 2;
			if (nums[mid] == target) {
				System.out.println("Steps : " + steps);
				return mid;
			} else if (target < nums[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		System.out.println("Steps : " + steps);
		return -1;
	}
}