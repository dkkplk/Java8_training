
public class MaxSum {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int maxSum = findMaxSum(nums);

		System.out.println(maxSum);

	}

	private static int findMaxSum(int[] nums) {
		// TODO Auto-generated method stub

		if (nums.length <= 0)
			return 0;

		int maxSum = 0;
		int p1 = 0;
		int p2 = 0;

		for (int i = 0; i < nums.length; i++) {
			int prevSum = 0;
			if (maxSum < prevSum) {

				maxSum = prevSum;
				p1++;
			} else {
				p2++;
			}
			prevSum = nums[p1] + nums[p2];

		}

		return maxSum;
	}

}
