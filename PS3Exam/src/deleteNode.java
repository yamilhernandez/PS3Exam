
public class deleteNode {
	
public TreeNode deleteNode(TreeNode root, int key) {
	TreeNode node= root;
	
	while (node.val!=key) {
		if(node.right==null && node.left==null) return root;
		if(node.val<key) {
			
			node=node.right;
		}
		if (node.val>key) {
			node=node.left;
		}
	}
	
	
	
	
	
	return root;
        
    }

}
