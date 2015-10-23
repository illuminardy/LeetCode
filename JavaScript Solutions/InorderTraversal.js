/***** Problem Statement for LeetCode 94 *****/
// Given a binary tree, return the inorder traversal of its nodes' values.

/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
var inorderTraversal = function(root) {
    var number = [];
    
    if (root !== null){
        traverse(root.left, number);
        number.push(root.val);
        traverse(root.right, number);
    }
    
    return number;
};

var traverse = function(root, number){
    if (root !== null){
        traverse(root.left, number);
        number.push(root.val);
        traverse(root.right, number);
    }
    return number;
};
