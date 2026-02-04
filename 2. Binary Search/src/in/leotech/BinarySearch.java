package in.leotech;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = { 2, 5, 6, 8, 12, 23, 34, 56, 69, 89, 94 }; // must be sorted
		int target = 69;
		int target_index = binarySearch(nums, target);
		//int target_index = binarySearchRecursive(nums, target, 0, nums.length - 1); // Recursive Approach
		System.out.println(target_index != -1 ? "Element is present on index " + target_index : "Element not present !");
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

	private static int binarySearchRecursive(int[] nums, int target, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target)
				return mid;
			else if (target < nums[mid])
				return binarySearchRecursive(nums, target, 0, mid - 1);
			else
				return binarySearchRecursive(nums, target, mid + 1, nums.length - 1);
		}
		return -1;
	}
}