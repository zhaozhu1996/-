public class SwapNodesInPairs24 {
    public static ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode p = dummyHead;
        ListNode node1 = head;
        ListNode node2 = head.next;
        ListNode node3 = null;
        while (node2!=null){
            node3 = node2.next;
            node2.next = node1;
            p.next = node2;
            node1.next = node3;

            p = node1;
            if(node3==null)
                return dummyHead.next;
            node1 = node3;
            node2 = node3.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        swapPairs(ListNode.createList(new int[] {1,2,3,4}));
    }
}
