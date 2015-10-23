/***** Problem Statement for LeetCode 101 *****/
// Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        
        // Input validation
        if (root == null) return true;
        
        // Special case
        if (root.left == null && root.right == null) return true;
        
        return isSymmetric(root.left, root.right);
    }
    
    public boolean isSymmetric(TreeNode leftBranch, TreeNode rightBranch){
        
        // Input validation
        if (leftBranch == null && rightBranch == null){
            return true;
        } else if(leftBranch == null || rightBranch == null){
            return false;
        }
        
        // Check for equality
        if (leftBranch.val != rightBranch.val) return false;
        
        // Recurse symmetric branches
        boolean leftAndRightBranch = isSymmetric(leftBranch.left, rightBranch.right);
        if (leftAndRightBranch){
            return isSymmetric(leftBranch.right, rightBranch.left);
        }
        
        return false;
    }
}