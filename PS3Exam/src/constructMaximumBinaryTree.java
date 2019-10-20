import java.util.Arrays;

public class constructMaximumBinaryTree {

	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return helper(nums, 0, nums.length-1);





	}
	private TreeNode helper(int[] nums, int lo, int hi) {

		if(hi<lo) return null;


		int maxIndex= findMaxIndex(nums, lo,hi);
		TreeNode node = new TreeNode(nums[maxIndex]);
		node.left = helper(nums, lo, maxIndex - 1);
		node.right = helper(nums, maxIndex + 1, hi);

		return node;

	}
	private int findMaxIndex(int[] nums, int lo, int hi) {
		int max = nums[lo];
		int maxIndex = lo;
		for(int i = lo + 1; i <= hi; i++) {
			if(nums[i] > max) {
				max = nums[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

}
