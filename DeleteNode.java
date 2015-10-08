/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class DeleteNode {
    public void deleteNode(ListNode node) {
        if (node != null || node.next != null){
            ListNode next = node.next;
            node.val = next.val;
            node.next = next.next;
        }
    }
}