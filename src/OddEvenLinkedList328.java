public class OddEvenLinkedList328 {
    public static ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode Odd = new ListNode(0);
        ListNode Even = new ListNode(0);
        ListNode temp = Even;
        ListNode beg = Odd;
        ListNode odd = head;
        ListNode even = head.next;
        while (odd!=null&&even!=null){
            Odd.next = odd;
            Even.next = even;
            Odd = Odd.next;
            Even = Even.next;
            if(even!=null) odd = even.next;
            if(odd!=null) even = odd.next;
        }
        if(odd!=null){
            Odd.next = odd;
            Odd = Odd.next;
            Even.next = null;
        }
        Odd.next = temp.next;
        return beg.next;
    }

    public static void main(String[] args) {
        ListNode partition = oddEvenList(ListNode.createList(new int[]{
                1,2,3,4,5,6,7}));
        System.out.println(partition);
    }
}
