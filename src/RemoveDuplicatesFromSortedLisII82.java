public class RemoveDuplicatesFromSortedLisII82 {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        ListNode aft = head.next;
        while (aft!=null){
            if(head.val == aft.val){
                while (aft!=null&&aft.val == head.val){
                    aft = aft.next;
                }
                if(aft==null||aft.next==null) {
                    temp.next = aft;
                    return dummyHead.next;
                }
                head = aft;
                aft = aft.next;
                if(head.val!=aft.val){
                    temp.next = head;
                    head = head.next;
                    aft = aft.next;
                    temp = temp.next;
                }
            }else {
                head = head.next;
                aft = aft.next;
                temp = temp.next;
            }
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode partition = deleteDuplicates(ListNode.createList(new int[]{
                1,1,1,2,3}));
        System.out.println(partition);
    }
}
