/***** Problem Statement for LeetCode 116 *****/
// Given a binary tree, Populate each next pointer to point to its next right node. 
// If there is no next right node, the next pointer should be set to NULL.

/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class NextRightNodes {
    	public void connect(TreeLinkNode root) {
        // Verify input
        if (root == null) return;
        
        // Initialize root
        root.next = null;
        
        if (root.left != null){
            root.left.next = root.right;   
        }
        
        connect(root.left, root.right);
        connect(root.right, null);
    }
    
    public void connect(TreeLinkNode root, TreeLinkNode rightBranch){

        if (root == null) return;
        
        // Set left node's next to right node
        if (root.left != null){
            root.left.next = root.right;
        }
        
        // Set right node's next to rightBranch right node
        if (root.right != null){
        	if (rightBranch != null){
                root.right.next = rightBranch.left;
        	} else {
                root.right.next = null;
        	}
        }
        
        // Recursively fill next nodes
        connect(root.left, root.right);
        
        if (rightBranch == null){
            connect(root.right, null);
        } else {
            connect(root.right, rightBranch.left);
        }
    }
}