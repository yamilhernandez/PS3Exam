import java.util.ArrayList;
import java.util.List;

public class rightSideView {
	public List<Integer> rightSideView(TreeNode root) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		if (root==null) return list;
		TreeNode node= root;
		list= rightSideViewHelper(list, node);

		return list;
	}

	private ArrayList<Integer> rightSideViewHelper(ArrayList<Integer> list, TreeNode node) {
		list.add(node.val);
		if(node.right!=null) {
			return rightSideViewHelper(list, node.right);
		}
		if(node.left!=null) {
			return rightSideViewHelper(list, node.left);
		}
		return list;
	}
	

}
