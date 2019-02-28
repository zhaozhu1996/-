public class PartitionList86 {
    public static ListNode partition(ListNode head, int x) {
        if(head==null) return head;
        ListNode dumyHead = new ListNode(-1);
        dumyHead.next = head;
        ListNode temp = dumyHead;
        ListNode pre = dumyHead;
        ListNode aft = head.next;
        while (head!=null){
            if(head.val<x){
                pre.next = aft;
                head.next = temp.next;
                temp.next = head;
                temp = temp.next;
                if(pre.next==aft&&aft!=null) {
                    head = aft;
                    aft = aft.next;
                }else {
                    head = aft;
                    if(aft!=null) aft = aft.next;
                    pre = pre.next;
                }
            }else {
                head = head.next;
                if(aft!=null) aft = aft.next;
                pre = pre.next;
            }
        }
        return dumyHead.next;
    }

    public static void main(String[] args) {
        ListNode partition = partition(ListNode.createList(new int[]{3,1,2}), 3);
        System.out.println(partition);
    }
}
