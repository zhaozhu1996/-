public class RotateList61 {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k<=0) return head;
        ListNode le = head;
        ListNode ri = head;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        int i = 0;
        while (ri!=null){
            i++;
            ri = ri.next;
        }
        k = k%i;
        if(k==0) return head;
        i=1;
        ri = head;
        while (ri.next!=null){
            if(i>=k){
                pre = pre.next;
                le = le.next;
            }
            i++;
            ri = ri.next;
        }
        pre.next = null;
        ri.next = dummyHead.next;
        return le;
    }

    public static void main(String[] args) {
        ListNode partition = rotateRight(ListNode.createList(new int[]{1,2,3,4,5}),7);
        System.out.println(partition);
    }
}
