public class RemoveNthNodeFromEndOfList19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int index = 1;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode aft = head;
        while (aft.next!=null){
            if(index<n){
                aft = aft.next;
                index++;
            }else {
                aft = aft.next;
                pre = pre.next;
            }
        }

        pre.next = pre.next.next;
        return  dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode listNode = removeNthFromEnd(ListNode.createList(new int[]{1, 2, 3, 4, 5}), 1);
        System.out.println(listNode);
    }
}
