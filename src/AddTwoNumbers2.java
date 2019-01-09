public class AddTwoNumbers2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode head = dummyHead;
        ListNode i = l1;
        ListNode j = l2;
        while (i!=null&&j!=null){
            head.next = new ListNode(i.val+j.val);
            head = head.next;
            i = i.next;
            j = j.next;
        }
        if(i==null)
            head.next = j;
        if(j==null)
            head.next = i;
        head = dummyHead.next;
        int carry = 0;
        int x = 0;
        while (head!=null){
            head.val = head.val+=carry;
            carry = 0;
            x = head.val;
            if(x>9) {
                carry = x / 10;
                head.val %= 10;
            }
            if(head.next==null&&carry>0) {
                head.next = new ListNode(carry);
                break;
            }
            head = head.next;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode listNode = addTwoNumbers(ListNode.createList(new int[]{5}), ListNode.createList(new int[]{5}));
        System.out.println(listNode);
    }
}
