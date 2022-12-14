
public class ReverseLinkedList {
    
}
class Solution {
    public ListNode reverseList(ListNode head) {
    
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode nextNode =curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
}
