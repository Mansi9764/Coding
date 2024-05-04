/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int l = findLength(head);
        int traverseTill =  l-n;
        if(traverseTill==0)
        {
            return head.next;
        }
        ListNode current = head;
        int i=1;
        while(i < traverseTill)
        {
            current=current.next;
            i++;
        }
        current.next=current.next.next;
        return head;
    }
    public int findLength(ListNode head)
    {
        int count=0;
        if(head==null)
        {
            return count;
        }
        else{
            ListNode c = head;
            while(c!=null)
            {
                count++;
                c=c.next;
            }
            
        }
        return count;
    }
}