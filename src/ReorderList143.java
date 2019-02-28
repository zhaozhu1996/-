import java.util.LinkedList;

public class ReorderList143 {
    public static void reorderList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null) return;
        ListNode dummyHead = new ListNode(-1);
        ListNode temp = dummyHead;
        ListNode fastRef = head;
        ListNode slowRef = head;
        while (fastRef!=null&&fastRef.next!=null){
            fastRef = fastRef.next.next;
            slowRef = slowRef.next;
        }
        ListNode backHalf = slowRef.next;
        slowRef.next = null;
        slowRef = head;
        fastRef = backHalf;
        fastRef = reverseList(fastRef);
        while (slowRef!=null&&fastRef!=null){
            temp.next = slowRef;
            ListNode next = slowRef.next;
            slowRef.next = fastRef;
            temp = fastRef;
            slowRef = next;
            fastRef = fastRef.next;
        }
        if(slowRef!=null) temp.next = slowRef;
    }

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
        reorderList(ListNode.createList(new int[]{1,2,3,4,5}));
    }
}
