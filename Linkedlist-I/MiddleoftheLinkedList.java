

public class MiddleoftheLinkedList {
    
}
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle = turtle.next;
        }
        if(hare.next==null){
            return turtle.next;
        }
           return turtle;
    }
