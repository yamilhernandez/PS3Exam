
public class deleteNode {
	
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
   		if (root.val == key){
   			if (root.right != null){//find root successor= the leftmost node from the right tree
   				TreeNode left = root.left; //save left tree
   				TreeNode ret = root.right; 
   				root = root.right;//update root
   				while (root != null && root.left != null) root = root.left;//find leftmost node
   				root.left = left;//attach left tree to new root
   				return ret;
   			}if (root.left != null){
   				return root.left;
   			} return null;// root is only node of the tree
   		}
   		if (root.val < key) { //
   			root.right = deleteNode(root.right, key);//looking for node on the right tree
   		}
   		else{
   			root.left = deleteNode(root.left, key);//looking for node on the left tree
   		}
   		return root; //node not found


   	}

}
