public class MergeTwoSortedLists21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode head = dummyHead;
        ListNode i = l1;
        ListNode j = l2;
        while (i!=null&&j!=null){
            if(i.val>j.val){
                head.next = j;
                j = j.next;
            }else {
                head.next = i;
                i = i.next;
            }
            head = head.next;
        }
        if(i==null){
            head.next = j;
        }else {
            head.next = i;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode listNode = mergeTwoLists(ListNode.createList(new int[]{1, 2, 4}), ListNode.createList(new int[]{1, 3, 4}));
        System.out.println(listNode);
    }
}
