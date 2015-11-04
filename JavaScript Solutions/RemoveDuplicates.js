/***** Problem Statement for LeetCode 83 *****/
// Given a sorted linked list, delete all duplicates such that each element appear only once.

/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
    // Declarations
    var focusNode = head,
        tempHead = head;
        
    // Validate input
    if (head === null) return head;
        
    head = head.next;
    
    while (head !== null){
        if (head.val === focusNode.val){
            head = head.next;
            focusNode.next = head;
        } else {
            focusNode = head;
            head = head.next;
        }
    }
    return tempHead;
};