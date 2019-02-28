public class RemoveDuplicatesFromSortedList83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode pre = head;
        ListNode mid = head.next;
        ListNode aft = head.next.next;
        while (mid!=null){
            if(mid.val == pre.val){
                pre.next = aft;
            }else {
                pre = mid;
            }
            mid = aft;
            if(aft!=null) aft = aft.next;
        }
        return head;
    }
}
