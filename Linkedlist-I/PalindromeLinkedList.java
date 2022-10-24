
public class PalindromeLinkedList {
    
}
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr= head;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
    public ListNode findMiddle(ListNode head){
          ListNode hare = head;
         ListNode turtle = head;
        // initially both are at  head
        while(hare.next!=null && hare.next.next!=null){
            hare = hare.next.next; // 2 step  jitna ak sath by jump
            turtle =turtle.next;
        }
        return turtle; // which will stop at the first mid of LL when hare stop 
             
    }
    
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null){
            return true;
        }
        ListNode middle = findMiddle(head);
        ListNode secondHalfStart = reverse(middle.next);
        ListNode firstHalfStart = head;
        while( secondHalfStart !=null){
            if( firstHalfStart.val!=  secondHalfStart.val){
                return false;
            }
            firstHalfStart=firstHalfStart.next;
             secondHalfStart= secondHalfStart.next;
        }
        return true;
    }
}
