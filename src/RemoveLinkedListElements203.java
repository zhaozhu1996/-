public class RemoveLinkedListElements203 {
    public static ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (head!=null){
            if(head.val==val){
                temp.next = head.next;
                if(temp!=null) {
                    head = temp.next;
                }else {
                    break;
                }
            }else {
                temp = temp.next;
                head = head.next;
            }
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode partition = removeElements(ListNode.createList(new int[]{
                1,1}),1);
        System.out.println(partition);
    }
}
