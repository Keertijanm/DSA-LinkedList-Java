
public class RemoveLinkedListElements {
    
}
    public ListNode removeElements(ListNode head, int val) {
       if(head==null)return null;
        
        ListNode rAns=removeElements(head.next,val);
        if(head.val==val)
        return rAns;
        head.next=rAns;
        return head;
}
