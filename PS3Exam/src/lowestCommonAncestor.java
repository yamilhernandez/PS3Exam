
public class lowestCommonAncestor {
	//If the current (sub)tree contains both p and q,
	//then the function result is their LCA. If only one of them is in that subtree,
	//then the result is that one of them. If neither are in that subtree, the result
	//is null/None/nil.
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		if (root == null || root == p || root == q) return root;
		
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if(left==null) return right;
		else {
			if(right==null) return left;
			else return root;
		}
		
		
	}

}
