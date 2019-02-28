public class PalindromeLinkedList234 {
    public static boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        if(head.next.next==null) return head.val==head.next.val;
        ListNode dummyHead = new ListNode(-1);
        ListNode temp = dummyHead;
        ListNode fastRef = head;
        ListNode slowRef = head;
        while (fastRef!=null&&fastRef.next!=null&&fastRef.next.next!=null){
            fastRef = fastRef.next.next;
            slowRef = slowRef.next;
        }
        ListNode backHalf =slowRef.next;
        slowRef.next = null;
        slowRef = head;
        fastRef = backHalf;
        fastRef = reverseList(fastRef);
        while (fastRef!=null){
            if(fastRef.val!=slowRef.val) return false;
            fastRef = fastRef.next;
            slowRef = slowRef.next;
        }
        return true;
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
        isPalindrome(ListNode.createList(new int[]{1,1,2,1,1}));
    }

}
