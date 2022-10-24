
public class LinkedListCycle {
    
}
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode hair=head;
        ListNode turtle=head;
        while(hair!=null&&hair.next!=null){
            hair=hair.next.next;
            turtle=turtle.next;
            if(hair==turtle){
                return true;
            }
        }
        return false;
    }
}
