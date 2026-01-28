package in.leotech;

public class LinearSearch {

	public static void main(String[] args) {
		int[] nums = { 5, 23, 6, 8, 94, 12, 56, 34, 2, 69, 89 };
		int target = 69;
		int result_index = linearSearch(nums, target);
		System.out.println(result_index != -1 ? "Element is present on index " + result_index : "Element not present !");
	}

	private static int linearSearch(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target)
				return i;
		}
		return -1;
	}
}