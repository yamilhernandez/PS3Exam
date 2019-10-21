import java.util.ArrayList;
import java.util.List;

public class rightSideView {
	public List<Integer> rightSideView(TreeNode root) {
		
		ArrayList<Integer> ret= new ArrayList<>();
		if (root==null) return ret;
		int height= maxDepth(root);
		Integer[] list= new Integer[height];
		
		TreeNode node= root;
		list[0] = root.val;
		rightSideViewHelper(list, node.left,1);
		rightSideViewHelper(list, node.right,1);
		//ArrayList<Integer> ret= new ArrayList<>();
		for (Integer integer : list) {
			ret.add(integer);
		}

		return ret;
	}

	private Integer[] rightSideViewHelper(Integer[] list, TreeNode node, int level) {
		
		list[level]= node.val;
		if(node.right!=null) {
			return rightSideViewHelper(list, node.right,level+1);
		}
		if(node.left!=null) {
			return rightSideViewHelper(list, node.left,level+1);
		}
		return list;
	}
	 int maxDepth(TreeNode node)  
	    { 
	        if (node == null) 
	            return 0; 
	        else 
	        { 
	            /* compute the depth of each subtree */
	            int lDepth = maxDepth(node.left); 
	            int rDepth = maxDepth(node.right); 
	   
	            /* use the larger one */
	            if (lDepth > rDepth) 
	                return (lDepth + 1); 
	             else 
	                return (rDepth + 1); 
	        } 
	    } 
	

}
