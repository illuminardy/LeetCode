/***** Problem Statement for LeetCode 129 *****/
// Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
// Find the total sum of all root-to-leaf numbers.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SumRootToLeaf {
    public int sumNumbers(TreeNode root) {
        
        if (root == null) return 0;
        
        // In-order traversal of nodes
        int sumLeft = sumNumbers(root.left, root.val);
        int sumRight = sumNumbers(root.right, root.val);
        int totalSum = sumLeft + sumRight;
        
        return (totalSum == 0) ? root.val : totalSum; 
    }
    
    public int sumNumbers(TreeNode root, int value){
        
        if (root != null){
            // Calculates int value represented by all nodes previously traversed
            int newValue = (value * 10) + root.val; 
            
            // In-order traversal of nodes
            int sumLeft = sumNumbers(root.left, newValue);
            int sumRight = sumNumbers(root.right, newValue);
            int totalSum = sumLeft + sumRight;
            return (totalSum == 0) ? newValue : totalSum; 
        }
        
        // Base case
        return 0;
    }
}