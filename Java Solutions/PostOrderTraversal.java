/***** Problem Statement *****/
// Given a binary tree, return the postorder traversal of its nodes' values.

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
public class PostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<Integer>();
        return postorderTraversal(root, results);
    }
    
    public List<Integer> postorderTraversal(TreeNode node, List<Integer> list){
        
        if (node != null){
            list = postorderTraversal(node.left, list);
            list = postorderTraversal(node.right, list);
            list.add(node.val);
        }
        
        return list;
    }
}