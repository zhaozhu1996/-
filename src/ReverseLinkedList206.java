public class ReverseLinkedList206 {
    public static ListNode reverseList(ListNode head) {
        if(head==null) return head;

        ListNode pre = null;
        ListNode mid = head;
        while (mid!=null){
            ListNode next = mid.next;
            mid.next = pre;
            pre = mid;
            mid = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode partition = reverseList(ListNode.createList(new int[]{1,2,3,4,5}));
        System.out.println(partition);
    }
}
